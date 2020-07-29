# RecoverApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RecoverLoginPost**](RecoverApi.md#v1RecoverLoginPost) | **POST** /v1/recover/login | 
[**v1RecoverLoginValidatePost**](RecoverApi.md#v1RecoverLoginValidatePost) | **POST** /v1/recover/login/validate | 

<a name="v1RecoverLoginPost"></a>
# **v1RecoverLoginPost**
> EmailResponse v1RecoverLoginPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecoverApi;


RecoverApi apiInstance = new RecoverApi();
LoginRecoverRequestEmailDTO body = new LoginRecoverRequestEmailDTO(); // LoginRecoverRequestEmailDTO | 
try {
    EmailResponse result = apiInstance.v1RecoverLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecoverApi#v1RecoverLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRecoverRequestEmailDTO**](LoginRecoverRequestEmailDTO.md)|  | [optional]

### Return type

[**EmailResponse**](EmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1RecoverLoginValidatePost"></a>
# **v1RecoverLoginValidatePost**
> v1RecoverLoginValidatePost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecoverApi;


RecoverApi apiInstance = new RecoverApi();
LoginRecoverValidateRequestDTO body = new LoginRecoverValidateRequestDTO(); // LoginRecoverValidateRequestDTO | 
try {
    apiInstance.v1RecoverLoginValidatePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecoverApi#v1RecoverLoginValidatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRecoverValidateRequestDTO**](LoginRecoverValidateRequestDTO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

