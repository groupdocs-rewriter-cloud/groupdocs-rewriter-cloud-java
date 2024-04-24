# SynonymizeApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**synonymizeHcGet**](SynonymizeApi.md#synonymizeHcGet) | **GET** /synonymize/hc | Health check for all synonymizer services. |
| [**synonymizeTextPost**](SynonymizeApi.md#synonymizeTextPost) | **POST** /synonymize/text | Synonymize word |
| [**synonymizeTextRequestIdGet**](SynonymizeApi.md#synonymizeTextRequestIdGet) | **GET** /synonymize/text/{requestId} | Return text synonymizing status.  Also return list of synonyms if it was successful |
| [**synonymizeTextTrialPost**](SynonymizeApi.md#synonymizeTextTrialPost) | **POST** /synonymize/text/trial | Trial synonymize word |


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
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.SynonymizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

