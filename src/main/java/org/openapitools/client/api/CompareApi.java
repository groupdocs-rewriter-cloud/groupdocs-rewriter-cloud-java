/*
 * GroupDocs.Rewriter API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.11.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.groupdocs.ApiCallback;
import com.groupdocs.ApiClient;
import com.groupdocs.ApiException;
import com.groupdocs.ApiResponse;
import com.groupdocs.Configuration;
import com.groupdocs.Pair;
import com.groupdocs.ProgressRequestBody;
import com.groupdocs.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.groupdocs.model.CompareTextRequest;
import com.groupdocs.model.CompareTextResponse;
import com.groupdocs.model.HealthCheckResponse;
import com.groupdocs.model.StatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompareApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompareApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for compareHcGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareHcGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/compare/hc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call compareHcGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return compareHcGetCall(_callback);

    }

    /**
     * Health check for all comparer services.
     * 
     * @return HealthCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public HealthCheckResponse compareHcGet() throws ApiException {
        ApiResponse<HealthCheckResponse> localVarResp = compareHcGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Health check for all comparer services.
     * 
     * @return ApiResponse&lt;HealthCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HealthCheckResponse> compareHcGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = compareHcGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Health check for all comparer services. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareHcGetAsync(final ApiCallback<HealthCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = compareHcGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for compareTextPost
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextPostCall(CompareTextRequest compareTextRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = compareTextRequest;

        // create path and map variables
        String localVarPath = "/compare/text";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call compareTextPostValidateBeforeCall(CompareTextRequest compareTextRequest, final ApiCallback _callback) throws ApiException {
        return compareTextPostCall(compareTextRequest, _callback);

    }

    /**
     * Compare texts and detect if one is translation or paraphrase of another
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @return StatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public StatusResponse compareTextPost(CompareTextRequest compareTextRequest) throws ApiException {
        ApiResponse<StatusResponse> localVarResp = compareTextPostWithHttpInfo(compareTextRequest);
        return localVarResp.getData();
    }

    /**
     * Compare texts and detect if one is translation or paraphrase of another
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @return ApiResponse&lt;StatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatusResponse> compareTextPostWithHttpInfo(CompareTextRequest compareTextRequest) throws ApiException {
        okhttp3.Call localVarCall = compareTextPostValidateBeforeCall(compareTextRequest, null);
        Type localVarReturnType = new TypeToken<StatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Compare texts and detect if one is translation or paraphrase of another (asynchronously)
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextPostAsync(CompareTextRequest compareTextRequest, final ApiCallback<StatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = compareTextPostValidateBeforeCall(compareTextRequest, _callback);
        Type localVarReturnType = new TypeToken<StatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for compareTextRequestIdGet
     * @param requestId GUID which got from /v3/compare/text response (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextRequestIdGetCall(String requestId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/compare/text/{requestId}"
            .replace("{" + "requestId" + "}", localVarApiClient.escapeString(requestId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call compareTextRequestIdGetValidateBeforeCall(String requestId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling compareTextRequestIdGet(Async)");
        }

        return compareTextRequestIdGetCall(requestId, _callback);

    }

    /**
     * Return text comparing status.  Also return probability if one text is paraphrasing or translation of another
     * 
     * @param requestId GUID which got from /v3/compare/text response (required)
     * @return CompareTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CompareTextResponse compareTextRequestIdGet(String requestId) throws ApiException {
        ApiResponse<CompareTextResponse> localVarResp = compareTextRequestIdGetWithHttpInfo(requestId);
        return localVarResp.getData();
    }

    /**
     * Return text comparing status.  Also return probability if one text is paraphrasing or translation of another
     * 
     * @param requestId GUID which got from /v3/compare/text response (required)
     * @return ApiResponse&lt;CompareTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompareTextResponse> compareTextRequestIdGetWithHttpInfo(String requestId) throws ApiException {
        okhttp3.Call localVarCall = compareTextRequestIdGetValidateBeforeCall(requestId, null);
        Type localVarReturnType = new TypeToken<CompareTextResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Return text comparing status.  Also return probability if one text is paraphrasing or translation of another (asynchronously)
     * 
     * @param requestId GUID which got from /v3/compare/text response (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextRequestIdGetAsync(String requestId, final ApiCallback<CompareTextResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = compareTextRequestIdGetValidateBeforeCall(requestId, _callback);
        Type localVarReturnType = new TypeToken<CompareTextResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for compareTextSummarizationPost
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextSummarizationPostCall(CompareTextRequest compareTextRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = compareTextRequest;

        // create path and map variables
        String localVarPath = "/compare/text/summarization";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call compareTextSummarizationPostValidateBeforeCall(CompareTextRequest compareTextRequest, final ApiCallback _callback) throws ApiException {
        return compareTextSummarizationPostCall(compareTextRequest, _callback);

    }

    /**
     * Compare texts and detect if one is summarization of another
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @return StatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public StatusResponse compareTextSummarizationPost(CompareTextRequest compareTextRequest) throws ApiException {
        ApiResponse<StatusResponse> localVarResp = compareTextSummarizationPostWithHttpInfo(compareTextRequest);
        return localVarResp.getData();
    }

    /**
     * Compare texts and detect if one is summarization of another
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @return ApiResponse&lt;StatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatusResponse> compareTextSummarizationPostWithHttpInfo(CompareTextRequest compareTextRequest) throws ApiException {
        okhttp3.Call localVarCall = compareTextSummarizationPostValidateBeforeCall(compareTextRequest, null);
        Type localVarReturnType = new TypeToken<StatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Compare texts and detect if one is summarization of another (asynchronously)
     * 
     * @param compareTextRequest String in body of request, containing JSON with parameters for comparison. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call compareTextSummarizationPostAsync(CompareTextRequest compareTextRequest, final ApiCallback<StatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = compareTextSummarizationPostValidateBeforeCall(compareTextRequest, _callback);
        Type localVarReturnType = new TypeToken<StatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}