# GenerateApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCoverLetterPost**](GenerateApi.md#generateCoverLetterPost) | **POST** /generate/cover-letter | Generate cover letter based on job description and optionally CV and cover letter that should be adopted to this offer |
| [**generateCvPost**](GenerateApi.md#generateCvPost) | **POST** /generate/cv | Generate CV adopted to job description and optionally original CV |
| [**generateHcGet**](GenerateApi.md#generateHcGet) | **GET** /generate/hc | Health check for generation services. |
| [**generateKeywordsPost**](GenerateApi.md#generateKeywordsPost) | **POST** /generate/keywords | Generate keywords for provided web page |
| [**generateRequestIdGet**](GenerateApi.md#generateRequestIdGet) | **GET** /generate/{requestId} | Return generation status.  Also return generated result |
| [**generateTestExercisePost**](GenerateApi.md#generateTestExercisePost) | **POST** /generate/test-exercise | Generate test exercise based on job description and optionally CV |
| [**generateTestQuestionsPost**](GenerateApi.md#generateTestQuestionsPost) | **POST** /generate/test-questions | Generate questions for technical interview based on job description and optionally CV |
| [**generateVideoDescriptionPost**](GenerateApi.md#generateVideoDescriptionPost) | **POST** /generate/video-description | Generate video description for provided video file |


<a id="generateCoverLetterPost"></a>
# **generateCoverLetterPost**
> StatusResponse generateCoverLetterPost(generateRequest)

Generate cover letter based on job description and optionally CV and cover letter that should be adopted to this offer

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateRequest generateRequest = new GenerateRequest(); // GenerateRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.generateCoverLetterPost(generateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateCoverLetterPost");
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
| **generateRequest** | [**GenerateRequest**](GenerateRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

<a id="generateCvPost"></a>
# **generateCvPost**
> StatusResponse generateCvPost(generateRequest)

Generate CV adopted to job description and optionally original CV

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateRequest generateRequest = new GenerateRequest(); // GenerateRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.generateCvPost(generateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateCvPost");
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
| **generateRequest** | [**GenerateRequest**](GenerateRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

<a id="generateHcGet"></a>
# **generateHcGet**
> HealthCheckResponse generateHcGet()

Health check for generation services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.generateHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateHcGet");
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

<a id="generateKeywordsPost"></a>
# **generateKeywordsPost**
> StatusResponse generateKeywordsPost(generateKeywordsRequest)

Generate keywords for provided web page

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateKeywordsRequest generateKeywordsRequest = new GenerateKeywordsRequest(); // GenerateKeywordsRequest | String in body of request, containing JSON with parameters.
    try {
      StatusResponse result = apiInstance.generateKeywordsPost(generateKeywordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateKeywordsPost");
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
| **generateKeywordsRequest** | [**GenerateKeywordsRequest**](GenerateKeywordsRequest.md)| String in body of request, containing JSON with parameters. | [optional] |

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

<a id="generateRequestIdGet"></a>
# **generateRequestIdGet**
> GenerateResponse generateRequestIdGet(requestId)

Return generation status.  Also return generated result

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID
    try {
      GenerateResponse result = apiInstance.generateRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateRequestIdGet");
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
| **requestId** | **String**| GUID | |

### Return type

[**GenerateResponse**](GenerateResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="generateTestExercisePost"></a>
# **generateTestExercisePost**
> StatusResponse generateTestExercisePost(generateRequest)

Generate test exercise based on job description and optionally CV

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateRequest generateRequest = new GenerateRequest(); // GenerateRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.generateTestExercisePost(generateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateTestExercisePost");
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
| **generateRequest** | [**GenerateRequest**](GenerateRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

<a id="generateTestQuestionsPost"></a>
# **generateTestQuestionsPost**
> StatusResponse generateTestQuestionsPost(generateRequest)

Generate questions for technical interview based on job description and optionally CV

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateRequest generateRequest = new GenerateRequest(); // GenerateRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.generateTestQuestionsPost(generateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateTestQuestionsPost");
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
| **generateRequest** | [**GenerateRequest**](GenerateRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

<a id="generateVideoDescriptionPost"></a>
# **generateVideoDescriptionPost**
> StatusResponse generateVideoDescriptionPost(generateVideoDescriptionRequest)

Generate video description for provided video file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.GenerateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    GenerateApi apiInstance = new GenerateApi(defaultClient);
    GenerateVideoDescriptionRequest generateVideoDescriptionRequest = new GenerateVideoDescriptionRequest(); // GenerateVideoDescriptionRequest | String in body of request, containing JSON with parameters for comparison.
    try {
      StatusResponse result = apiInstance.generateVideoDescriptionPost(generateVideoDescriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenerateApi#generateVideoDescriptionPost");
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
| **generateVideoDescriptionRequest** | [**GenerateVideoDescriptionRequest**](GenerateVideoDescriptionRequest.md)| String in body of request, containing JSON with parameters for comparison. | [optional] |

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

