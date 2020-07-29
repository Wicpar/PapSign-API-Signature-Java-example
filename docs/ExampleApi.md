# ExampleApi

All URIs are relative to *https://api.papsign.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ExamplesPdfSignPost**](ExampleApi.md#v1ExamplesPdfSignPost) | **POST** /v1/examples/pdf/sign | 

<a name="v1ExamplesPdfSignPost"></a>
# **v1ExamplesPdfSignPost**
> Boolean v1ExamplesPdfSignPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExampleApi;


ExampleApi apiInstance = new ExampleApi();
ExampleSignatureRequestDTO body = new ExampleSignatureRequestDTO(); // ExampleSignatureRequestDTO | 
try {
    Boolean result = apiInstance.v1ExamplesPdfSignPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExampleApi#v1ExamplesPdfSignPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExampleSignatureRequestDTO**](ExampleSignatureRequestDTO.md)|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

