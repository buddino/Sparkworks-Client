# IntelligenceapicontrollerApi

All URIs are relative to *https://api.sparkworks.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST**](IntelligenceapicontrollerApi.md#addUsingPOST) | **POST** /v1/intelligence | add
[**deleteUsingDELETE**](IntelligenceapicontrollerApi.md#deleteUsingDELETE) | **DELETE** /v1/intelligence/{intelligenceId} | delete
[**getUsingGET**](IntelligenceapicontrollerApi.md#getUsingGET) | **GET** /v1/intelligence/{intelligenceId} | get
[**listUsingGET**](IntelligenceapicontrollerApi.md#listUsingGET) | **GET** /v1/intelligence | list
[**updateUsingPOST**](IntelligenceapicontrollerApi.md#updateUsingPOST) | **POST** /v1/intelligence/{intelligenceId} | update


<a name="addUsingPOST"></a>
# **addUsingPOST**
> IntelligenceDTO addUsingPOST(intelligenceDTO)

add

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntelligenceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntelligenceapicontrollerApi apiInstance = new IntelligenceapicontrollerApi();
IntelligenceDTO intelligenceDTO = new IntelligenceDTO(); // IntelligenceDTO | intelligenceDTO
try {
    IntelligenceDTO result = apiInstance.addUsingPOST(intelligenceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntelligenceapicontrollerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intelligenceDTO** | [**IntelligenceDTO**](IntelligenceDTO.md)| intelligenceDTO |

### Return type

[**IntelligenceDTO**](IntelligenceDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> IntelligenceDTO deleteUsingDELETE(intelligenceId)

delete

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntelligenceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntelligenceapicontrollerApi apiInstance = new IntelligenceapicontrollerApi();
Long intelligenceId = 789L; // Long | intelligenceId
try {
    IntelligenceDTO result = apiInstance.deleteUsingDELETE(intelligenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntelligenceapicontrollerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intelligenceId** | **Long**| intelligenceId |

### Return type

[**IntelligenceDTO**](IntelligenceDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUsingGET"></a>
# **getUsingGET**
> IntelligenceDTO getUsingGET(intelligenceId)

get

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntelligenceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntelligenceapicontrollerApi apiInstance = new IntelligenceapicontrollerApi();
Long intelligenceId = 789L; // Long | intelligenceId
try {
    IntelligenceDTO result = apiInstance.getUsingGET(intelligenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntelligenceapicontrollerApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intelligenceId** | **Long**| intelligenceId |

### Return type

[**IntelligenceDTO**](IntelligenceDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listUsingGET"></a>
# **listUsingGET**
> IntelligenceListDTO listUsingGET()

list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntelligenceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntelligenceapicontrollerApi apiInstance = new IntelligenceapicontrollerApi();
try {
    IntelligenceListDTO result = apiInstance.listUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntelligenceapicontrollerApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntelligenceListDTO**](IntelligenceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUsingPOST"></a>
# **updateUsingPOST**
> IntelligenceDTO updateUsingPOST(intelligenceId, intelligenceDTO)

update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntelligenceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntelligenceapicontrollerApi apiInstance = new IntelligenceapicontrollerApi();
Long intelligenceId = 789L; // Long | intelligenceId
IntelligenceDTO intelligenceDTO = new IntelligenceDTO(); // IntelligenceDTO | intelligenceDTO
try {
    IntelligenceDTO result = apiInstance.updateUsingPOST(intelligenceId, intelligenceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntelligenceapicontrollerApi#updateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intelligenceId** | **Long**| intelligenceId |
 **intelligenceDTO** | [**IntelligenceDTO**](IntelligenceDTO.md)| intelligenceDTO |

### Return type

[**IntelligenceDTO**](IntelligenceDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

