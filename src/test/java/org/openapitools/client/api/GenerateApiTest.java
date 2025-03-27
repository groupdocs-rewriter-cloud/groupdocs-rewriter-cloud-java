/*
 * GroupDocs.Rewriter API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.3.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.groupdocs.ApiException;
import com.groupdocs.model.GenerateRequest;
import com.groupdocs.model.GenerateResponse;
import com.groupdocs.model.HealthCheckResponse;
import com.groupdocs.model.StatusResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenerateApi
 */
@Disabled
public class GenerateApiTest {

    private final GenerateApi api = new GenerateApi();

    /**
     * Generate cover letter based on job description and optionally CV and cover letter that should be adopted to this offer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateCoverLetterPostTest() throws ApiException {
        GenerateRequest generateRequest = null;
        StatusResponse response = api.generateCoverLetterPost(generateRequest);
        // TODO: test validations
    }

    /**
     * Health check for generation services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateHcGetTest() throws ApiException {
        HealthCheckResponse response = api.generateHcGet();
        // TODO: test validations
    }

    /**
     * Return generation status.  Also return generated result
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateRequestIdGetTest() throws ApiException {
        String requestId = null;
        GenerateResponse response = api.generateRequestIdGet(requestId);
        // TODO: test validations
    }

    /**
     * Generate test exercise based on job description and optionally CV
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTestExercisePostTest() throws ApiException {
        GenerateRequest generateRequest = null;
        StatusResponse response = api.generateTestExercisePost(generateRequest);
        // TODO: test validations
    }

    /**
     * Generate questions for technical interview based on job description and optionally CV
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTestQuestionsPostTest() throws ApiException {
        GenerateRequest generateRequest = null;
        StatusResponse response = api.generateTestQuestionsPost(generateRequest);
        // TODO: test validations
    }

}
