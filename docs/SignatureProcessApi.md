# SignatureProcessApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1SignatureProcessPdfGet**](SignatureProcessApi.md#v1SignatureProcessPdfGet) | **GET** /v1/signature-process/pdf | 
[**v1SignatureProcessPdfPost**](SignatureProcessApi.md#v1SignatureProcessPdfPost) | **POST** /v1/signature-process/pdf | 
[**v1SignatureProcessPdfProcessIDDelete**](SignatureProcessApi.md#v1SignatureProcessPdfProcessIDDelete) | **DELETE** /v1/signature-process/pdf/{processID} | 
[**v1SignatureProcessPdfProcessIDGet**](SignatureProcessApi.md#v1SignatureProcessPdfProcessIDGet) | **GET** /v1/signature-process/pdf/{processID} | 
[**v1SignatureProcessPdfProcessIDIdentitiesGet**](SignatureProcessApi.md#v1SignatureProcessPdfProcessIDIdentitiesGet) | **GET** /v1/signature-process/pdf/{processID}/identities | 
[**v1SignatureProcessPdfProcessIDInvitePost**](SignatureProcessApi.md#v1SignatureProcessPdfProcessIDInvitePost) | **POST** /v1/signature-process/pdf/{processID}/invite | 
[**v1SignatureSignPdfPut**](SignatureProcessApi.md#v1SignatureSignPdfPut) | **PUT** /v1/signature/sign/pdf | 

<a name="v1SignatureProcessPdfGet"></a>
# **v1SignatureProcessPdfGet**
> PDFSignatureProcessesAvailableDTO v1SignatureProcessPdfGet(permission)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
GroupPermission permission = new GroupPermission(); // GroupPermission | The minimal permission of the Signature Process
try {
    PDFSignatureProcessesAvailableDTO result = apiInstance.v1SignatureProcessPdfGet(permission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | [**GroupPermission**](.md)| The minimal permission of the Signature Process | [optional]

### Return type

[**PDFSignatureProcessesAvailableDTO**](PDFSignatureProcessesAvailableDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1SignatureProcessPdfPost"></a>
# **v1SignatureProcessPdfPost**
> PDFSignatureProcessDTO v1SignatureProcessPdfPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
PDFSignatureProcessRequestDTO body = new PDFSignatureProcessRequestDTO(); // PDFSignatureProcessRequestDTO | 
try {
    PDFSignatureProcessDTO result = apiInstance.v1SignatureProcessPdfPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PDFSignatureProcessRequestDTO**](PDFSignatureProcessRequestDTO.md)|  | [optional]

### Return type

[**PDFSignatureProcessDTO**](PDFSignatureProcessDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1SignatureProcessPdfProcessIDDelete"></a>
# **v1SignatureProcessPdfProcessIDDelete**
> v1SignatureProcessPdfProcessIDDelete(processID, revertFile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
Long processID = 789L; // Long | The id of the signature process
Boolean revertFile = true; // Boolean | If this should revert the operation, will ignore keep if true and will revert the file.
try {
    apiInstance.v1SignatureProcessPdfProcessIDDelete(processID, revertFile);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfProcessIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processID** | **Long**| The id of the signature process | [enum: ]
 **revertFile** | **Boolean**| If this should revert the operation, will ignore keep if true and will revert the file. | [optional]

### Return type

null (empty response body)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1SignatureProcessPdfProcessIDGet"></a>
# **v1SignatureProcessPdfProcessIDGet**
> PDFSignatureProcessDTO v1SignatureProcessPdfProcessIDGet(processID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
Long processID = 789L; // Long | The id of the signature process
try {
    PDFSignatureProcessDTO result = apiInstance.v1SignatureProcessPdfProcessIDGet(processID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfProcessIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processID** | **Long**| The id of the signature process | [enum: ]

### Return type

[**PDFSignatureProcessDTO**](PDFSignatureProcessDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1SignatureProcessPdfProcessIDIdentitiesGet"></a>
# **v1SignatureProcessPdfProcessIDIdentitiesGet**
> AccessibleIdentities v1SignatureProcessPdfProcessIDIdentitiesGet(processID, permission)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
Long processID = 789L; // Long | The id of the signature process
GroupPermission permission = new GroupPermission(); // GroupPermission | The minimal permission of the Signature Process
try {
    AccessibleIdentities result = apiInstance.v1SignatureProcessPdfProcessIDIdentitiesGet(processID, permission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfProcessIDIdentitiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processID** | **Long**| The id of the signature process | [enum: ]
 **permission** | [**GroupPermission**](.md)| The minimal permission of the Signature Process | [optional]

### Return type

[**AccessibleIdentities**](AccessibleIdentities.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1SignatureProcessPdfProcessIDInvitePost"></a>
# **v1SignatureProcessPdfProcessIDInvitePost**
> EmailInviteResponse v1SignatureProcessPdfProcessIDInvitePost(processID, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
Long processID = 789L; // Long | The id of the signature process
EmailInvite body = new EmailInvite(); // EmailInvite | Requests an invitation email to sign a signature process
try {
    EmailInviteResponse result = apiInstance.v1SignatureProcessPdfProcessIDInvitePost(processID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureProcessPdfProcessIDInvitePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processID** | **Long**| The id of the signature process | [enum: ]
 **body** | [**EmailInvite**](EmailInvite.md)| Requests an invitation email to sign a signature process | [optional]

### Return type

[**EmailInviteResponse**](EmailInviteResponse.md)

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
//import io.swagger.client.api.SignatureProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

SignatureProcessApi apiInstance = new SignatureProcessApi();
PDFSignatureProcessSignDTO body = new PDFSignatureProcessSignDTO(); // PDFSignatureProcessSignDTO | Sign all assigned slots in document, or sign a single unassigned one.
try {
    PDFSignatureProcessDTO result = apiInstance.v1SignatureSignPdfPut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignatureProcessApi#v1SignatureSignPdfPut");
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

