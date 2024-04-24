# SwaggerApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**swaggerSpecGet**](SwaggerApi.md#swaggerSpecGet) | **GET** /swagger/spec |  |


<a id="swaggerSpecGet"></a>
# **swaggerSpecGet**
> swaggerSpecGet(isYaml, serialaizeAsV2)



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.models.*;
import org.openapitools.client.api.SwaggerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");

    SwaggerApi apiInstance = new SwaggerApi(defaultClient);
    Boolean isYaml = false; // Boolean | 
    Boolean serialaizeAsV2 = false; // Boolean | 
    try {
      apiInstance.swaggerSpecGet(isYaml, serialaizeAsV2);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwaggerApi#swaggerSpecGet");
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
| **isYaml** | **Boolean**|  | [optional] [default to false] |
| **serialaizeAsV2** | **Boolean**|  | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

