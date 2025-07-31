# SimplifyApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**simplifyDocumentPost**](SimplifyApi.md#simplifyDocumentPost) | **POST** /simplify/document | Simplify document |
| [**simplifyDocumentRequestIdGet**](SimplifyApi.md#simplifyDocumentRequestIdGet) | **GET** /simplify/document/{requestId} | Return document simplifying status.  Also return URLs for downloading of simplified document if paraphrasig was successful |
| [**simplifyDocumentTrialPost**](SimplifyApi.md#simplifyDocumentTrialPost) | **POST** /simplify/document/trial | Trial simplify document |
| [**simplifyHcGet**](SimplifyApi.md#simplifyHcGet) | **GET** /simplify/hc | Health check for all simplify services. |
| [**simplifyOcrPost**](SimplifyApi.md#simplifyOcrPost) | **POST** /simplify/ocr | Simplify scanned image or document |
| [**simplifySupportedConversionsGet**](SimplifyApi.md#simplifySupportedConversionsGet) | **GET** /simplify/supportedConversions |  |
| [**simplifyTextPost**](SimplifyApi.md#simplifyTextPost) | **POST** /simplify/text | Simplify text |
| [**simplifyTextRequestIdGet**](SimplifyApi.md#simplifyTextRequestIdGet) | **GET** /simplify/text/{requestId} | Return text simplifying status.  Also return simplified text if paraphrasing was successful |
| [**simplifyTextTrialPost**](SimplifyApi.md#simplifyTextTrialPost) | **POST** /simplify/text/trial | Trial simplify text |


<a id="simplifyDocumentPost"></a>
# **simplifyDocumentPost**
> StatusResponse simplifyDocumentPost(simplifyFileRequest)

Simplify document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    SimplifyFileRequest simplifyFileRequest = new SimplifyFileRequest(); // SimplifyFileRequest | String in body of request, containing JSON with parameters for simplifying.
    try {
      StatusResponse result = apiInstance.simplifyDocumentPost(simplifyFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyDocumentPost");
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
| **simplifyFileRequest** | [**SimplifyFileRequest**](SimplifyFileRequest.md)| String in body of request, containing JSON with parameters for simplifying. | [optional] |

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

<a id="simplifyDocumentRequestIdGet"></a>
# **simplifyDocumentRequestIdGet**
> SimplifyFileResponse simplifyDocumentRequestIdGet(requestId)

Return document simplifying status.  Also return URLs for downloading of simplified document if paraphrasig was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      SimplifyFileResponse result = apiInstance.simplifyDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyDocumentRequestIdGet");
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

[**SimplifyFileResponse**](SimplifyFileResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="simplifyDocumentTrialPost"></a>
# **simplifyDocumentTrialPost**
> StatusResponse simplifyDocumentTrialPost(simplifyTrialFileRequest)

Trial simplify document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    SimplifyTrialFileRequest simplifyTrialFileRequest = new SimplifyTrialFileRequest(); // SimplifyTrialFileRequest | String in body of request, containing JSON with parameters for simplifying.
    try {
      StatusResponse result = apiInstance.simplifyDocumentTrialPost(simplifyTrialFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyDocumentTrialPost");
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
| **simplifyTrialFileRequest** | [**SimplifyTrialFileRequest**](SimplifyTrialFileRequest.md)| String in body of request, containing JSON with parameters for simplifying. | [optional] |

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

<a id="simplifyHcGet"></a>
# **simplifyHcGet**
> HealthCheckResponse simplifyHcGet()

Health check for all simplify services.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    try {
      HealthCheckResponse result = apiInstance.simplifyHcGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyHcGet");
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

<a id="simplifyOcrPost"></a>
# **simplifyOcrPost**
> StatusResponse simplifyOcrPost(simplifyOcrRequest)

Simplify scanned image or document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    SimplifyOcrRequest simplifyOcrRequest = new SimplifyOcrRequest(); // SimplifyOcrRequest | String in body of request, containing JSON with parameters for simplifying.
    try {
      StatusResponse result = apiInstance.simplifyOcrPost(simplifyOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyOcrPost");
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
| **simplifyOcrRequest** | [**SimplifyOcrRequest**](SimplifyOcrRequest.md)| String in body of request, containing JSON with parameters for simplifying. | [optional] |

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

<a id="simplifySupportedConversionsGet"></a>
# **simplifySupportedConversionsGet**
> List&lt;String&gt; simplifySupportedConversionsGet(format)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    String format = "Unknown"; // String | 
    try {
      List<String> result = apiInstance.simplifySupportedConversionsGet(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifySupportedConversionsGet");
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

<a id="simplifyTextPost"></a>
# **simplifyTextPost**
> StatusResponse simplifyTextPost(baseTextRequest)

Simplify text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    BaseTextRequest baseTextRequest = new BaseTextRequest(); // BaseTextRequest | String in body of request, containing JSON with parameters for simplifying.
    try {
      StatusResponse result = apiInstance.simplifyTextPost(baseTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyTextPost");
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
| **baseTextRequest** | [**BaseTextRequest**](BaseTextRequest.md)| String in body of request, containing JSON with parameters for simplifying. | [optional] |

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

<a id="simplifyTextRequestIdGet"></a>
# **simplifyTextRequestIdGet**
> SimplifyTextResponse simplifyTextRequestIdGet(requestId)

Return text simplifying status.  Also return simplified text if paraphrasing was successful

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/text response
    try {
      SimplifyTextResponse result = apiInstance.simplifyTextRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyTextRequestIdGet");
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

[**SimplifyTextResponse**](SimplifyTextResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="simplifyTextTrialPost"></a>
# **simplifyTextTrialPost**
> StatusResponse simplifyTextTrialPost(baseTextRequest)

Trial simplify text

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.SimplifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    SimplifyApi apiInstance = new SimplifyApi(defaultClient);
    BaseTextRequest baseTextRequest = new BaseTextRequest(); // BaseTextRequest | String in body of request, containing JSON with parameters for simplifying. Maximum 1000 characters
    try {
      StatusResponse result = apiInstance.simplifyTextTrialPost(baseTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimplifyApi#simplifyTextTrialPost");
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
| **baseTextRequest** | [**BaseTextRequest**](BaseTextRequest.md)| String in body of request, containing JSON with parameters for simplifying. Maximum 1000 characters | [optional] |

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

