# GatewayapicontrollerApi

All URIs are relative to *https://api.sparkworks.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGatewayUsingPOST**](GatewayapicontrollerApi.md#addGatewayUsingPOST) | **POST** /v1/gateway | addGateway
[**listGatewaysUsingGET**](GatewayapicontrollerApi.md#listGatewaysUsingGET) | **GET** /v1/gateway | listGateways


<a name="addGatewayUsingPOST"></a>
# **addGatewayUsingPOST**
> GatewayDTO addGatewayUsingPOST(gatewayDTO)

addGateway

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GatewayapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GatewayapicontrollerApi apiInstance = new GatewayapicontrollerApi();
GatewayDTO gatewayDTO = new GatewayDTO(); // GatewayDTO | gatewayDTO
try {
    GatewayDTO result = apiInstance.addGatewayUsingPOST(gatewayDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewayapicontrollerApi#addGatewayUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayDTO** | [**GatewayDTO**](GatewayDTO.md)| gatewayDTO |

### Return type

[**GatewayDTO**](GatewayDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listGatewaysUsingGET"></a>
# **listGatewaysUsingGET**
> GatewayListDTO listGatewaysUsingGET(name)

listGateways

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GatewayapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GatewayapicontrollerApi apiInstance = new GatewayapicontrollerApi();
String name = "name_example"; // String | name
try {
    GatewayListDTO result = apiInstance.listGatewaysUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewayapicontrollerApi#listGatewaysUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name | [optional]

### Return type

[**GatewayListDTO**](GatewayListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

