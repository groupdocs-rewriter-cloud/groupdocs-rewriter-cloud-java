# SummarizeApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**summarizeDocumentPost**](SummarizeApi.md#summarizeDocumentPost) | **POST** /summarize/document | Summarize document |
| [**summarizeDocumentRequestIdGet**](SummarizeApi.md#summarizeDocumentRequestIdGet) | **GET** /summarize/document/{requestId} | Return document summarizing status.  Also return URLs for downloading of summarized document if summarization was successful |
| [**summarizeDocumentTrialPost**](SummarizeApi.md#summarizeDocumentTrialPost) | **POST** /summarize/document/trial | Trial summarize document |
| [**summarizeHcGet**](SummarizeApi.md#summarizeHcGet) | **GET** /summarize/hc | Health check for all summarize services. |
| [**summarizeMediaPost**](SummarizeApi.md#summarizeMediaPost) | **POST** /summarize/media | Summarize media file |
| [**summarizeOcrPost**](SummarizeApi.md#summarizeOcrPost) | **POST** /summarize/ocr | Summarize image or scanned PDF |
| [**summarizeSupportedConversionsGet**](SummarizeApi.md#summarizeSupportedConversionsGet) | **GET** /summarize/supportedConversions |  |
| [**summarizeTextPost**](SummarizeApi.md#summarizeTextPost) | **POST** /summarize/text | Summarize text |
| [**summarizeTextRequestIdGet**](SummarizeApi.md#summarizeTextRequestIdGet) | **GET** /summarize/text/{requestId} | Return text summarizing status status.  Also return rewrote text if translation was successful |
| [**summarizeTextTrialPost**](SummarizeApi.md#summarizeTextTrialPost) | **POST** /summarize/text/trial | Trial summarize text |


<a id="summarizeDocumentPost"></a>
# **summarizeDocumentPost**
> StatusResponse summarizeDocumentPost(summarizationFileRequest)

Summarize document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationFileRequest summarizationFileRequest = new SummarizationFileRequest(); // SummarizationFileRequest | String in body of request, containing JSON with parameters for summarizing.
    try {
      StatusResponse result = apiInstance.summarizeDocumentPost(summarizationFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeDocumentPost");
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
| **summarizationFileRequest** | [**SummarizationFileRequest**](SummarizationFileRequest.md)| String in body of request, containing JSON with parameters for summarizing. | [optional] |

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

<a id="summarizeDocumentRequestIdGet"></a>
# **summarizeDocumentRequestIdGet**
> SummarizationFileResponse summarizeDocumentRequestIdGet(requestId)

Return document summarizing status.  Also return URLs for downloading of summarized document if summarization was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      SummarizationFileResponse result = apiInstance.summarizeDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeDocumentRequestIdGet");
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
| **requestId** | **String**| GUID which got from /v3/rewriter/document response | |

### Return type

[**SummarizationFileResponse**](SummarizationFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="summarizeDocumentTrialPost"></a>
# **summarizeDocumentTrialPost**
> StatusResponse summarizeDocumentTrialPost(summarizationTrialFileRequest)

Trial summarize document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationTrialFileRequest summarizationTrialFileRequest = new SummarizationTrialFileRequest(); // SummarizationTrialFileRequest | String in body of request, containing JSON with parameters for summarizing.
    try {
      StatusResponse result = apiInstance.summarizeDocumentTrialPost(summarizationTrialFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeDocumentTrialPost");
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
| **summarizationTrialFileRequest** | [**SummarizationTrialFileRequest**](SummarizationTrialFileRequest.md)| String in body of request, containing JSON with parameters for summarizing. | [optional] |

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

<a id="summarizeHcGet"></a>
# **summarizeHcGet**
> HealthCheckResponse summarizeHcGet()

Health check for all summarize services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.summarizeHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeHcGet");
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

<a id="summarizeMediaPost"></a>
# **summarizeMediaPost**
> StatusResponse summarizeMediaPost(summarizationMediaRequest)

Summarize media file

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationMediaRequest summarizationMediaRequest = new SummarizationMediaRequest(); // SummarizationMediaRequest | String in body of request, containing JSON with parameters for summarizing.
    try {
      StatusResponse result = apiInstance.summarizeMediaPost(summarizationMediaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeMediaPost");
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
| **summarizationMediaRequest** | [**SummarizationMediaRequest**](SummarizationMediaRequest.md)| String in body of request, containing JSON with parameters for summarizing. | [optional] |

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

<a id="summarizeOcrPost"></a>
# **summarizeOcrPost**
> StatusResponse summarizeOcrPost(summarizationOcrRequest)

Summarize image or scanned PDF

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationOcrRequest summarizationOcrRequest = new SummarizationOcrRequest(); // SummarizationOcrRequest | String in body of request, containing JSON with parameters for summarizing.
    try {
      StatusResponse result = apiInstance.summarizeOcrPost(summarizationOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeOcrPost");
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
| **summarizationOcrRequest** | [**SummarizationOcrRequest**](SummarizationOcrRequest.md)| String in body of request, containing JSON with parameters for summarizing. | [optional] |

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

<a id="summarizeSupportedConversionsGet"></a>
# **summarizeSupportedConversionsGet**
> List&lt;String&gt; summarizeSupportedConversionsGet(format)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    String format = "Unknown"; // String | 
    try {
      List<String> result = apiInstance.summarizeSupportedConversionsGet(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeSupportedConversionsGet");
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
| **format** | **String**|  | [optional] [enum: Unknown, Doc, Docx, Docm, Rtf, Odt, Txt, Pdf, Md, Html] |

### Return type

**List&lt;String&gt;**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="summarizeTextPost"></a>
# **summarizeTextPost**
> StatusResponse summarizeTextPost(summarizationTextRequest)

Summarize text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationTextRequest summarizationTextRequest = new SummarizationTextRequest(); // SummarizationTextRequest | 
    try {
      StatusResponse result = apiInstance.summarizeTextPost(summarizationTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeTextPost");
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
| **summarizationTextRequest** | [**SummarizationTextRequest**](SummarizationTextRequest.md)|  | [optional] |

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

<a id="summarizeTextRequestIdGet"></a>
# **summarizeTextRequestIdGet**
> SummarizationTextResponse summarizeTextRequestIdGet(requestId)

Return text summarizing status status.  Also return rewrote text if translation was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/text response
    try {
      SummarizationTextResponse result = apiInstance.summarizeTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeTextRequestIdGet");
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

[**SummarizationTextResponse**](SummarizationTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="summarizeTextTrialPost"></a>
# **summarizeTextTrialPost**
> StatusResponse summarizeTextTrialPost(summarizationTextRequest)

Trial summarize text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SummarizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SummarizeApi apiInstance = new SummarizeApi(defaultClient);
    SummarizationTextRequest summarizationTextRequest = new SummarizationTextRequest(); // SummarizationTextRequest | String in body of request, containing JSON with parameters for summarizing. Maximum 1000 characters
    try {
      StatusResponse result = apiInstance.summarizeTextTrialPost(summarizationTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SummarizeApi#summarizeTextTrialPost");
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
| **summarizationTextRequest** | [**SummarizationTextRequest**](SummarizationTextRequest.md)| String in body of request, containing JSON with parameters for summarizing. Maximum 1000 characters | [optional] |

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

