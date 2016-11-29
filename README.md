# Sparkworks Swagger Java Client
## OAuth2 Configuration
Edit the account.yaml.template with your account information and rename to account.yaml

User Configurator.getApiClient() to retrieve the ApiClient configured with the access_token.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DataapicontrollerApi;

import java.io.File;
import java.util.*;

public class DataapicontrollerApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.sparkworks.net/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataapicontrollerApi* | [**getLatestSummaryUsingGET**](docs/DataapicontrollerApi.md#getLatestSummaryUsingGET) | **GET** /v1/resource/{resourceId}/summary | getLatestSummary
*DataapicontrollerApi* | [**getLatestValuesUsingGET**](docs/DataapicontrollerApi.md#getLatestValuesUsingGET) | **GET** /v1/resource/{resourceId}/latest | getLatestValues
*DataapicontrollerApi* | [**queryLatestResourcesDataUsingPOST**](docs/DataapicontrollerApi.md#queryLatestResourcesDataUsingPOST) | **POST** /v1/resource/query/latest | queryLatestResourcesData
*DataapicontrollerApi* | [**queryTimeRangeResourcesDataUsingPOST**](docs/DataapicontrollerApi.md#queryTimeRangeResourcesDataUsingPOST) | **POST** /v1/resource/query/timerange | queryTimeRangeResourcesData
*GatewayapicontrollerApi* | [**addGatewayUsingPOST**](docs/GatewayapicontrollerApi.md#addGatewayUsingPOST) | **POST** /v1/gateway | addGateway
*GatewayapicontrollerApi* | [**listGatewaysUsingGET**](docs/GatewayapicontrollerApi.md#listGatewaysUsingGET) | **GET** /v1/gateway | listGateways
*IntelligenceapicontrollerApi* | [**addUsingPOST**](docs/IntelligenceapicontrollerApi.md#addUsingPOST) | **POST** /v1/intelligence | add
*IntelligenceapicontrollerApi* | [**deleteUsingDELETE**](docs/IntelligenceapicontrollerApi.md#deleteUsingDELETE) | **DELETE** /v1/intelligence/{intelligenceId} | delete
*IntelligenceapicontrollerApi* | [**getUsingGET**](docs/IntelligenceapicontrollerApi.md#getUsingGET) | **GET** /v1/intelligence/{intelligenceId} | get
*IntelligenceapicontrollerApi* | [**listUsingGET**](docs/IntelligenceapicontrollerApi.md#listUsingGET) | **GET** /v1/intelligence | list
*IntelligenceapicontrollerApi* | [**updateUsingPOST**](docs/IntelligenceapicontrollerApi.md#updateUsingPOST) | **POST** /v1/intelligence/{intelligenceId} | update
*ResourceapicontrollerApi* | [**addResourcePropertyUsingPOST**](docs/ResourceapicontrollerApi.md#addResourcePropertyUsingPOST) | **POST** /v1/resource/{resourceId}/property/add | addResourceProperty
*ResourceapicontrollerApi* | [**addResourceUsingPOST**](docs/ResourceapicontrollerApi.md#addResourceUsingPOST) | **POST** /v1/resource | addResource
*ResourceapicontrollerApi* | [**addSiteResourcesUsingPOST**](docs/ResourceapicontrollerApi.md#addSiteResourcesUsingPOST) | **POST** /v1/location/site/{siteId}/resource/add | addSiteResources
*ResourceapicontrollerApi* | [**addTagUsingPOST**](docs/ResourceapicontrollerApi.md#addTagUsingPOST) | **POST** /v1/resource/{resourceId}/tag/add | addTag
*ResourceapicontrollerApi* | [**deleteSiteResourcesUsingPOST**](docs/ResourceapicontrollerApi.md#deleteSiteResourcesUsingPOST) | **POST** /v1/location/site/{siteId}/resource/remove | deleteSiteResources
*ResourceapicontrollerApi* | [**getTagsUsingGET**](docs/ResourceapicontrollerApi.md#getTagsUsingGET) | **GET** /v1/resource/{resourceId}/tag | getTags
*ResourceapicontrollerApi* | [**getUsingGET1**](docs/ResourceapicontrollerApi.md#getUsingGET1) | **GET** /v1/resource/{id} | get
*ResourceapicontrollerApi* | [**listResourcePropertiesUsingGET**](docs/ResourceapicontrollerApi.md#listResourcePropertiesUsingGET) | **GET** /v1/resource/{resourceId}/property | listResourceProperties
*ResourceapicontrollerApi* | [**listSiteResourcesUsingGET**](docs/ResourceapicontrollerApi.md#listSiteResourcesUsingGET) | **GET** /v1/location/site/{siteId}/resource | listSiteResources
*ResourceapicontrollerApi* | [**listUsingGET1**](docs/ResourceapicontrollerApi.md#listUsingGET1) | **GET** /v1/resource | list
*ResourceapicontrollerApi* | [**removeResourcePropertyUsingPOST**](docs/ResourceapicontrollerApi.md#removeResourcePropertyUsingPOST) | **POST** /v1/resource/{resourceId}/property/remove | removeResourceProperty
*ResourceapicontrollerApi* | [**removeTagUsingPOST**](docs/ResourceapicontrollerApi.md#removeTagUsingPOST) | **POST** /v1/resource/{resourceId}/tag/remove | removeTag
*SiteapicontrollerApi* | [**deleteUsingDELETE1**](docs/SiteapicontrollerApi.md#deleteUsingDELETE1) | **DELETE** /v1/location/site/{siteId} | delete
*SiteapicontrollerApi* | [**getUsingGET2**](docs/SiteapicontrollerApi.md#getUsingGET2) | **GET** /v1/location/site/{siteId} | get
*SiteapicontrollerApi* | [**listUsingGET2**](docs/SiteapicontrollerApi.md#listUsingGET2) | **GET** /v1/location/site | list
*SiteapicontrollerApi* | [**postUsingPOST**](docs/SiteapicontrollerApi.md#postUsingPOST) | **POST** /v1/location/site | post
*SiteapicontrollerApi* | [**updateUsingPOST1**](docs/SiteapicontrollerApi.md#updateUsingPOST1) | **POST** /v1/location/site/{siteId} | update


## Documentation for Models

 - [ActuatorDTO](docs/ActuatorDTO.md)
 - [Dequedouble](docs/Dequedouble.md)
 - [GatewayDTO](docs/GatewayDTO.md)
 - [GatewayListDTO](docs/GatewayListDTO.md)
 - [IntelligenceDTO](docs/IntelligenceDTO.md)
 - [IntelligenceListDTO](docs/IntelligenceListDTO.md)
 - [LatestDTO](docs/LatestDTO.md)
 - [QueryLatestResourceDataDTO](docs/QueryLatestResourceDataDTO.md)
 - [QueryLatestResourceDataResultDTO](docs/QueryLatestResourceDataResultDTO.md)
 - [QueryResourceDataCriteriaDTO](docs/QueryResourceDataCriteriaDTO.md)
 - [QueryTimeRangeResourceDataCriteriaDTO](docs/QueryTimeRangeResourceDataCriteriaDTO.md)
 - [QueryTimeRangeResourceDataDTO](docs/QueryTimeRangeResourceDataDTO.md)
 - [QueryTimeRangeResourceDataResultDTO](docs/QueryTimeRangeResourceDataResultDTO.md)
 - [ResourceDTO](docs/ResourceDTO.md)
 - [ResourceDataDTO](docs/ResourceDataDTO.md)
 - [ResourceListDTO](docs/ResourceListDTO.md)
 - [ResourcePropertyDTO](docs/ResourcePropertyDTO.md)
 - [ResourcePropertyListDTO](docs/ResourcePropertyListDTO.md)
 - [ResourceTagDTO](docs/ResourceTagDTO.md)
 - [ResourceTagListDTO](docs/ResourceTagListDTO.md)
 - [ShareDTO](docs/ShareDTO.md)
 - [SiteDTO](docs/SiteDTO.md)
 - [SiteListDTO](docs/SiteListDTO.md)
 - [SummaryDTO](docs/SummaryDTO.md)
 - [TriggerDTO](docs/TriggerDTO.md)
 - [UserDTO](docs/UserDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - read: read


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@sparkworks.net

