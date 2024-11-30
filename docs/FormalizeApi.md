# FormalizeApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**formalizeDocumentPost**](FormalizeApi.md#formalizeDocumentPost) | **POST** /formalize/document | Formalize document |
| [**formalizeDocumentRequestIdGet**](FormalizeApi.md#formalizeDocumentRequestIdGet) | **GET** /formalize/document/{requestId} | Return document formalizinh status.  Also return URLs for downloading of formalized document if paraphrasing was successful |
| [**formalizeHcGet**](FormalizeApi.md#formalizeHcGet) | **GET** /formalize/hc | Health check for all simplify services. |
| [**formalizeOcrPost**](FormalizeApi.md#formalizeOcrPost) | **POST** /formalize/ocr | Formalize scanned image or document |
| [**formalizeSupportedConversionsGet**](FormalizeApi.md#formalizeSupportedConversionsGet) | **GET** /formalize/supportedConversions |  |
| [**formalizeTextPost**](FormalizeApi.md#formalizeTextPost) | **POST** /formalize/text | Formalize text |
| [**formalizeTextRequestIdGet**](FormalizeApi.md#formalizeTextRequestIdGet) | **GET** /formalize/text/{requestId} | Return text formalizing status.  Also return formalized text if paraphrasing was successful |


<a id="formalizeDocumentPost"></a>
# **formalizeDocumentPost**
> StatusResponse formalizeDocumentPost(formalizeFileRequest)

Formalize document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    FormalizeFileRequest formalizeFileRequest = new FormalizeFileRequest(); // FormalizeFileRequest | String in body of request, containing JSON with parameters for formalizing.
    try {
      StatusResponse result = apiInstance.formalizeDocumentPost(formalizeFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeDocumentPost");
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
| **formalizeFileRequest** | [**FormalizeFileRequest**](FormalizeFileRequest.md)| String in body of request, containing JSON with parameters for formalizing. | [optional] |

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

<a id="formalizeDocumentRequestIdGet"></a>
# **formalizeDocumentRequestIdGet**
> FormalizeFileResponse formalizeDocumentRequestIdGet(requestId)

Return document formalizinh status.  Also return URLs for downloading of formalized document if paraphrasing was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      FormalizeFileResponse result = apiInstance.formalizeDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeDocumentRequestIdGet");
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

[**FormalizeFileResponse**](FormalizeFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="formalizeHcGet"></a>
# **formalizeHcGet**
> HealthCheckResponse formalizeHcGet()

Health check for all simplify services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.formalizeHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeHcGet");
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

<a id="formalizeOcrPost"></a>
# **formalizeOcrPost**
> StatusResponse formalizeOcrPost(formalizeOcrRequest)

Formalize scanned image or document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    FormalizeOcrRequest formalizeOcrRequest = new FormalizeOcrRequest(); // FormalizeOcrRequest | String in body of request, containing JSON with parameters for formalizing.
    try {
      StatusResponse result = apiInstance.formalizeOcrPost(formalizeOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeOcrPost");
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
| **formalizeOcrRequest** | [**FormalizeOcrRequest**](FormalizeOcrRequest.md)| String in body of request, containing JSON with parameters for formalizing. | [optional] |

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

<a id="formalizeSupportedConversionsGet"></a>
# **formalizeSupportedConversionsGet**
> List&lt;String&gt; formalizeSupportedConversionsGet(format)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    String format = "Unknown"; // String | 
    try {
      List<String> result = apiInstance.formalizeSupportedConversionsGet(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeSupportedConversionsGet");
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

<a id="formalizeTextPost"></a>
# **formalizeTextPost**
> StatusResponse formalizeTextPost(formalizeTextRequest)

Formalize text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    FormalizeTextRequest formalizeTextRequest = new FormalizeTextRequest(); // FormalizeTextRequest | String in body of request, containing JSON with parameters for formalizing.
    try {
      StatusResponse result = apiInstance.formalizeTextPost(formalizeTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeTextPost");
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
| **formalizeTextRequest** | [**FormalizeTextRequest**](FormalizeTextRequest.md)| String in body of request, containing JSON with parameters for formalizing. | [optional] |

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

<a id="formalizeTextRequestIdGet"></a>
# **formalizeTextRequestIdGet**
> FormalizeTextResponse formalizeTextRequestIdGet(requestId)

Return text formalizing status.  Also return formalized text if paraphrasing was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.FormalizeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    FormalizeApi apiInstance = new FormalizeApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/text response
    try {
      FormalizeTextResponse result = apiInstance.formalizeTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormalizeApi#formalizeTextRequestIdGet");
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

[**FormalizeTextResponse**](FormalizeTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

