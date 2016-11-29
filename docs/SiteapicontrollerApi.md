# SiteapicontrollerApi

All URIs are relative to *https://api.sparkworks.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingDELETE1**](SiteapicontrollerApi.md#deleteUsingDELETE1) | **DELETE** /v1/location/site/{siteId} | delete
[**getUsingGET2**](SiteapicontrollerApi.md#getUsingGET2) | **GET** /v1/location/site/{siteId} | get
[**listUsingGET2**](SiteapicontrollerApi.md#listUsingGET2) | **GET** /v1/location/site | list
[**postUsingPOST**](SiteapicontrollerApi.md#postUsingPOST) | **POST** /v1/location/site | post
[**updateUsingPOST1**](SiteapicontrollerApi.md#updateUsingPOST1) | **POST** /v1/location/site/{siteId} | update


<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> SiteDTO deleteUsingDELETE1(siteId)

delete

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SiteapicontrollerApi apiInstance = new SiteapicontrollerApi();
Long siteId = 789L; // Long | siteId
try {
    SiteDTO result = apiInstance.deleteUsingDELETE1(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteapicontrollerApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |

### Return type

[**SiteDTO**](SiteDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUsingGET2"></a>
# **getUsingGET2**
> SiteDTO getUsingGET2(siteId)

get

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SiteapicontrollerApi apiInstance = new SiteapicontrollerApi();
Long siteId = 789L; // Long | siteId
try {
    SiteDTO result = apiInstance.getUsingGET2(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteapicontrollerApi#getUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |

### Return type

[**SiteDTO**](SiteDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listUsingGET2"></a>
# **listUsingGET2**
> SiteListDTO listUsingGET2()

list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SiteapicontrollerApi apiInstance = new SiteapicontrollerApi();
try {
    SiteListDTO result = apiInstance.listUsingGET2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteapicontrollerApi#listUsingGET2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SiteListDTO**](SiteListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="postUsingPOST"></a>
# **postUsingPOST**
> SiteDTO postUsingPOST(siteDTO)

post

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SiteapicontrollerApi apiInstance = new SiteapicontrollerApi();
SiteDTO siteDTO = new SiteDTO(); // SiteDTO | siteDTO
try {
    SiteDTO result = apiInstance.postUsingPOST(siteDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteapicontrollerApi#postUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteDTO** | [**SiteDTO**](SiteDTO.md)| siteDTO |

### Return type

[**SiteDTO**](SiteDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUsingPOST1"></a>
# **updateUsingPOST1**
> SiteDTO updateUsingPOST1(siteId, siteDTO)

update

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SiteapicontrollerApi apiInstance = new SiteapicontrollerApi();
Long siteId = 789L; // Long | siteId
SiteDTO siteDTO = new SiteDTO(); // SiteDTO | siteDTO
try {
    SiteDTO result = apiInstance.updateUsingPOST1(siteId, siteDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteapicontrollerApi#updateUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |
 **siteDTO** | [**SiteDTO**](SiteDTO.md)| siteDTO |

### Return type

[**SiteDTO**](SiteDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

