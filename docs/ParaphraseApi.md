# ParaphraseApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paraphraseDocumentPost**](ParaphraseApi.md#paraphraseDocumentPost) | **POST** /paraphrase/document | Paraphrase document |
| [**paraphraseDocumentRequestIdGet**](ParaphraseApi.md#paraphraseDocumentRequestIdGet) | **GET** /paraphrase/document/{requestId} | Return document rewriting status.  Also return URLs for downloading of rewritten document if paraphrasig was successful |
| [**paraphraseDocumentTrialPost**](ParaphraseApi.md#paraphraseDocumentTrialPost) | **POST** /paraphrase/document/trial | Trial paraphrase document |
| [**paraphraseHcGet**](ParaphraseApi.md#paraphraseHcGet) | **GET** /paraphrase/hc | Health check for all paraphrase services. |
| [**paraphraseOcrPost**](ParaphraseApi.md#paraphraseOcrPost) | **POST** /paraphrase/ocr | Rewrite scanned image or PDF |
| [**paraphraseSupportedConversionsGet**](ParaphraseApi.md#paraphraseSupportedConversionsGet) | **GET** /paraphrase/supportedConversions |  |
| [**paraphraseTextPost**](ParaphraseApi.md#paraphraseTextPost) | **POST** /paraphrase/text | Rewrite text |
| [**paraphraseTextRequestIdGet**](ParaphraseApi.md#paraphraseTextRequestIdGet) | **GET** /paraphrase/text/{requestId} | Return text rewriting status.  Also return rewritten text if paraphrasing was successful |
| [**paraphraseTextTrialPost**](ParaphraseApi.md#paraphraseTextTrialPost) | **POST** /paraphrase/text/trial | Trial rewrite text |


<a id="paraphraseDocumentPost"></a>
# **paraphraseDocumentPost**
> StatusResponse paraphraseDocumentPost(paraphraseFileRequest)

Paraphrase document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    ParaphraseFileRequest paraphraseFileRequest = new ParaphraseFileRequest(); // ParaphraseFileRequest | String in body of request, containing JSON with parameters for rewriting.
    try {
      StatusResponse result = apiInstance.paraphraseDocumentPost(paraphraseFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseDocumentPost");
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
| **paraphraseFileRequest** | [**ParaphraseFileRequest**](ParaphraseFileRequest.md)| String in body of request, containing JSON with parameters for rewriting. | [optional] |

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

<a id="paraphraseDocumentRequestIdGet"></a>
# **paraphraseDocumentRequestIdGet**
> ParaphraseFileResponse paraphraseDocumentRequestIdGet(requestId)

Return document rewriting status.  Also return URLs for downloading of rewritten document if paraphrasig was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      ParaphraseFileResponse result = apiInstance.paraphraseDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseDocumentRequestIdGet");
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

[**ParaphraseFileResponse**](ParaphraseFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="paraphraseDocumentTrialPost"></a>
# **paraphraseDocumentTrialPost**
> StatusResponse paraphraseDocumentTrialPost(paraphraseTrialFileRequest)

Trial paraphrase document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    ParaphraseTrialFileRequest paraphraseTrialFileRequest = new ParaphraseTrialFileRequest(); // ParaphraseTrialFileRequest | String in body of request, containing JSON with parameters for rewriting.
    try {
      StatusResponse result = apiInstance.paraphraseDocumentTrialPost(paraphraseTrialFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseDocumentTrialPost");
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
| **paraphraseTrialFileRequest** | [**ParaphraseTrialFileRequest**](ParaphraseTrialFileRequest.md)| String in body of request, containing JSON with parameters for rewriting. | [optional] |

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

<a id="paraphraseHcGet"></a>
# **paraphraseHcGet**
> HealthCheckResponse paraphraseHcGet()

Health check for all paraphrase services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.paraphraseHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseHcGet");
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

<a id="paraphraseOcrPost"></a>
# **paraphraseOcrPost**
> StatusResponse paraphraseOcrPost(paraphraseOcrRequest)

Rewrite scanned image or PDF

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    ParaphraseOcrRequest paraphraseOcrRequest = new ParaphraseOcrRequest(); // ParaphraseOcrRequest | String in body of request, containing JSON with parameters for rewriting.
    try {
      StatusResponse result = apiInstance.paraphraseOcrPost(paraphraseOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseOcrPost");
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
| **paraphraseOcrRequest** | [**ParaphraseOcrRequest**](ParaphraseOcrRequest.md)| String in body of request, containing JSON with parameters for rewriting. | [optional] |

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

<a id="paraphraseSupportedConversionsGet"></a>
# **paraphraseSupportedConversionsGet**
> List&lt;String&gt; paraphraseSupportedConversionsGet(format)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    String format = "Unknown"; // String | 
    try {
      List<String> result = apiInstance.paraphraseSupportedConversionsGet(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseSupportedConversionsGet");
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

<a id="paraphraseTextPost"></a>
# **paraphraseTextPost**
> StatusResponse paraphraseTextPost(paraphraseTextRequest)

Rewrite text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    ParaphraseTextRequest paraphraseTextRequest = new ParaphraseTextRequest(); // ParaphraseTextRequest | String in body of request, containing JSON with parameters for rewriting.
    try {
      StatusResponse result = apiInstance.paraphraseTextPost(paraphraseTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseTextPost");
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
| **paraphraseTextRequest** | [**ParaphraseTextRequest**](ParaphraseTextRequest.md)| String in body of request, containing JSON with parameters for rewriting. | [optional] |

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

<a id="paraphraseTextRequestIdGet"></a>
# **paraphraseTextRequestIdGet**
> ParaphraseTextResponse paraphraseTextRequestIdGet(requestId)

Return text rewriting status.  Also return rewritten text if paraphrasing was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/text response
    try {
      ParaphraseTextResponse result = apiInstance.paraphraseTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseTextRequestIdGet");
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

[**ParaphraseTextResponse**](ParaphraseTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="paraphraseTextTrialPost"></a>
# **paraphraseTextTrialPost**
> StatusResponse paraphraseTextTrialPost(paraphraseTextRequest)

Trial rewrite text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.ParaphraseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);
    ParaphraseTextRequest paraphraseTextRequest = new ParaphraseTextRequest(); // ParaphraseTextRequest | String in body of request, containing JSON with parameters for summarizing. Maximum 1000 characters
    try {
      StatusResponse result = apiInstance.paraphraseTextTrialPost(paraphraseTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParaphraseApi#paraphraseTextTrialPost");
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
| **paraphraseTextRequest** | [**ParaphraseTextRequest**](ParaphraseTextRequest.md)| String in body of request, containing JSON with parameters for summarizing. Maximum 1000 characters | [optional] |

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

