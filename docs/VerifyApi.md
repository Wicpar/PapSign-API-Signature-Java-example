# VerifyApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1VerificationVerifyDocumentPost**](VerifyApi.md#v1VerificationVerifyDocumentPost) | **POST** /v1/verification/verify/document | 

<a name="v1VerificationVerifyDocumentPost"></a>
# **v1VerificationVerifyDocumentPost**
> DecodedDocumentDTO v1VerificationVerifyDocumentPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VerifyApi;


VerifyApi apiInstance = new VerifyApi();
Object body = null; // Object | 
try {
    DecodedDocumentDTO result = apiInstance.v1VerificationVerifyDocumentPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#v1VerificationVerifyDocumentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

[**DecodedDocumentDTO**](DecodedDocumentDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: image/png, image/jpeg, application/pdf, application/octet-stream, multipart/form-data
 - **Accept**: application/json

<a name="v1VerificationVerifyDocumentPost"></a>
# **v1VerificationVerifyDocumentPost**
> DecodedDocumentDTO v1VerificationVerifyDocumentPost(file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VerifyApi;


VerifyApi apiInstance = new VerifyApi();
File file = new File("file_example"); // File | 
try {
    DecodedDocumentDTO result = apiInstance.v1VerificationVerifyDocumentPost(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#v1VerificationVerifyDocumentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]

### Return type

[**DecodedDocumentDTO**](DecodedDocumentDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: image/png, image/jpeg, application/pdf, application/octet-stream, multipart/form-data
 - **Accept**: application/json

