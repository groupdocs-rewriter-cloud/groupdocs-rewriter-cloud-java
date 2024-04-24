# DetectApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**detectDocumentPost**](DetectApi.md#detectDocumentPost) | **POST** /detect/document | Detect paraphrasing in the document |
| [**detectDocumentRequestIdGet**](DetectApi.md#detectDocumentRequestIdGet) | **GET** /detect/document/{requestId} | Return document detection status.  Also return probability of paraphrasing for the whole document and per paragraph |
| [**detectDocumentTrialPost**](DetectApi.md#detectDocumentTrialPost) | **POST** /detect/document/trial | Trial detect paraphrasing in the document |
| [**detectHcGet**](DetectApi.md#detectHcGet) | **GET** /detect/hc | Health check for detect all services. |
| [**detectTextPost**](DetectApi.md#detectTextPost) | **POST** /detect/text | Detect paraphrasing in text |
| [**detectTextRequestIdGet**](DetectApi.md#detectTextRequestIdGet) | **GET** /detect/text/{requestId} | Return text detection status.  Also return probability of paraphrasing for the whole text |
| [**detectTextTrialPost**](DetectApi.md#detectTextTrialPost) | **POST** /detect/text/trial | Trial detect paraphrasing in text |


<a id="detectDocumentPost"></a>
# **detectDocumentPost**
> StatusResponse detectDocumentPost(detectionFileRequest)

Detect paraphrasing in the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

    DetectApi apiInstance = new DetectApi(defaultClient);
    DetectionFileRequest detectionFileRequest = new DetectionFileRequest(); // DetectionFileRequest | String in body of request, containing JSON with parameters for detecting.
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
| **detectionFileRequest** | [**DetectionFileRequest**](DetectionFileRequest.md)| String in body of request, containing JSON with parameters for detecting. | [optional] |

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
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="detectTextPost"></a>
# **detectTextPost**
> StatusResponse detectTextPost(detectionTextRequest)

Detect paraphrasing in text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

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
import com.groupdocs.models.*;
import org.openapitools.client.api.DetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

