# AccountApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountsEmailVerifyPost**](AccountApi.md#v1AccountsEmailVerifyPost) | **POST** /v1/accounts/email/verify | 
[**v1AccountsMeDelete**](AccountApi.md#v1AccountsMeDelete) | **DELETE** /v1/accounts/me | 
[**v1AccountsMeGet**](AccountApi.md#v1AccountsMeGet) | **GET** /v1/accounts/me | 
[**v1AccountsMePost**](AccountApi.md#v1AccountsMePost) | **POST** /v1/accounts/me | 

<a name="v1AccountsEmailVerifyPost"></a>
# **v1AccountsEmailVerifyPost**
> EmailResponse v1AccountsEmailVerifyPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
EmailVerify body = new EmailVerify(); // EmailVerify | Requests a verification email to proceed in the account creation
try {
    EmailResponse result = apiInstance.v1AccountsEmailVerifyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountsEmailVerifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailVerify**](EmailVerify.md)| Requests a verification email to proceed in the account creation | [optional]

### Return type

[**EmailResponse**](EmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1AccountsMeDelete"></a>
# **v1AccountsMeDelete**
> DeletionResult v1AccountsMeDelete()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

AccountApi apiInstance = new AccountApi();
try {
    DeletionResult result = apiInstance.v1AccountsMeDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountsMeDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeletionResult**](DeletionResult.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1AccountsMeGet"></a>
# **v1AccountsMeGet**
> AccountPrivateInfo v1AccountsMeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: papsign
OAuth papsign = (OAuth) defaultClient.getAuthentication("papsign");
papsign.setAccessToken("YOUR ACCESS TOKEN");

AccountApi apiInstance = new AccountApi();
try {
    AccountPrivateInfo result = apiInstance.v1AccountsMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountsMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountPrivateInfo**](AccountPrivateInfo.md)

### Authorization

[papsign](../README.md#papsign)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1AccountsMePost"></a>
# **v1AccountsMePost**
> AccountPrivateInfo v1AccountsMePost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
AccountCreate body = new AccountCreate(); // AccountCreate | Requests an account creation with validated email token sent by email.
try {
    AccountPrivateInfo result = apiInstance.v1AccountsMePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountsMePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountCreate**](AccountCreate.md)| Requests an account creation with validated email token sent by email. | [optional]

### Return type

[**AccountPrivateInfo**](AccountPrivateInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

