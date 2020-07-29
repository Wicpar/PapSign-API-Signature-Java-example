# IdentityApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1IdentitiesMePermissionGet**](IdentityApi.md#v1IdentitiesMePermissionGet) | **GET** /v1/identities/me/{permission} | 

<a name="v1IdentitiesMePermissionGet"></a>
# **v1IdentitiesMePermissionGet**
> AccessibleIdentities v1IdentitiesMePermissionGet(permission)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

IdentityApi apiInstance = new IdentityApi();
GroupPermission permission = new GroupPermission(); // GroupPermission | The minimal permission of the Identities
try {
    AccessibleIdentities result = apiInstance.v1IdentitiesMePermissionGet(permission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#v1IdentitiesMePermissionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | [**GroupPermission**](.md)| The minimal permission of the Identities |

### Return type

[**AccessibleIdentities**](AccessibleIdentities.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

