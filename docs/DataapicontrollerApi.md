# DataapicontrollerApi

All URIs are relative to *https://api.sparkworks.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLatestSummaryUsingGET**](DataapicontrollerApi.md#getLatestSummaryUsingGET) | **GET** /v1/resource/{resourceId}/summary | getLatestSummary
[**getLatestValuesUsingGET**](DataapicontrollerApi.md#getLatestValuesUsingGET) | **GET** /v1/resource/{resourceId}/latest | getLatestValues
[**queryLatestResourcesDataUsingPOST**](DataapicontrollerApi.md#queryLatestResourcesDataUsingPOST) | **POST** /v1/resource/query/latest | queryLatestResourcesData
[**queryTimeRangeResourcesDataUsingPOST**](DataapicontrollerApi.md#queryTimeRangeResourcesDataUsingPOST) | **POST** /v1/resource/query/timerange | queryTimeRangeResourcesData


<a name="getLatestSummaryUsingGET"></a>
# **getLatestSummaryUsingGET**
> SummaryDTO getLatestSummaryUsingGET(resourceId)

getLatestSummary

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataapicontrollerApi apiInstance = new DataapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
try {
    SummaryDTO result = apiInstance.getLatestSummaryUsingGET(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataapicontrollerApi#getLatestSummaryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |

### Return type

[**SummaryDTO**](SummaryDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getLatestValuesUsingGET"></a>
# **getLatestValuesUsingGET**
> LatestDTO getLatestValuesUsingGET(resourceId)

getLatestValues

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataapicontrollerApi apiInstance = new DataapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
try {
    LatestDTO result = apiInstance.getLatestValuesUsingGET(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataapicontrollerApi#getLatestValuesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |

### Return type

[**LatestDTO**](LatestDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="queryLatestResourcesDataUsingPOST"></a>
# **queryLatestResourcesDataUsingPOST**
> QueryLatestResourceDataResultDTO queryLatestResourcesDataUsingPOST(queryLatestResourceDataDTO)

queryLatestResourcesData

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataapicontrollerApi apiInstance = new DataapicontrollerApi();
QueryLatestResourceDataDTO queryLatestResourceDataDTO = new QueryLatestResourceDataDTO(); // QueryLatestResourceDataDTO | queryLatestResourceDataDTO
try {
    QueryLatestResourceDataResultDTO result = apiInstance.queryLatestResourcesDataUsingPOST(queryLatestResourceDataDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataapicontrollerApi#queryLatestResourcesDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryLatestResourceDataDTO** | [**QueryLatestResourceDataDTO**](QueryLatestResourceDataDTO.md)| queryLatestResourceDataDTO |

### Return type

[**QueryLatestResourceDataResultDTO**](QueryLatestResourceDataResultDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="queryTimeRangeResourcesDataUsingPOST"></a>
# **queryTimeRangeResourcesDataUsingPOST**
> QueryTimeRangeResourceDataResultDTO queryTimeRangeResourcesDataUsingPOST(queryTimeRangeResourceDataDTO)

queryTimeRangeResourcesData

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataapicontrollerApi apiInstance = new DataapicontrollerApi();
QueryTimeRangeResourceDataDTO queryTimeRangeResourceDataDTO = new QueryTimeRangeResourceDataDTO(); // QueryTimeRangeResourceDataDTO | queryTimeRangeResourceDataDTO
try {
    QueryTimeRangeResourceDataResultDTO result = apiInstance.queryTimeRangeResourcesDataUsingPOST(queryTimeRangeResourceDataDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataapicontrollerApi#queryTimeRangeResourcesDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryTimeRangeResourceDataDTO** | [**QueryTimeRangeResourceDataDTO**](QueryTimeRangeResourceDataDTO.md)| queryTimeRangeResourceDataDTO |

### Return type

[**QueryTimeRangeResourceDataResultDTO**](QueryTimeRangeResourceDataResultDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

