# CompareApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compareHcGet**](CompareApi.md#compareHcGet) | **GET** /compare/hc | Health check for all comparer services. |
| [**compareTextPost**](CompareApi.md#compareTextPost) | **POST** /compare/text | Compare texts and detect if one is translation or paraphrase of another |
| [**compareTextRequestIdGet**](CompareApi.md#compareTextRequestIdGet) | **GET** /compare/text/{requestId} | Return text comparing status.  Also return probability if one text is paraphrasing or translation of another |
| [**compareTextSummarizationPost**](CompareApi.md#compareTextSummarizationPost) | **POST** /compare/text/summarization | Compare texts and detect if one is summarization of another |


<a id="compareHcGet"></a>
# **compareHcGet**
> HealthCheckResponse compareHcGet()

Health check for all comparer services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    CompareApi apiInstance = new CompareApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.compareHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#compareHcGet");
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

<a id="compareTextPost"></a>
# **compareTextPost**
> StatusResponse compareTextPost(compareTextRequest)

Compare texts and detect if one is translation or paraphrase of another

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    CompareApi apiInstance = new CompareApi(defaultClient);
    CompareTextRequest compareTextRequest = new CompareTextRequest(); // CompareTextRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.compareTextPost(compareTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#compareTextPost");
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
| **compareTextRequest** | [**CompareTextRequest**](CompareTextRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

<a id="compareTextRequestIdGet"></a>
# **compareTextRequestIdGet**
> CompareTextResponse compareTextRequestIdGet(requestId)

Return text comparing status.  Also return probability if one text is paraphrasing or translation of another

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    CompareApi apiInstance = new CompareApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/compare/text response
    try {
      CompareTextResponse result = apiInstance.compareTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#compareTextRequestIdGet");
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
| **requestId** | **String**| GUID which got from /v3/compare/text response | |

### Return type

[**CompareTextResponse**](CompareTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="compareTextSummarizationPost"></a>
# **compareTextSummarizationPost**
> StatusResponse compareTextSummarizationPost(compareTextRequest)

Compare texts and detect if one is summarization of another

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.CompareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    CompareApi apiInstance = new CompareApi(defaultClient);
    CompareTextRequest compareTextRequest = new CompareTextRequest(); // CompareTextRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.compareTextSummarizationPost(compareTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompareApi#compareTextSummarizationPost");
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
| **compareTextRequest** | [**CompareTextRequest**](CompareTextRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

