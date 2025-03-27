package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.ParaphraseApi;
import org.openapitools.client.api.FileApi;
import java.io.File;

public class Demo {
    public static void main(String[] args) {
        // Get Client Id and Client Secret from https://dashboard.groupdocs.cloud
        String basePath = "https://api.groupdocs.cloud/v2.0/rewriter";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";
        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);

        // Upload file
        FileApi fileApi = new FileApi(defaultClient);
        String fileName = "FILE_NAME";
        File fileToUpload = new File(fileName);
        String file_url = null;

        try {
            file_url = fileApi.fileUploadPost("pdf", fileToUpload);
            System.out.println(file_url);
        }
        catch(ApiException e){
            System.err.println("Exception when calling FileApi#fileUploadPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

        // Create instance of the ParaphraseApi if the file was uploaded successfully
        if (file_url != null){
            ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);

            ParaphraseFileRequest fileRequest = new ParaphraseFileRequest();

            fileRequest.setLanguage("en");
            fileRequest.setFormat(ParaphraseSupportedFormats.PDF);
            fileRequest.setOutputFormat(SupportedConversionsFormats.PDF);
            fileRequest.setSavingMode(FileSavingMode.FILES);
            fileRequest.setUrl(file_url);
            fileRequest.setOrigin("");

            try {
                StatusResponse response = apiInstance.paraphraseDocumentPost(fileRequest);
                String response_id = response.getId();
                if (!response.getStatus().toString().equals("500")) {
                    while (true) {
                        ParaphraseFileResponse paraphraseResponse = apiInstance.paraphraseDocumentRequestIdGet(response_id);
                        System.out.println(paraphraseResponse);
                        if (paraphraseResponse.getStatus().toString().equals("200") || paraphraseResponse.getStatus().toString().equals("OK")) {
                            System.out.println(paraphraseResponse);
                            break;
                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (ApiException e) {
                System.err.println("Exception when calling ParaphraseApi#paraphraseDocumentPost");
                System.err.println("Status code: " + e.getCode());
                System.err.println("Reason: " + e.getResponseBody());
                System.err.println("Response headers: " + e.getResponseHeaders());
                e.printStackTrace();
            }
        }
    }
}