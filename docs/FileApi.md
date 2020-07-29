# FileApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1FilesPdfFileIDDelete**](FileApi.md#v1FilesPdfFileIDDelete) | **DELETE** /v1/files/pdf/{fileID} | 
[**v1FilesPdfFileIDFileGet**](FileApi.md#v1FilesPdfFileIDFileGet) | **GET** /v1/files/pdf/{fileID}/file | 
[**v1FilesPdfFileIDFilePut**](FileApi.md#v1FilesPdfFileIDFilePut) | **PUT** /v1/files/pdf/{fileID}/file | 
[**v1FilesPdfFileIDGet**](FileApi.md#v1FilesPdfFileIDGet) | **GET** /v1/files/pdf/{fileID} | 
[**v1FilesPdfFileIDPut**](FileApi.md#v1FilesPdfFileIDPut) | **PUT** /v1/files/pdf/{fileID} | 
[**v1FilesPdfFileIDVersionsVersionGet**](FileApi.md#v1FilesPdfFileIDVersionsVersionGet) | **GET** /v1/files/pdf/{fileID}/versions/{version} | 
[**v1FilesPdfGet**](FileApi.md#v1FilesPdfGet) | **GET** /v1/files/pdf | 
[**v1FilesPdfPost**](FileApi.md#v1FilesPdfPost) | **POST** /v1/files/pdf | 

<a name="v1FilesPdfFileIDDelete"></a>
# **v1FilesPdfFileIDDelete**
> v1FilesPdfFileIDDelete(fileID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
try {
    apiInstance.v1FilesPdfFileIDDelete(fileID);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]

### Return type

null (empty response body)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1FilesPdfFileIDFileGet"></a>
# **v1FilesPdfFileIDFileGet**
> File v1FilesPdfFileIDFileGet(fileID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
try {
    File result = apiInstance.v1FilesPdfFileIDFileGet(fileID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDFileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]

### Return type

[**File**](File.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="v1FilesPdfFileIDFilePut"></a>
# **v1FilesPdfFileIDFilePut**
> PDFFullFileInfoDTO v1FilesPdfFileIDFilePut(fileID, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
Object body = null; // Object | 
try {
    PDFFullFileInfoDTO result = apiInstance.v1FilesPdfFileIDFilePut(fileID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDFilePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]
 **body** | **Object**|  | [optional]

### Return type

[**PDFFullFileInfoDTO**](PDFFullFileInfoDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/pdf
 - **Accept**: application/json

<a name="v1FilesPdfFileIDGet"></a>
# **v1FilesPdfFileIDGet**
> PDFFullFileInfoDTO v1FilesPdfFileIDGet(fileID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
try {
    PDFFullFileInfoDTO result = apiInstance.v1FilesPdfFileIDGet(fileID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]

### Return type

[**PDFFullFileInfoDTO**](PDFFullFileInfoDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1FilesPdfFileIDPut"></a>
# **v1FilesPdfFileIDPut**
> PDFFullFileInfoDTO v1FilesPdfFileIDPut(fileID, file, name, _public)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
File file = new File("file_example"); // File | 
String name = "name_example"; // String | 
Boolean _public = true; // Boolean | 
try {
    PDFFullFileInfoDTO result = apiInstance.v1FilesPdfFileIDPut(fileID, file, name, _public);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]
 **file** | **File**|  | [optional]
 **name** | **String**|  | [optional]
 **_public** | **Boolean**|  | [optional]

### Return type

[**PDFFullFileInfoDTO**](PDFFullFileInfoDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="v1FilesPdfFileIDVersionsVersionGet"></a>
# **v1FilesPdfFileIDVersionsVersionGet**
> File v1FilesPdfFileIDVersionsVersionGet(fileID, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
Long fileID = 789L; // Long | File id
Integer version = 56; // Integer | File version, will clamp to first or latest if not present.
try {
    File result = apiInstance.v1FilesPdfFileIDVersionsVersionGet(fileID, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfFileIDVersionsVersionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **Long**| File id | [enum: ]
 **version** | **Integer**| File version, will clamp to first or latest if not present. | [enum: ]

### Return type

[**File**](File.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="v1FilesPdfGet"></a>
# **v1FilesPdfGet**
> PDFFileInfosDTO v1FilesPdfGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
try {
    PDFFileInfosDTO result = apiInstance.v1FilesPdfGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PDFFileInfosDTO**](PDFFileInfosDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1FilesPdfPost"></a>
# **v1FilesPdfPost**
> PDFFullFileInfoDTO v1FilesPdfPost(file, name, _public)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
File file = new File("file_example"); // File | 
String name = "name_example"; // String | 
Boolean _public = true; // Boolean | 
try {
    PDFFullFileInfoDTO result = apiInstance.v1FilesPdfPost(file, name, _public);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#v1FilesPdfPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **name** | **String**|  | [optional]
 **_public** | **Boolean**|  | [optional]

### Return type

[**PDFFullFileInfoDTO**](PDFFullFileInfoDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

