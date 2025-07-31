# EstimateApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**estimateDocumentPost**](EstimateApi.md#estimateDocumentPost) | **POST** /estimate/document | Estimate grade of the document |
| [**estimateDocumentRequestIdGet**](EstimateApi.md#estimateDocumentRequestIdGet) | **GET** /estimate/document/{requestId} | Return essay estimate grade. |


<a id="estimateDocumentPost"></a>
# **estimateDocumentPost**
> StatusResponse estimateDocumentPost(estimateRequest)

Estimate grade of the document

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.EstimateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    EstimateApi apiInstance = new EstimateApi(defaultClient);
    EstimateRequest estimateRequest = new EstimateRequest(); // EstimateRequest | String in body of request, containing JSON with parameters for estimatiom.
    try {
      StatusResponse result = apiInstance.estimateDocumentPost(estimateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EstimateApi#estimateDocumentPost");
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
| **estimateRequest** | [**EstimateRequest**](EstimateRequest.md)| String in body of request, containing JSON with parameters for estimatiom. | [optional] |

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

<a id="estimateDocumentRequestIdGet"></a>
# **estimateDocumentRequestIdGet**
> EstimateResponse estimateDocumentRequestIdGet(requestId)

Return essay estimate grade.

### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.EstimateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    EstimateApi apiInstance = new EstimateApi(defaultClient);
    String requestId = "requestId_example"; // String | GUID which got from /v3/rewriter/document response
    try {
      EstimateResponse result = apiInstance.estimateDocumentRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EstimateApi#estimateDocumentRequestIdGet");
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

[**EstimateResponse**](EstimateResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

