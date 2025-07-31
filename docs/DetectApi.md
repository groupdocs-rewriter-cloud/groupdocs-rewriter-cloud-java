# DetectApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**detectAiGenerationDocumentPost**](DetectApi.md#detectAiGenerationDocumentPost) | **POST** /detect/ai-generation/document | Detect ai generated text in the document |
| [**detectAiGenerationOcrPost**](DetectApi.md#detectAiGenerationOcrPost) | **POST** /detect/ai-generation/ocr | Detect ai generation content in the image or scanned document |
| [**detectAiGenerationTextPost**](DetectApi.md#detectAiGenerationTextPost) | **POST** /detect/ai-generation/text | Detect ai generated text |
| [**detectDocumentPost**](DetectApi.md#detectDocumentPost) | **POST** /detect/document | Obsolete. Will be removed in the next version, use /detect/paraphrase/document/ instead this. |
| [**detectDocumentRequestIdGet**](DetectApi.md#detectDocumentRequestIdGet) | **GET** /detect/document/{requestId} | Return document detection status.  Also return probability of paraphrasing for the whole document and per paragraph |
| [**detectDocumentTrialPost**](DetectApi.md#detectDocumentTrialPost) | **POST** /detect/document/trial | Trial detect paraphrasing in the document |
| [**detectHcGet**](DetectApi.md#detectHcGet) | **GET** /detect/hc | Health check for detect all services. |
| [**detectOcrPost**](DetectApi.md#detectOcrPost) | **POST** /detect/ocr | Obsolete. Will be removed in the next version, use /detect/paraphrase/ocr instead this. |
| [**detectParaphraseDocumentPost**](DetectApi.md#detectParaphraseDocumentPost) | **POST** /detect/paraphrase/document | Detect paraphrasing in the document |
| [**detectParaphraseOcrPost**](DetectApi.md#detectParaphraseOcrPost) | **POST** /detect/paraphrase/ocr | Detect paraphrasing in the image or scanned document |
| [**detectParaphraseTextPost**](DetectApi.md#detectParaphraseTextPost) | **POST** /detect/paraphrase/text | Detect paraphrasing in text |
| [**detectSummarizationDocumentPost**](DetectApi.md#detectSummarizationDocumentPost) | **POST** /detect/summarization/document | Detect summarization in the document |
| [**detectSummarizationOcrPost**](DetectApi.md#detectSummarizationOcrPost) | **POST** /detect/summarization/ocr | Detect summarization in the image or scanned document |
| [**detectSummarizationTextPost**](DetectApi.md#detectSummarizationTextPost) | **POST** /detect/summarization/text | Detect summarization in text |
| [**detectTextPost**](DetectApi.md#detectTextPost) | **POST** /detect/text | Obsolete. Will be removed in the next version, use /detect/paraphrase/text instead this. |
| [**detectTextRequestIdGet**](DetectApi.md#detectTextRequestIdGet) | **GET** /detect/text/{requestId} | Return text detection status.  Also return probability of paraphrasing for the whole text |
| [**detectTextTrialPost**](DetectApi.md#detectTextTrialPost) | **POST** /detect/text/trial | Trial detect paraphrasing in text |


<a id="detectAiGenerationDocumentPost"></a>
# **detectAiGenerationDocumentPost**
> StatusResponse detectAiGenerationDocumentPost(detectionFileRequest)

Detect ai generated text in the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionFileRequest detectionFileRequest = new DetectionFileRequest(); // DetectionFileRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectAiGenerationDocumentPost(detectionFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectAiGenerationDocumentPost");
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
| **detectionFileRequest** | [**DetectionFileRequest**](DetectionFileRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectAiGenerationOcrPost"></a>
# **detectAiGenerationOcrPost**
> StatusResponse detectAiGenerationOcrPost(detectionOcrRequest)

Detect ai generation content in the image or scanned document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionOcrRequest detectionOcrRequest = new DetectionOcrRequest(); // DetectionOcrRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectAiGenerationOcrPost(detectionOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectAiGenerationOcrPost");
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
| **detectionOcrRequest** | [**DetectionOcrRequest**](DetectionOcrRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectAiGenerationTextPost"></a>
# **detectAiGenerationTextPost**
> StatusResponse detectAiGenerationTextPost(detectionTextRequest)

Detect ai generated text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTextRequest detectionTextRequest = new DetectionTextRequest(); // DetectionTextRequest | String in body of request, containing JSON with parameters for detection.
    try {
      StatusResponse result = apiInstance.detectAiGenerationTextPost(detectionTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectAiGenerationTextPost");
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
| **detectionTextRequest** | [**DetectionTextRequest**](DetectionTextRequest.md)| String in body of request, containing JSON with parameters for detection. | [optional] |

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

<a id="detectDocumentPost"></a>
# **detectDocumentPost**
> StatusResponse detectDocumentPost(detectionFileRequest)

Obsolete. Will be removed in the next version, use /detect/paraphrase/document/ instead this.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionFileRequest detectionFileRequest = new DetectionFileRequest(); // DetectionFileRequest | 
    try {
      StatusResponse result = apiInstance.detectDocumentPost(detectionFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectDocumentPost");
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
| **detectionFileRequest** | [**DetectionFileRequest**](DetectionFileRequest.md)|  | [optional] |

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

<a id="detectDocumentRequestIdGet"></a>
# **detectDocumentRequestIdGet**
> DetectionFileResponse detectDocumentRequestIdGet(requestId)

Return document detection status.  Also return probability of paraphrasing for the whole document and per paragraph

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      DetectionFileResponse result = apiInstance.detectDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectDocumentRequestIdGet");
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

[**DetectionFileResponse**](DetectionFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="detectDocumentTrialPost"></a>
# **detectDocumentTrialPost**
> StatusResponse detectDocumentTrialPost(detectionTrialFileRequest)

Trial detect paraphrasing in the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTrialFileRequest detectionTrialFileRequest = new DetectionTrialFileRequest(); // DetectionTrialFileRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectDocumentTrialPost(detectionTrialFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectDocumentTrialPost");
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
| **detectionTrialFileRequest** | [**DetectionTrialFileRequest**](DetectionTrialFileRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectHcGet"></a>
# **detectHcGet**
> HealthCheckResponse detectHcGet()

Health check for detect all services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.detectHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectHcGet");
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

<a id="detectOcrPost"></a>
# **detectOcrPost**
> StatusResponse detectOcrPost(detectionOcrRequest)

Obsolete. Will be removed in the next version, use /detect/paraphrase/ocr instead this.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionOcrRequest detectionOcrRequest = new DetectionOcrRequest(); // DetectionOcrRequest | 
    try {
      StatusResponse result = apiInstance.detectOcrPost(detectionOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectOcrPost");
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
| **detectionOcrRequest** | [**DetectionOcrRequest**](DetectionOcrRequest.md)|  | [optional] |

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

<a id="detectParaphraseDocumentPost"></a>
# **detectParaphraseDocumentPost**
> StatusResponse detectParaphraseDocumentPost(detectionFileRequest)

Detect paraphrasing in the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionFileRequest detectionFileRequest = new DetectionFileRequest(); // DetectionFileRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectParaphraseDocumentPost(detectionFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectParaphraseDocumentPost");
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
| **detectionFileRequest** | [**DetectionFileRequest**](DetectionFileRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectParaphraseOcrPost"></a>
# **detectParaphraseOcrPost**
> StatusResponse detectParaphraseOcrPost(detectionOcrRequest)

Detect paraphrasing in the image or scanned document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionOcrRequest detectionOcrRequest = new DetectionOcrRequest(); // DetectionOcrRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectParaphraseOcrPost(detectionOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectParaphraseOcrPost");
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
| **detectionOcrRequest** | [**DetectionOcrRequest**](DetectionOcrRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectParaphraseTextPost"></a>
# **detectParaphraseTextPost**
> StatusResponse detectParaphraseTextPost(detectionTextRequest)

Detect paraphrasing in text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTextRequest detectionTextRequest = new DetectionTextRequest(); // DetectionTextRequest | String in body of request, containing JSON with parameters for detection.
    try {
      StatusResponse result = apiInstance.detectParaphraseTextPost(detectionTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectParaphraseTextPost");
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
| **detectionTextRequest** | [**DetectionTextRequest**](DetectionTextRequest.md)| String in body of request, containing JSON with parameters for detection. | [optional] |

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

<a id="detectSummarizationDocumentPost"></a>
# **detectSummarizationDocumentPost**
> StatusResponse detectSummarizationDocumentPost(detectionFileRequest)

Detect summarization in the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionFileRequest detectionFileRequest = new DetectionFileRequest(); // DetectionFileRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectSummarizationDocumentPost(detectionFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectSummarizationDocumentPost");
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
| **detectionFileRequest** | [**DetectionFileRequest**](DetectionFileRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectSummarizationOcrPost"></a>
# **detectSummarizationOcrPost**
> StatusResponse detectSummarizationOcrPost(detectionOcrRequest)

Detect summarization in the image or scanned document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionOcrRequest detectionOcrRequest = new DetectionOcrRequest(); // DetectionOcrRequest | String in body of request, containing JSON with parameters for detecting.
    try {
      StatusResponse result = apiInstance.detectSummarizationOcrPost(detectionOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectSummarizationOcrPost");
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
| **detectionOcrRequest** | [**DetectionOcrRequest**](DetectionOcrRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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

<a id="detectSummarizationTextPost"></a>
# **detectSummarizationTextPost**
> StatusResponse detectSummarizationTextPost(detectionTextRequest)

Detect summarization in text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTextRequest detectionTextRequest = new DetectionTextRequest(); // DetectionTextRequest | String in body of request, containing JSON with parameters for detection.
    try {
      StatusResponse result = apiInstance.detectSummarizationTextPost(detectionTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectSummarizationTextPost");
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
| **detectionTextRequest** | [**DetectionTextRequest**](DetectionTextRequest.md)| String in body of request, containing JSON with parameters for detection. | [optional] |

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

<a id="detectTextPost"></a>
# **detectTextPost**
> StatusResponse detectTextPost(detectionTextRequest)

Obsolete. Will be removed in the next version, use /detect/paraphrase/text instead this.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTextRequest detectionTextRequest = new DetectionTextRequest(); // DetectionTextRequest | String in body of request, containing JSON with parameters for detection.
    try {
      StatusResponse result = apiInstance.detectTextPost(detectionTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectTextPost");
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
| **detectionTextRequest** | [**DetectionTextRequest**](DetectionTextRequest.md)| String in body of request, containing JSON with parameters for detection. | [optional] |

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

<a id="detectTextRequestIdGet"></a>
# **detectTextRequestIdGet**
> DetectionTextResponse detectTextRequestIdGet(requestId)

Return text detection status.  Also return probability of paraphrasing for the whole text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      DetectionTextResponse result = apiInstance.detectTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectTextRequestIdGet");
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

[**DetectionTextResponse**](DetectionTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="detectTextTrialPost"></a>
# **detectTextTrialPost**
> StatusResponse detectTextTrialPost(detectionTextRequest)

Trial detect paraphrasing in text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionTextRequest detectionTextRequest = new DetectionTextRequest(); // DetectionTextRequest | String in body of request, containing JSON with parameters for detection. Maximum 1000 characters
    try {
      StatusResponse result = apiInstance.detectTextTrialPost(detectionTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectApi#detectTextTrialPost");
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
| **detectionTextRequest** | [**DetectionTextRequest**](DetectionTextRequest.md)| String in body of request, containing JSON with parameters for detection. Maximum 1000 characters | [optional] |

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

