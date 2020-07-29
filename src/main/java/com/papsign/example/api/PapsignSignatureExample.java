package com.papsign.example.api;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Pair;
import io.swagger.client.api.*;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.*;

import java.io.File;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class PapsignSignatureExample {

    static final String KEY = "public-key-here";
    static final String SECRET = "secret-here";
    static final String YOUR_EMAIL = "account-email-here";
    static File PDFFile = null;

    static {
        URL dir_url = ClassLoader.getSystemResource("EN.PDF");
        try {
            PDFFile = new File(dir_url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ApiException, InterruptedException {
        ApiClient client = new AuthProvider(KEY, SECRET).setupClientWithAuth();
        client.addDefaultHeader("Accept", "*/*");
        String token = ((OAuth) client.getAuthentication("papsign")).getAccessToken();
        AccountApi accountApi = new AccountApi(client);
        IdentityApi identityApi = new IdentityApi(client);
        SignatureApi signatureApi = new SignatureApi(client);
        FileApi fileApi = new FileApi(client);
        VerifyApi verifyApi = new VerifyApi(client);
        SignatureProcessApi signatureProcessApi = new SignatureProcessApi(client);
        System.out.println(accountApi.v1AccountsMeGet());

        AccessibleIdentities identities = identityApi.v1IdentitiesMePermissionGet(GroupPermission.USER);
        System.out.println(identities);
        // Usually there is only one identity, else you will get identities in identity groups which correspond to identities that belong to a specific entity
        // You can then filter based on if it is a personal identity, and it is usable for signature by a user
        IdentityInfo identityInfo = identities.getList().get(0).getIdentities().get(0);

        ////////////////////////////////////////////////////////////
        // How to create a printable signature
        {
            MapStringString signedData = new MapStringString();
            signedData.put("Key", "Value");

            byte[] pngBytes = signatureApi.v1SignatureSignDatamatrixPngPost(new RequestSignatureDTO().identityID(identityInfo.getUid().longValue()).keySize(2048).userData(signedData));
            DecodedDocumentDTO decodedDocumentDTO = verifyApi.v1VerificationVerifyDocumentPost(pngBytes);
            System.out.println(decodedDocumentDTO);
            // get standard signature decode results (one per image/page if pdf), get all signatures found in image, get the first one since we know there is only one
            DecodedSignatureDTO signature = decodedDocumentDTO.getStandard().get(0).getSignatures().get(0);
            // verify if it is valid and has the data. Other parameters like the date and signer can also be checked
            assert signature.isValid() && signature.getData().equals(signedData);

        }
        ////////////////////////////////////////////////////////////
        // How to create a pdf signature
        {
            // upload the file
            PDFFullFileInfoDTO pdfFullFileInfoDTO = fileApi.v1FilesPdfPost(PDFFile, "Test.pdf", false);
            System.out.println(pdfFullFileInfoDTO);
            //start signature process with one signer
            PDFSignatureProcessDTO pdfSignatureProcessDTO = signatureProcessApi.v1SignatureProcessPdfPost(
                    new PDFSignatureProcessRequestDTO()
                            .addSignersItem(
                                    new SignatureSlot() // add a signature slot, add more slots for multiple signers
                                            .addOneOfItem(
                                                    new SignatureSlotData()
                                                            .email(YOUR_EMAIL) // the signer must have this specific email, or another in the oneOf List, anyone in this list can sign the document, in none is specified cannot sign
                                            )
                            )
                            .file(pdfFullFileInfoDTO.getId())
                            .name(pdfFullFileInfoDTO.getName())
                            .keep(false) // do not keep once finished
            );
            System.out.println(pdfSignatureProcessDTO);
            // send email to invite users to sign the document
            EmailInviteResponse emailInviteResponse = signatureProcessApi.v1SignatureProcessPdfProcessIDInvitePost(pdfSignatureProcessDTO.getId(), new EmailInvite().email(YOUR_EMAIL));
            System.out.println(emailInviteResponse);
            assert emailInviteResponse.isSent(); // verify that it was successful, no false positives can occur
            // sign the pdf and update the dto for the changes
            pdfSignatureProcessDTO = signatureApi.v1SignatureSignPdfPut(new PDFSignatureProcessSignDTO().identityID(identityInfo.getUid().longValue()).processID(pdfSignatureProcessDTO.getId()));
            System.out.println(pdfSignatureProcessDTO);
            // verify that every body signed, you can poll every 5 minutes if you are waiting for others to sign.
            assert pdfSignatureProcessDTO.getSigners().stream().allMatch(info -> info.getDateSigned() != null);

            // if all the signers have signed, download the file

            File file = null;
            try {
                HashMap<String, String> headers = new HashMap<String, String>(1);
                headers.put("Authorization", "Bearer " + token);
                Call call = client.buildCall("/v1/files/pdf/" + pdfSignatureProcessDTO.getFile().getId() + "/file", "GET", new ArrayList<Pair>(), new ArrayList<Pair>(), null, headers, new HashMap<String, Object>(), new String[0], null);
                Type localVarReturnType = new TypeToken<File>() {
                }.getType();
                ApiResponse<File> resp = client.execute(call, localVarReturnType);
                file = resp.getData();
                System.out.println(file);
            } catch (ApiException e) {
                System.err.println(e.getResponseBody());
                e.printStackTrace();
            }
            assert file != null;
//            file = null; Generated code does not work due to awkward header generation
//            try {
//                file = fileApi.v1FilesPdfFileIDFileGet(pdfSignatureProcessDTO.getFile().getId());
//                System.out.println(file);
//            } catch (ApiException e) {
//                System.out.println(e.getResponseBody());
//                e.printStackTrace();
//            }
//            assert file != null;

            // delete the signature process

            try {
                HashMap<String, String> headers = new HashMap<String, String>(1);
                headers.put("Authorization", "Bearer " + token);
                ArrayList<Pair> query = new ArrayList<Pair>(1);
                query.add(new Pair("revertFile", "false"));
                Call call = client.buildCall("/v1/signature-process/pdf/" + pdfSignatureProcessDTO.getId(), "DELETE", query, new ArrayList<Pair>(), null, headers, new HashMap<String, Object>(), new String[0], null);
                ApiResponse<Object> resp = client.execute(call);
                System.err.println(resp.getStatusCode());
            } catch (ApiException e) {
                System.err.println(e.getResponseBody());
                e.printStackTrace();
            }
            // Generated code does not work due to awkward header generation
            // signatureProcessApi.v1SignatureProcessPdfProcessIDDelete(pdfSignatureProcessDTO.getId(), false /* should revert to before the signature, can be useful if you sign the same pdf often */);

            // delete the file, will return a 404 if keep was set to false in the signature process

            try {
                HashMap<String, String> headers = new HashMap<String, String>(1);
                headers.put("Authorization", "Bearer " + token);
                Call call = client.buildCall("/v1/files/pdf/" + pdfSignatureProcessDTO.getFile().getId(), "DELETE", new ArrayList<Pair>(), new ArrayList<Pair>(), null, headers, new HashMap<String, Object>(), new String[0], null);
                ApiResponse<Object> resp = client.execute(call);
                System.err.println(resp.getStatusCode());
            } catch (ApiException e) {
                System.err.println(e.getResponseBody());
            }
            // Generated code does not work due to awkward header generation
            // fileApi.v1FilesPdfFileIDDelete(pdfFullFileInfoDTO.getId());

            // (optional) verify the file if you want, can be done at a later date if necessary
            try {
                HashMap<String, String> headers = new HashMap<String, String>(1);
                headers.put("Authorization", "Bearer " + token);
                headers.put("Content-Type", "application/pdf");

                Call call = client.buildCall("/v1/verification/verify/document", "POST", new ArrayList<Pair>(), new ArrayList<Pair>(), file, headers, new HashMap<String, Object>() , new String[0], null);
                Type localVarReturnType = new TypeToken<DecodedDocumentDTO>() {
                }.getType();
                ApiResponse<DecodedDocumentDTO> resp = client.execute(call, localVarReturnType);
                DecodedDocumentDTO decodedDocumentDTO = resp.getData();

                // Generated code doesn't set the content type properly
                // DecodedDocumentDTO decodedDocumentDTO = verifyApi.v1VerificationVerifyDocumentPost(file);
                System.out.println(decodedDocumentDTO);

                // get standard signature decode results (one per image/page if pdf), get all signatures found in image, get the first one since we know there is only one
                DecodedSignatureDTO signature = decodedDocumentDTO.getPdf().getSlots().get(0).getSignature();
                assert signature.isValid() && signature.getCertificate().getIdentity().getEmail().equals(YOUR_EMAIL);
            } catch (ApiException e) {
                System.err.println(e.getResponseBody());
                e.printStackTrace();
            }
        }
    }
}


