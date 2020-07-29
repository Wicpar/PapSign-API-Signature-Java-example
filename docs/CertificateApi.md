# CertificateApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CertificateCreatePost**](CertificateApi.md#v1CertificateCreatePost) | **POST** /v1/certificate/create | 

<a name="v1CertificateCreatePost"></a>
# **v1CertificateCreatePost**
> EncodedCertificateDTO v1CertificateCreatePost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

CertificateApi apiInstance = new CertificateApi();
RequestCertificateDTO body = new RequestCertificateDTO(); // RequestCertificateDTO | Creates a certificate with specified identity id, public key, and the validity in seconds
try {
    EncodedCertificateDTO result = apiInstance.v1CertificateCreatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#v1CertificateCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestCertificateDTO**](RequestCertificateDTO.md)| Creates a certificate with specified identity id, public key, and the validity in seconds | [optional]

### Return type

[**EncodedCertificateDTO**](EncodedCertificateDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

