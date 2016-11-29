# ResourceapicontrollerApi

All URIs are relative to *https://api.sparkworks.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addResourcePropertyUsingPOST**](ResourceapicontrollerApi.md#addResourcePropertyUsingPOST) | **POST** /v1/resource/{resourceId}/property/add | addResourceProperty
[**addResourceUsingPOST**](ResourceapicontrollerApi.md#addResourceUsingPOST) | **POST** /v1/resource | addResource
[**addSiteResourcesUsingPOST**](ResourceapicontrollerApi.md#addSiteResourcesUsingPOST) | **POST** /v1/location/site/{siteId}/resource/add | addSiteResources
[**addTagUsingPOST**](ResourceapicontrollerApi.md#addTagUsingPOST) | **POST** /v1/resource/{resourceId}/tag/add | addTag
[**deleteSiteResourcesUsingPOST**](ResourceapicontrollerApi.md#deleteSiteResourcesUsingPOST) | **POST** /v1/location/site/{siteId}/resource/remove | deleteSiteResources
[**getTagsUsingGET**](ResourceapicontrollerApi.md#getTagsUsingGET) | **GET** /v1/resource/{resourceId}/tag | getTags
[**getUsingGET1**](ResourceapicontrollerApi.md#getUsingGET1) | **GET** /v1/resource/{id} | get
[**listResourcePropertiesUsingGET**](ResourceapicontrollerApi.md#listResourcePropertiesUsingGET) | **GET** /v1/resource/{resourceId}/property | listResourceProperties
[**listSiteResourcesUsingGET**](ResourceapicontrollerApi.md#listSiteResourcesUsingGET) | **GET** /v1/location/site/{siteId}/resource | listSiteResources
[**listUsingGET1**](ResourceapicontrollerApi.md#listUsingGET1) | **GET** /v1/resource | list
[**removeResourcePropertyUsingPOST**](ResourceapicontrollerApi.md#removeResourcePropertyUsingPOST) | **POST** /v1/resource/{resourceId}/property/remove | removeResourceProperty
[**removeTagUsingPOST**](ResourceapicontrollerApi.md#removeTagUsingPOST) | **POST** /v1/resource/{resourceId}/tag/remove | removeTag


<a name="addResourcePropertyUsingPOST"></a>
# **addResourcePropertyUsingPOST**
> ResourcePropertyListDTO addResourcePropertyUsingPOST(resourceId, resourcePropertyListDTO)

addResourceProperty

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
ResourcePropertyListDTO resourcePropertyListDTO = new ResourcePropertyListDTO(); // ResourcePropertyListDTO | resourcePropertyListDTO
try {
    ResourcePropertyListDTO result = apiInstance.addResourcePropertyUsingPOST(resourceId, resourcePropertyListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#addResourcePropertyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |
 **resourcePropertyListDTO** | [**ResourcePropertyListDTO**](ResourcePropertyListDTO.md)| resourcePropertyListDTO |

### Return type

[**ResourcePropertyListDTO**](ResourcePropertyListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addResourceUsingPOST"></a>
# **addResourceUsingPOST**
> ResourceListDTO addResourceUsingPOST(resourceDTO)

addResource

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
ResourceDTO resourceDTO = new ResourceDTO(); // ResourceDTO | resourceDTO
try {
    ResourceListDTO result = apiInstance.addResourceUsingPOST(resourceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#addResourceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceDTO** | [**ResourceDTO**](ResourceDTO.md)| resourceDTO |

### Return type

[**ResourceListDTO**](ResourceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addSiteResourcesUsingPOST"></a>
# **addSiteResourcesUsingPOST**
> ResourceListDTO addSiteResourcesUsingPOST(siteId, resourceListDTO)

addSiteResources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long siteId = 789L; // Long | siteId
ResourceListDTO resourceListDTO = new ResourceListDTO(); // ResourceListDTO | resourceListDTO
try {
    ResourceListDTO result = apiInstance.addSiteResourcesUsingPOST(siteId, resourceListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#addSiteResourcesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |
 **resourceListDTO** | [**ResourceListDTO**](ResourceListDTO.md)| resourceListDTO |

### Return type

[**ResourceListDTO**](ResourceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addTagUsingPOST"></a>
# **addTagUsingPOST**
> ResourceTagListDTO addTagUsingPOST(resourceId, resourceTagListDTO)

addTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
ResourceTagListDTO resourceTagListDTO = new ResourceTagListDTO(); // ResourceTagListDTO | resourceTagListDTO
try {
    ResourceTagListDTO result = apiInstance.addTagUsingPOST(resourceId, resourceTagListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#addTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |
 **resourceTagListDTO** | [**ResourceTagListDTO**](ResourceTagListDTO.md)| resourceTagListDTO |

### Return type

[**ResourceTagListDTO**](ResourceTagListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteSiteResourcesUsingPOST"></a>
# **deleteSiteResourcesUsingPOST**
> ResourceListDTO deleteSiteResourcesUsingPOST(siteId, resourceListDTO)

deleteSiteResources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long siteId = 789L; // Long | siteId
ResourceListDTO resourceListDTO = new ResourceListDTO(); // ResourceListDTO | resourceListDTO
try {
    ResourceListDTO result = apiInstance.deleteSiteResourcesUsingPOST(siteId, resourceListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#deleteSiteResourcesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |
 **resourceListDTO** | [**ResourceListDTO**](ResourceListDTO.md)| resourceListDTO |

### Return type

[**ResourceListDTO**](ResourceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getTagsUsingGET"></a>
# **getTagsUsingGET**
> ResourceTagListDTO getTagsUsingGET(resourceId)

getTags

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
try {
    ResourceTagListDTO result = apiInstance.getTagsUsingGET(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#getTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |

### Return type

[**ResourceTagListDTO**](ResourceTagListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUsingGET1"></a>
# **getUsingGET1**
> ResourceDTO getUsingGET1(id)

get

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long id = 789L; // Long | id
try {
    ResourceDTO result = apiInstance.getUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ResourceDTO**](ResourceDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listResourcePropertiesUsingGET"></a>
# **listResourcePropertiesUsingGET**
> ResourcePropertyListDTO listResourcePropertiesUsingGET(resourceId)

listResourceProperties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
try {
    ResourcePropertyListDTO result = apiInstance.listResourcePropertiesUsingGET(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#listResourcePropertiesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |

### Return type

[**ResourcePropertyListDTO**](ResourcePropertyListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listSiteResourcesUsingGET"></a>
# **listSiteResourcesUsingGET**
> ResourceListDTO listSiteResourcesUsingGET(siteId)

listSiteResources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long siteId = 789L; // Long | siteId
try {
    ResourceListDTO result = apiInstance.listSiteResourcesUsingGET(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#listSiteResourcesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| siteId |

### Return type

[**ResourceListDTO**](ResourceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listUsingGET1"></a>
# **listUsingGET1**
> ResourceListDTO listUsingGET1(uri, tag, favorites, resourceType)

list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
String uri = "uri_example"; // String | uri
String tag = "tag_example"; // String | tag
Boolean favorites = false; // Boolean | favorites
String resourceType = "resourceType_example"; // String | resourceType
try {
    ResourceListDTO result = apiInstance.listUsingGET1(uri, tag, favorites, resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#listUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**| uri | [optional]
 **tag** | **String**| tag | [optional]
 **favorites** | **Boolean**| favorites | [optional] [default to false]
 **resourceType** | **String**| resourceType | [optional]

### Return type

[**ResourceListDTO**](ResourceListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="removeResourcePropertyUsingPOST"></a>
# **removeResourcePropertyUsingPOST**
> ResourcePropertyListDTO removeResourcePropertyUsingPOST(resourceId, resourcePropertyListDTO)

removeResourceProperty

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
ResourcePropertyListDTO resourcePropertyListDTO = new ResourcePropertyListDTO(); // ResourcePropertyListDTO | resourcePropertyListDTO
try {
    ResourcePropertyListDTO result = apiInstance.removeResourcePropertyUsingPOST(resourceId, resourcePropertyListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#removeResourcePropertyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |
 **resourcePropertyListDTO** | [**ResourcePropertyListDTO**](ResourcePropertyListDTO.md)| resourcePropertyListDTO |

### Return type

[**ResourcePropertyListDTO**](ResourcePropertyListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="removeTagUsingPOST"></a>
# **removeTagUsingPOST**
> ResourceTagListDTO removeTagUsingPOST(resourceId, resourceTagListDTO)

removeTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ResourceapicontrollerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResourceapicontrollerApi apiInstance = new ResourceapicontrollerApi();
Long resourceId = 789L; // Long | resourceId
ResourceTagListDTO resourceTagListDTO = new ResourceTagListDTO(); // ResourceTagListDTO | resourceTagListDTO
try {
    ResourceTagListDTO result = apiInstance.removeTagUsingPOST(resourceId, resourceTagListDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceapicontrollerApi#removeTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**| resourceId |
 **resourceTagListDTO** | [**ResourceTagListDTO**](ResourceTagListDTO.md)| resourceTagListDTO |

### Return type

[**ResourceTagListDTO**](ResourceTagListDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

