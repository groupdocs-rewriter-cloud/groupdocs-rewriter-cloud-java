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

import com.groupdocs.ApiException;
import com.groupdocs.model.HealthCheckResponse;
import com.groupdocs.model.StatusResponse;
import com.groupdocs.model.SummarizationFileRequest;
import com.groupdocs.model.SummarizationFileResponse;
import com.groupdocs.model.SummarizationMediaRequest;
import com.groupdocs.model.SummarizationOcrRequest;
import com.groupdocs.model.SummarizationTextRequest;
import com.groupdocs.model.SummarizationTextResponse;
import com.groupdocs.model.SummarizationTrialFileRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SummarizeApi
 */
@Disabled
public class SummarizeApiTest {

    private final SummarizeApi api = new SummarizeApi();

    /**
     * Summarize document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeDocumentPostTest() throws ApiException {
        SummarizationFileRequest summarizationFileRequest = null;
        StatusResponse response = api.summarizeDocumentPost(summarizationFileRequest);
        // TODO: test validations
    }

    /**
     * Return document summarizing status.  Also return URLs for downloading of summarized document if summarization was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeDocumentRequestIdGetTest() throws ApiException {
        String requestId = null;
        SummarizationFileResponse response = api.summarizeDocumentRequestIdGet(requestId);
        // TODO: test validations
    }

    /**
     * Trial summarize document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeDocumentTrialPostTest() throws ApiException {
        SummarizationTrialFileRequest summarizationTrialFileRequest = null;
        StatusResponse response = api.summarizeDocumentTrialPost(summarizationTrialFileRequest);
        // TODO: test validations
    }

    /**
     * Health check for all summarize services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeHcGetTest() throws ApiException {
        HealthCheckResponse response = api.summarizeHcGet();
        // TODO: test validations
    }

    /**
     * Summarize media file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeMediaPostTest() throws ApiException {
        SummarizationMediaRequest summarizationMediaRequest = null;
        StatusResponse response = api.summarizeMediaPost(summarizationMediaRequest);
        // TODO: test validations
    }

    /**
     * Summarize image or scanned PDF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeOcrPostTest() throws ApiException {
        SummarizationOcrRequest summarizationOcrRequest = null;
        StatusResponse response = api.summarizeOcrPost(summarizationOcrRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeSupportedConversionsGetTest() throws ApiException {
        String format = null;
        List<String> response = api.summarizeSupportedConversionsGet(format);
        // TODO: test validations
    }

    /**
     * Summarize text
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeTextPostTest() throws ApiException {
        SummarizationTextRequest summarizationTextRequest = null;
        StatusResponse response = api.summarizeTextPost(summarizationTextRequest);
        // TODO: test validations
    }

    /**
     * Return text summarizing status status.  Also return rewrote text if translation was successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeTextRequestIdGetTest() throws ApiException {
        String requestId = null;
        SummarizationTextResponse response = api.summarizeTextRequestIdGet(requestId);
        // TODO: test validations
    }

    /**
     * Trial summarize text
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeTextTrialPostTest() throws ApiException {
        SummarizationTextRequest summarizationTextRequest = null;
        StatusResponse response = api.summarizeTextTrialPost(summarizationTextRequest);
        // TODO: test validations
    }

}