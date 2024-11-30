# SynonymizeApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**synonymizeDocumentPost**](SynonymizeApi.md#synonymizeDocumentPost) | **POST** /synonymize/document | Synonyize document |
| [**synonymizeHcGet**](SynonymizeApi.md#synonymizeHcGet) | **GET** /synonymize/hc | Health check for all synonymizer services. |
| [**synonymizeOcrPost**](SynonymizeApi.md#synonymizeOcrPost) | **POST** /synonymize/ocr | Synonymize scanned image or document |
| [**synonymizeTextPost**](SynonymizeApi.md#synonymizeTextPost) | **POST** /synonymize/text | Synonymize word |
| [**synonymizeTextRequestIdGet**](SynonymizeApi.md#synonymizeTextRequestIdGet) | **GET** /synonymize/text/{requestId} | Return text synonymizing status.  Also return list of synonyms if it was successful |
| [**synonymizeTextTrialPost**](SynonymizeApi.md#synonymizeTextTrialPost) | **POST** /synonymize/text/trial | Trial synonymize word |


<a id="synonymizeDocumentPost"></a>
# **synonymizeDocumentPost**
> StatusResponse synonymizeDocumentPost(synonymizeFileRequest)

Synonyize document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    SynonymizeFileRequest synonymizeFileRequest = new SynonymizeFileRequest(); // SynonymizeFileRequest | String in body of request, containing JSON with parameters for synonymizing.
    try {
      StatusResponse result = apiInstance.synonymizeDocumentPost(synonymizeFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeDocumentPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **synonymizeFileRequest** | [**SynonymizeFileRequest**](SynonymizeFileRequest.md)| String in body of request, containing JSON with parameters for synonymizing. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="synonymizeHcGet"></a>
# **synonymizeHcGet**
> HealthCheckResponse synonymizeHcGet()

Health check for all synonymizer services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.synonymizeHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeHcGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="synonymizeOcrPost"></a>
# **synonymizeOcrPost**
> StatusResponse synonymizeOcrPost(synonymizeOcrRequest)

Synonymize scanned image or document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    SynonymizeOcrRequest synonymizeOcrRequest = new SynonymizeOcrRequest(); // SynonymizeOcrRequest | String in body of request, containing JSON with parameters for synonymizing.
    try {
      StatusResponse result = apiInstance.synonymizeOcrPost(synonymizeOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeOcrPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **synonymizeOcrRequest** | [**SynonymizeOcrRequest**](SynonymizeOcrRequest.md)| String in body of request, containing JSON with parameters for synonymizing. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="synonymizeTextPost"></a>
# **synonymizeTextPost**
> StatusResponse synonymizeTextPost(synonymizeTextRequest)

Synonymize word

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    SynonymizeTextRequest synonymizeTextRequest = new SynonymizeTextRequest(); // SynonymizeTextRequest | String in body of request, containing JSON with parameters for synonymizing.
    try {
      StatusResponse result = apiInstance.synonymizeTextPost(synonymizeTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeTextPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **synonymizeTextRequest** | [**SynonymizeTextRequest**](SynonymizeTextRequest.md)| String in body of request, containing JSON with parameters for synonymizing. | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="synonymizeTextRequestIdGet"></a>
# **synonymizeTextRequestIdGet**
> SynonymizeTextResponse synonymizeTextRequestIdGet(requestId)

Return text synonymizing status.  Also return list of synonyms if it was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/text response
    try {
      SynonymizeTextResponse result = apiInstance.synonymizeTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeTextRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| GUID which got from /v3/rewriter/text response | |

### Return type

[**SynonymizeTextResponse**](SynonymizeTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="synonymizeTextTrialPost"></a>
# **synonymizeTextTrialPost**
> StatusResponse synonymizeTextTrialPost(synonymizeTextRequest)

Trial synonymize word

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SynonymizeApi apiInstance = new SynonymizeApi(defaultClient);
    SynonymizeTextRequest synonymizeTextRequest = new SynonymizeTextRequest(); // SynonymizeTextRequest | String in body of request, containing JSON with parameters for synonymizing. Maximum 1000 characters
    try {
      StatusResponse result = apiInstance.synonymizeTextTrialPost(synonymizeTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SynonymizeApi#synonymizeTextTrialPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **synonymizeTextRequest** | [**SynonymizeTextRequest**](SynonymizeTextRequest.md)| String in body of request, containing JSON with parameters for synonymizing. Maximum 1000 characters | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

