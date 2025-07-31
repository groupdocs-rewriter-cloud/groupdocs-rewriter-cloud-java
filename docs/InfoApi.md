# InfoApi

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**infoAvailableLanguagesGet**](InfoApi.md#infoAvailableLanguagesGet) | **GET** /info/availableLanguages |  |


<a id="infoAvailableLanguagesGet"></a>
# **infoAvailableLanguagesGet**
> List&lt;LanguageInfo&gt; infoAvailableLanguagesGet()



### Example
```java
// Import classes:
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.Configuration;
import com.groupdocs.auth.*;
import com.groupdocs.models.*;
import org.openapitools.client.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.groupdocs.cloud/v2.0/rewriter");
    
    // Configure OAuth2 access token for authorization: JWT
    OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
    JWT.setAccessToken("YOUR ACCESS TOKEN");

    InfoApi apiInstance = new InfoApi(defaultClient);
    try {
      List<LanguageInfo> result = apiInstance.infoAvailableLanguagesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoAvailableLanguagesGet");
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

[**List&lt;LanguageInfo&gt;**](LanguageInfo.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

