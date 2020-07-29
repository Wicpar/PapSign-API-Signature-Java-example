# SignatureApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1SignatureSignDatamatrixJpgPost**](SignatureApi.md#v1SignatureSignDatamatrixJpgPost) | **POST** /v1/signature/sign/datamatrix/jpg | 
[**v1SignatureSignDatamatrixPngPost**](SignatureApi.md#v1SignatureSignDatamatrixPngPost) | **POST** /v1/signature/sign/datamatrix/png | 
[**v1SignatureSignPdfPut**](SignatureApi.md#v1SignatureSignPdfPut) | **PUT** /v1/signature/sign/pdf | 
[**v1SignatureSignPost**](SignatureApi.md#v1SignatureSignPost) | **POST** /v1/signature/sign | 

<a name="v1SignatureSignDatamatrixJpgPost"></a>
# **v1SignatureSignDatamatrixJpgPost**
> byte[] v1SignatureSignDatamatrixJpgPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureApi apiInstance = new SignatureApi();
RequestSignatureDTO body = new RequestSignatureDTO(); // RequestSignatureDTO | Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block
try {
    byte[] result = apiInstance.v1SignatureSignDatamatrixJpgPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureApi#v1SignatureSignDatamatrixJpgPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestSignatureDTO**](RequestSignatureDTO.md)| Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block | [optional]

### Return type

**byte[]**

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1SignatureSignDatamatrixPngPost"></a>
# **v1SignatureSignDatamatrixPngPost**
> byte[] v1SignatureSignDatamatrixPngPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureApi apiInstance = new SignatureApi();
RequestSignatureDTO body = new RequestSignatureDTO(); // RequestSignatureDTO | Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block
try {
    byte[] result = apiInstance.v1SignatureSignDatamatrixPngPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureApi#v1SignatureSignDatamatrixPngPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestSignatureDTO**](RequestSignatureDTO.md)| Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block | [optional]

### Return type

**byte[]**

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1SignatureSignPdfPut"></a>
# **v1SignatureSignPdfPut**
> PDFSignatureProcessDTO v1SignatureSignPdfPut(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureApi apiInstance = new SignatureApi();
PDFSignatureProcessSignDTO body = new PDFSignatureProcessSignDTO(); // PDFSignatureProcessSignDTO | Sign all assigned slots in document, or sign a single unassigned one.
try {
    PDFSignatureProcessDTO result = apiInstance.v1SignatureSignPdfPut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureApi#v1SignatureSignPdfPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PDFSignatureProcessSignDTO**](PDFSignatureProcessSignDTO.md)| Sign all assigned slots in document, or sign a single unassigned one. | [optional]

### Return type

[**PDFSignatureProcessDTO**](PDFSignatureProcessDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1SignatureSignPost"></a>
# **v1SignatureSignPost**
> EncodedSignatureDTO v1SignatureSignPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureApi apiInstance = new SignatureApi();
RequestSignatureDTO body = new RequestSignatureDTO(); // RequestSignatureDTO | Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block
try {
    EncodedSignatureDTO result = apiInstance.v1SignatureSignPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureApi#v1SignatureSignPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestSignatureDTO**](RequestSignatureDTO.md)| Certificate request. UserData: KeySize: rsa key size, Key-value data, Text: optional null keyed field, displayed as text block | [optional]

### Return type

[**EncodedSignatureDTO**](EncodedSignatureDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

