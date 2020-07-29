# OAuthApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1OauthClientsGet**](OAuthApi.md#v1OauthClientsGet) | **GET** /v1/oauth/clients | 
[**v1OauthClientsIdDelete**](OAuthApi.md#v1OauthClientsIdDelete) | **DELETE** /v1/oauth/clients/{id} | 
[**v1OauthClientsIdGet**](OAuthApi.md#v1OauthClientsIdGet) | **GET** /v1/oauth/clients/{id} | 
[**v1OauthClientsIdPut**](OAuthApi.md#v1OauthClientsIdPut) | **PUT** /v1/oauth/clients/{id} | 
[**v1OauthClientsIdSecretGet**](OAuthApi.md#v1OauthClientsIdSecretGet) | **GET** /v1/oauth/clients/{id}/secret | 
[**v1OauthClientsPost**](OAuthApi.md#v1OauthClientsPost) | **POST** /v1/oauth/clients | 
[**v1OauthClientsScopesAccessibleGet**](OAuthApi.md#v1OauthClientsScopesAccessibleGet) | **GET** /v1/oauth/clients/scopes/accessible | 

<a name="v1OauthClientsGet"></a>
# **v1OauthClientsGet**
> List&lt;OAuthClientDTO&gt; v1OauthClientsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
try {
    List<OAuthClientDTO> result = apiInstance.v1OauthClientsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OAuthClientDTO&gt;**](OAuthClientDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1OauthClientsIdDelete"></a>
# **v1OauthClientsIdDelete**
> v1OauthClientsIdDelete(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
UUID id = new UUID(); // UUID | ID of the OAuth Client
try {
    apiInstance.v1OauthClientsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| ID of the OAuth Client |

### Return type

null (empty response body)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1OauthClientsIdGet"></a>
# **v1OauthClientsIdGet**
> OAuthClientDTO v1OauthClientsIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
UUID id = new UUID(); // UUID | ID of the OAuth Client
try {
    OAuthClientDTO result = apiInstance.v1OauthClientsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| ID of the OAuth Client |

### Return type

[**OAuthClientDTO**](OAuthClientDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1OauthClientsIdPut"></a>
# **v1OauthClientsIdPut**
> OAuthClientDTO v1OauthClientsIdPut(id, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
UUID id = new UUID(); // UUID | ID of the OAuth Client
OAuthClientPutDTO body = new OAuthClientPutDTO(); // OAuthClientPutDTO | 
try {
    OAuthClientDTO result = apiInstance.v1OauthClientsIdPut(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| ID of the OAuth Client |
 **body** | [**OAuthClientPutDTO**](OAuthClientPutDTO.md)|  | [optional]

### Return type

[**OAuthClientDTO**](OAuthClientDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1OauthClientsIdSecretGet"></a>
# **v1OauthClientsIdSecretGet**
> String v1OauthClientsIdSecretGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
UUID id = new UUID(); // UUID | ID of the OAuth Client
try {
    String result = apiInstance.v1OauthClientsIdSecretGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsIdSecretGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| ID of the OAuth Client |

### Return type

**String**

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1OauthClientsPost"></a>
# **v1OauthClientsPost**
> OAuthClientDTO v1OauthClientsPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
CreateOAuthClientDTO body = new CreateOAuthClientDTO(); // CreateOAuthClientDTO | 
try {
    OAuthClientDTO result = apiInstance.v1OauthClientsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOAuthClientDTO**](CreateOAuthClientDTO.md)|  | [optional]

### Return type

[**OAuthClientDTO**](OAuthClientDTO.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1OauthClientsScopesAccessibleGet"></a>
# **v1OauthClientsScopesAccessibleGet**
> List&lt;OAuthScope&gt; v1OauthClientsScopesAccessibleGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
try {
    List<OAuthScope> result = apiInstance.v1OauthClientsScopesAccessibleGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#v1OauthClientsScopesAccessibleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OAuthScope&gt;**](OAuthScope.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

