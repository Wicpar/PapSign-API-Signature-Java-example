# MemoryApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1MemorySignersGet**](MemoryApi.md#v1MemorySignersGet) | **GET** /v1/memory/signers | 
[**v1MemorySignersPost**](MemoryApi.md#v1MemorySignersPost) | **POST** /v1/memory/signers | 
[**v1MemorySignersSignerDelete**](MemoryApi.md#v1MemorySignersSignerDelete) | **DELETE** /v1/memory/signers/{signer} | 

<a name="v1MemorySignersGet"></a>
# **v1MemorySignersGet**
> Signers v1MemorySignersGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MemoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

MemoryApi apiInstance = new MemoryApi();
try {
    Signers result = apiInstance.v1MemorySignersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryApi#v1MemorySignersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Signers**](Signers.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1MemorySignersPost"></a>
# **v1MemorySignersPost**
> Signers v1MemorySignersPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MemoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

MemoryApi apiInstance = new MemoryApi();
Signer body = new Signer(); // Signer | The signer descriptor
try {
    Signers result = apiInstance.v1MemorySignersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryApi#v1MemorySignersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Signer**](Signer.md)| The signer descriptor | [optional]

### Return type

[**Signers**](Signers.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1MemorySignersSignerDelete"></a>
# **v1MemorySignersSignerDelete**
> Signers v1MemorySignersSignerDelete(signer)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MemoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

MemoryApi apiInstance = new MemoryApi();
String signer = "signer_example"; // String | Signer email
try {
    Signers result = apiInstance.v1MemorySignersSignerDelete(signer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryApi#v1MemorySignersSignerDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signer** | **String**| Signer email |

### Return type

[**Signers**](Signers.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

