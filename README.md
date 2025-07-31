# Java SDK for GroupDocs.Rewriter Cloud

![](https://img.shields.io/badge/api-v2.0-lightgrey) ![GitHub license](https://img.shields.io/github/license/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet)

[Product Page](https://products.groupdocs.cloud/rewriter/java/) | [Documentation](https://docs.groupdocs.cloud/rewriter/) | [Demos](https://products.groupdocs.app/rewriter/family) | [Swagger UI](https://reference.groupdocs.cloud/rewriter/) | [Examples](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/rewriter/) | [Search](https://search.groupdocs.cloud/) | [Free Support](https://forum.groupdocs.cloud/c/rewriter) | [Free Trial](https://purchase.groupdocs.cloud/trial)

GroupDocs.Rewriter Cloud SDK for Java is a simple Java SDK that enables your cloud Apps to perform paraphrasing, simplification, summarization, comparison,  formalization, synonymization, generation of CV, cover letter, keywords or video descriptions, detection of paraphrased, summarized and AI generated content in documents of different formats, images and scans, audio and video files as well as plain text by adding just a few lines of code.

In other words, it's a SDK for document and plain text rewriting, summarization, etc. in our Cloud, that supports paraphrasing of .doc, .docx, .docm, .pdf, .rtf, .odt, .md, .html, .txt and many other file types. Just pass a specific file or text to the GroupDocs.Rewriter Cloud API, and it will process and save result in our Cloud or will return resulting text.

It is easy to get started with GroupDocs.Rewriter Cloud and there is nothing to install. Create an account at GroupDocs Cloud and get your application information, then you are ready to use SDKs.

## Cloud Features

- Paraphrasing / summarization / simplification / paraphrase detection of documents
- Paraphrasing / summarization / simplification / paraphrase detection of images and scans
- Paraphrasing / summarization / simplification / paraphrase detection / comparison of plain text
- Summarization of audio and video files
- eBooks summarization
- Words and idioms synonyms finder
- Texts comparison to detect if one text is paraphrase or translation of another
- AI generated texts detection
- Generation of cover letters and text exercises
- CV improvement based on current CV and job offer
- Essay grade estimation
- Keywords generation for web pages
- Video description generation
- Return resulting text in responseA
- Save processed file in cloud
- No need to install any 3rd party software

## Supported Document Formats

You can specify format of document to process putting in the request’s body:

- **Microsoft Word®:** DOC, DOCX, DOCM
- **Microsoft Word®:** PPT, PPTX, PPTM
- **Adobe®:** PDF
- **Markdown:** MD
- **HTML:** HTML
- **Audio / Video:** MP3, WAV, FLAC, M4A, AAC, WMA, FLV, MKV, WEBM, AVI,  MOV, WMV, RM, MPG
- **Images:** BMP, JPG, PNG, SVG, GIF
- **eBooks:** EPUB, MOBI, AZW3
- **Other:** RTF, ODT, TXT

Additionally, user could obtain processed file in any other format available for conversion. Just specify output format of paraphrased document by putting file extension in the request’s body:

- **doc, docx** — docx, rtf, html, odt, txt, md, pdf, tiff, svg, xps
- **pdf** — docx, pptx, html, svg, xps
- **html** — md, pdf, docx, tiff, xps

Please visit [Supported Formats](https://docs.groupdocs.cloud/rewriter/supported-formats/) for details.

## Supported Languages

- **ar** — to process Arabic text or document
- **de** — to process German text or document
- **en** — to process English text or document
- **es** — to process Spanish text or document
- **fi** — to process Finnish text or document
- **fr** — to process French text or document
- **hi** — to process Hindi text or document
- **id** — to process Indonesian text or document
- **it** — to process Italian text or document
- **ja** — to process Japanese text or document
- **lt** — to process Lithuanian text or document
- **pt** — to process Portuguese text or document
- **ru** — to process Russian text or document
- **sk** — to process Slovak text or document
- **th** — to process Thai text or document
- **tr** — to process Turkish text or document
- **uk** — to process Ukrainian text or document
- **zh** — to process Chinese text or document

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we provide and support [SDKs](https://github.com/groupdocs-rewriter-cloud) in many development languages to make it easier for your Cloud Apps to integrate with us.

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.groupdocs</groupId>
  <artifactId>GroupDocs-rewriter-cloud</artifactId>
  <version>25.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'GroupDocs-rewriter-cloud' jar has been published to maven central.
    mavenLocal()       // Needed if the 'GroupDocs-rewriter-cloud' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.groupdocs:GroupDocs-rewriter-cloud:25.7"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/GroupDocs-rewriter-cloud-25.7.jar`
* `target/lib/*.jar`

## Quickstart

#### 1. Get Started

It is easy to get started with GroupDocs.Rewriter Cloud. Simply, create an account at [GroupDocs Cloud](https://dashboard.groupdocs.cloud/#/apps) and get your application information, then you are ready to use the [SDKs](https://github.com/groupdocs-rewriter-cloud).

#### 2. Run Demo
* Checkout the SDK
* Open Demo.java
* Set Your ClientId & ClientSecret
* Run

## Rewrite plain text

```java
package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.ParaphraseApi;

public class Demo {
    public static void main(String[] args) {
        String basePath = "https://api.groupdocs.cloud/v2.0/rewriter";
        // Get Client Id and Client Secret from https://dashboard.groupdocs.cloud
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";
        
        // Create instance of the API
        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        ParaphraseApi apiInstance = new ParaphraseApi(defaultClient);

        String s = "TEXT_TO_PARAPHRASE";

        ParaphraseTextRequest request = new ParaphraseTextRequest();
        request.setLanguage("en");
        request.setText(s);

        try {
            StatusResponse response = apiInstance.paraphraseTextPost(request);
            String response_id = response.getId();
            if (!response.getStatus().toString().equals("BadRequest")){
                while (true){
                    ParaphraseTextResponse paraphraseTextResponse = apiInstance.paraphraseTextRequestIdGet(response_id);
                    if (paraphraseTextResponse.getStatus().toString().equals("OK")) {
                        System.out.println(paraphraseTextResponse);
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
            System.err.println("Exception when calling ParaphraseApi#paraphraseTextPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.groupdocs.cloud/v2.0/rewriter*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompareApi* | [**compareHcGet**](docs/CompareApi.md#compareHcGet) | **GET** /compare/hc | Health check for all comparer services.
*CompareApi* | [**compareTextPost**](docs/CompareApi.md#compareTextPost) | **POST** /compare/text | Compare texts and detect if one is translation or paraphrase of another
*CompareApi* | [**compareTextRequestIdGet**](docs/CompareApi.md#compareTextRequestIdGet) | **GET** /compare/text/{requestId} | Return text comparing status.  Also return probability if one text is paraphrasing or translation of another
*CompareApi* | [**compareTextSummarizationPost**](docs/CompareApi.md#compareTextSummarizationPost) | **POST** /compare/text/summarization | Compare texts and detect if one is summarization of another
*DetectApi* | [**detectAiGenerationDocumentPost**](docs/DetectApi.md#detectAiGenerationDocumentPost) | **POST** /detect/ai-generation/document | Detect ai generated text in the document
*DetectApi* | [**detectAiGenerationOcrPost**](docs/DetectApi.md#detectAiGenerationOcrPost) | **POST** /detect/ai-generation/ocr | Detect ai generation content in the image or scanned document
*DetectApi* | [**detectAiGenerationTextPost**](docs/DetectApi.md#detectAiGenerationTextPost) | **POST** /detect/ai-generation/text | Detect ai generated text
*DetectApi* | [**detectDocumentPost**](docs/DetectApi.md#detectDocumentPost) | **POST** /detect/document | Obsolete. Will be removed in the next version, use /detect/paraphrase/document/ instead this.
*DetectApi* | [**detectDocumentRequestIdGet**](docs/DetectApi.md#detectDocumentRequestIdGet) | **GET** /detect/document/{requestId} | Return document detection status.  Also return probability of paraphrasing for the whole document and per paragraph
*DetectApi* | [**detectDocumentTrialPost**](docs/DetectApi.md#detectDocumentTrialPost) | **POST** /detect/document/trial | Trial detect paraphrasing in the document
*DetectApi* | [**detectHcGet**](docs/DetectApi.md#detectHcGet) | **GET** /detect/hc | Health check for detect all services.
*DetectApi* | [**detectOcrPost**](docs/DetectApi.md#detectOcrPost) | **POST** /detect/ocr | Obsolete. Will be removed in the next version, use /detect/paraphrase/ocr instead this.
*DetectApi* | [**detectParaphraseDocumentPost**](docs/DetectApi.md#detectParaphraseDocumentPost) | **POST** /detect/paraphrase/document | Detect paraphrasing in the document
*DetectApi* | [**detectParaphraseOcrPost**](docs/DetectApi.md#detectParaphraseOcrPost) | **POST** /detect/paraphrase/ocr | Detect paraphrasing in the image or scanned document
*DetectApi* | [**detectParaphraseTextPost**](docs/DetectApi.md#detectParaphraseTextPost) | **POST** /detect/paraphrase/text | Detect paraphrasing in text
*DetectApi* | [**detectSummarizationDocumentPost**](docs/DetectApi.md#detectSummarizationDocumentPost) | **POST** /detect/summarization/document | Detect summarization in the document
*DetectApi* | [**detectSummarizationOcrPost**](docs/DetectApi.md#detectSummarizationOcrPost) | **POST** /detect/summarization/ocr | Detect summarization in the image or scanned document
*DetectApi* | [**detectSummarizationTextPost**](docs/DetectApi.md#detectSummarizationTextPost) | **POST** /detect/summarization/text | Detect summarization in text
*DetectApi* | [**detectTextPost**](docs/DetectApi.md#detectTextPost) | **POST** /detect/text | Obsolete. Will be removed in the next version, use /detect/paraphrase/text instead this.
*DetectApi* | [**detectTextRequestIdGet**](docs/DetectApi.md#detectTextRequestIdGet) | **GET** /detect/text/{requestId} | Return text detection status.  Also return probability of paraphrasing for the whole text
*DetectApi* | [**detectTextTrialPost**](docs/DetectApi.md#detectTextTrialPost) | **POST** /detect/text/trial | Trial detect paraphrasing in text
*EstimateApi* | [**estimateDocumentPost**](docs/EstimateApi.md#estimateDocumentPost) | **POST** /estimate/document | Estimate grade of the document
*EstimateApi* | [**estimateDocumentRequestIdGet**](docs/EstimateApi.md#estimateDocumentRequestIdGet) | **GET** /estimate/document/{requestId} | Return essay estimate grade.
*FileApi* | [**fileUploadPost**](docs/FileApi.md#fileUploadPost) | **POST** /file/upload |
*FormalizeApi* | [**formalizeDocumentPost**](docs/FormalizeApi.md#formalizeDocumentPost) | **POST** /formalize/document | Formalize document
*FormalizeApi* | [**formalizeDocumentRequestIdGet**](docs/FormalizeApi.md#formalizeDocumentRequestIdGet) | **GET** /formalize/document/{requestId} | Return document formalizinh status.  Also return URLs for downloading of formalized document if paraphrasing was successful
*FormalizeApi* | [**formalizeHcGet**](docs/FormalizeApi.md#formalizeHcGet) | **GET** /formalize/hc | Health check for all simplify services.
*FormalizeApi* | [**formalizeOcrPost**](docs/FormalizeApi.md#formalizeOcrPost) | **POST** /formalize/ocr | Formalize scanned image or document
*FormalizeApi* | [**formalizeSupportedConversionsGet**](docs/FormalizeApi.md#formalizeSupportedConversionsGet) | **GET** /formalize/supportedConversions |
*FormalizeApi* | [**formalizeTextPost**](docs/FormalizeApi.md#formalizeTextPost) | **POST** /formalize/text | Formalize text
*FormalizeApi* | [**formalizeTextRequestIdGet**](docs/FormalizeApi.md#formalizeTextRequestIdGet) | **GET** /formalize/text/{requestId} | Return text formalizing status.  Also return formalized text if paraphrasing was successful
*GenerateApi* | [**generateCoverLetterPost**](docs/GenerateApi.md#generateCoverLetterPost) | **POST** /generate/cover-letter | Generate cover letter based on job description and optionally CV and cover letter that should be adopted to this offer
*GenerateApi* | [**generateCvPost**](docs/GenerateApi.md#generateCvPost) | **POST** /generate/cv | Generate CV adopted to job description and optionally original CV
*GenerateApi* | [**generateHcGet**](docs/GenerateApi.md#generateHcGet) | **GET** /generate/hc | Health check for generation services.
*GenerateApi* | [**generateKeywordsPost**](docs/GenerateApi.md#generateKeywordsPost) | **POST** /generate/keywords | Generate keywords for provided web page
*GenerateApi* | [**generateRequestIdGet**](docs/GenerateApi.md#generateRequestIdGet) | **GET** /generate/{requestId} | Return generation status.  Also return generated result
*GenerateApi* | [**generateTestExercisePost**](docs/GenerateApi.md#generateTestExercisePost) | **POST** /generate/test-exercise | Generate test exercise based on job description and optionally CV
*GenerateApi* | [**generateTestQuestionsPost**](docs/GenerateApi.md#generateTestQuestionsPost) | **POST** /generate/test-questions | Generate questions for technical interview based on job description and optionally CV
*GenerateApi* | [**generateVideoDescriptionPost**](docs/GenerateApi.md#generateVideoDescriptionPost) | **POST** /generate/video-description | Generate video description for provided video file
*InfoApi* | [**infoAvailableLanguagesGet**](docs/InfoApi.md#infoAvailableLanguagesGet) | **GET** /info/availableLanguages |
*ParaphraseApi* | [**paraphraseDocumentPost**](docs/ParaphraseApi.md#paraphraseDocumentPost) | **POST** /paraphrase/document | Paraphrase document
*ParaphraseApi* | [**paraphraseDocumentRequestIdGet**](docs/ParaphraseApi.md#paraphraseDocumentRequestIdGet) | **GET** /paraphrase/document/{requestId} | Return document rewriting status.  Also return URLs for downloading of rewritten document if paraphrasig was successful
*ParaphraseApi* | [**paraphraseDocumentTrialPost**](docs/ParaphraseApi.md#paraphraseDocumentTrialPost) | **POST** /paraphrase/document/trial | Trial paraphrase document
*ParaphraseApi* | [**paraphraseHcGet**](docs/ParaphraseApi.md#paraphraseHcGet) | **GET** /paraphrase/hc | Health check for all paraphrase services.
*ParaphraseApi* | [**paraphraseOcrPost**](docs/ParaphraseApi.md#paraphraseOcrPost) | **POST** /paraphrase/ocr | Rewrite scanned image or PDF
*ParaphraseApi* | [**paraphraseSupportedConversionsGet**](docs/ParaphraseApi.md#paraphraseSupportedConversionsGet) | **GET** /paraphrase/supportedConversions |
*ParaphraseApi* | [**paraphraseTextPost**](docs/ParaphraseApi.md#paraphraseTextPost) | **POST** /paraphrase/text | Rewrite text
*ParaphraseApi* | [**paraphraseTextRequestIdGet**](docs/ParaphraseApi.md#paraphraseTextRequestIdGet) | **GET** /paraphrase/text/{requestId} | Return text rewriting status.  Also return rewritten text if paraphrasing was successful
*ParaphraseApi* | [**paraphraseTextTrialPost**](docs/ParaphraseApi.md#paraphraseTextTrialPost) | **POST** /paraphrase/text/trial | Trial rewrite text
*SimplifyApi* | [**simplifyDocumentPost**](docs/SimplifyApi.md#simplifyDocumentPost) | **POST** /simplify/document | Simplify document
*SimplifyApi* | [**simplifyDocumentRequestIdGet**](docs/SimplifyApi.md#simplifyDocumentRequestIdGet) | **GET** /simplify/document/{requestId} | Return document simplifying status.  Also return URLs for downloading of simplified document if paraphrasig was successful
*SimplifyApi* | [**simplifyDocumentTrialPost**](docs/SimplifyApi.md#simplifyDocumentTrialPost) | **POST** /simplify/document/trial | Trial simplify document
*SimplifyApi* | [**simplifyHcGet**](docs/SimplifyApi.md#simplifyHcGet) | **GET** /simplify/hc | Health check for all simplify services.
*SimplifyApi* | [**simplifyOcrPost**](docs/SimplifyApi.md#simplifyOcrPost) | **POST** /simplify/ocr | Simplify scanned image or document
*SimplifyApi* | [**simplifySupportedConversionsGet**](docs/SimplifyApi.md#simplifySupportedConversionsGet) | **GET** /simplify/supportedConversions |
*SimplifyApi* | [**simplifyTextPost**](docs/SimplifyApi.md#simplifyTextPost) | **POST** /simplify/text | Simplify text
*SimplifyApi* | [**simplifyTextRequestIdGet**](docs/SimplifyApi.md#simplifyTextRequestIdGet) | **GET** /simplify/text/{requestId} | Return text simplifying status.  Also return simplified text if paraphrasing was successful
*SimplifyApi* | [**simplifyTextTrialPost**](docs/SimplifyApi.md#simplifyTextTrialPost) | **POST** /simplify/text/trial | Trial simplify text
*SummarizeApi* | [**summarizeDocumentPost**](docs/SummarizeApi.md#summarizeDocumentPost) | **POST** /summarize/document | Summarize document
*SummarizeApi* | [**summarizeDocumentRequestIdGet**](docs/SummarizeApi.md#summarizeDocumentRequestIdGet) | **GET** /summarize/document/{requestId} | Return document summarizing status.  Also return URLs for downloading of summarized document if summarization was successful
*SummarizeApi* | [**summarizeDocumentTrialPost**](docs/SummarizeApi.md#summarizeDocumentTrialPost) | **POST** /summarize/document/trial | Trial summarize document
*SummarizeApi* | [**summarizeHcGet**](docs/SummarizeApi.md#summarizeHcGet) | **GET** /summarize/hc | Health check for all summarize services.
*SummarizeApi* | [**summarizeMediaPost**](docs/SummarizeApi.md#summarizeMediaPost) | **POST** /summarize/media | Summarize media file
*SummarizeApi* | [**summarizeOcrPost**](docs/SummarizeApi.md#summarizeOcrPost) | **POST** /summarize/ocr | Summarize image or scanned PDF
*SummarizeApi* | [**summarizeSupportedConversionsGet**](docs/SummarizeApi.md#summarizeSupportedConversionsGet) | **GET** /summarize/supportedConversions |
*SummarizeApi* | [**summarizeTextPost**](docs/SummarizeApi.md#summarizeTextPost) | **POST** /summarize/text | Summarize text
*SummarizeApi* | [**summarizeTextRequestIdGet**](docs/SummarizeApi.md#summarizeTextRequestIdGet) | **GET** /summarize/text/{requestId} | Return text summarizing status status.  Also return rewrote text if translation was successful
*SummarizeApi* | [**summarizeTextTrialPost**](docs/SummarizeApi.md#summarizeTextTrialPost) | **POST** /summarize/text/trial | Trial summarize text
*SwaggerApi* | [**swaggerSpecGet**](docs/SwaggerApi.md#swaggerSpecGet) | **GET** /swagger/spec |
*SynonymizeApi* | [**synonymizeDocumentPost**](docs/SynonymizeApi.md#synonymizeDocumentPost) | **POST** /synonymize/document | Synonyize document
*SynonymizeApi* | [**synonymizeHcGet**](docs/SynonymizeApi.md#synonymizeHcGet) | **GET** /synonymize/hc | Health check for all synonymizer services.
*SynonymizeApi* | [**synonymizeOcrPost**](docs/SynonymizeApi.md#synonymizeOcrPost) | **POST** /synonymize/ocr | Synonymize scanned image or document
*SynonymizeApi* | [**synonymizeTextPost**](docs/SynonymizeApi.md#synonymizeTextPost) | **POST** /synonymize/text | Synonymize word
*SynonymizeApi* | [**synonymizeTextRequestIdGet**](docs/SynonymizeApi.md#synonymizeTextRequestIdGet) | **GET** /synonymize/text/{requestId} | Return text synonymizing status.  Also return list of synonyms if it was successful
*SynonymizeApi* | [**synonymizeTextTrialPost**](docs/SynonymizeApi.md#synonymizeTextTrialPost) | **POST** /synonymize/text/trial | Trial synonymize word


## Documentation for Models

- [BaseTextRequest](docs/BaseTextRequest.md)
- [CloudTextRequest](docs/CloudTextRequest.md)
- [CompareTextRequest](docs/CompareTextRequest.md)
- [CompareTextResponse](docs/CompareTextResponse.md)
- [DegreeEnum](docs/DegreeEnum.md)
- [DetectionFileRequest](docs/DetectionFileRequest.md)
- [DetectionFileResponse](docs/DetectionFileResponse.md)
- [DetectionOcrRequest](docs/DetectionOcrRequest.md)
- [DetectionSupportedFormats](docs/DetectionSupportedFormats.md)
- [DetectionTextRequest](docs/DetectionTextRequest.md)
- [DetectionTextResponse](docs/DetectionTextResponse.md)
- [DetectionTrialFileRequest](docs/DetectionTrialFileRequest.md)
- [EstimateRequest](docs/EstimateRequest.md)
- [EstimateResponse](docs/EstimateResponse.md)
- [FileSavingMode](docs/FileSavingMode.md)
- [FormalizeFileRequest](docs/FormalizeFileRequest.md)
- [FormalizeFileResponse](docs/FormalizeFileResponse.md)
- [FormalizeOcrRequest](docs/FormalizeOcrRequest.md)
- [FormalizeSupportedFromats](docs/FormalizeSupportedFromats.md)
- [FormalizeTextRequest](docs/FormalizeTextRequest.md)
- [FormalizeTextResponse](docs/FormalizeTextResponse.md)
- [GenerateKeywordsRequest](docs/GenerateKeywordsRequest.md)
- [GenerateRequest](docs/GenerateRequest.md)
- [GenerateResponse](docs/GenerateResponse.md)
- [GenerateVideoDescriptionRequest](docs/GenerateVideoDescriptionRequest.md)
- [HealthCheckInfo](docs/HealthCheckInfo.md)
- [HealthCheckResponse](docs/HealthCheckResponse.md)
- [HttpStatusCode](docs/HttpStatusCode.md)
- [LanguageInfo](docs/LanguageInfo.md)
- [MediaInputFormat](docs/MediaInputFormat.md)
- [Model](docs/Model.md)
- [OcrInputFormat](docs/OcrInputFormat.md)
- [OcrOutputFormat](docs/OcrOutputFormat.md)
- [Opt](docs/Opt.md)
- [ParaphraseFileRequest](docs/ParaphraseFileRequest.md)
- [ParaphraseFileResponse](docs/ParaphraseFileResponse.md)
- [ParaphraseOcrRequest](docs/ParaphraseOcrRequest.md)
- [ParaphraseSupportedFormats](docs/ParaphraseSupportedFormats.md)
- [ParaphraseTextRequest](docs/ParaphraseTextRequest.md)
- [ParaphraseTextResponse](docs/ParaphraseTextResponse.md)
- [ParaphraseTrialFileRequest](docs/ParaphraseTrialFileRequest.md)
- [SimplifyFileRequest](docs/SimplifyFileRequest.md)
- [SimplifyFileResponse](docs/SimplifyFileResponse.md)
- [SimplifyOcrRequest](docs/SimplifyOcrRequest.md)
- [SimplifySupportedFromats](docs/SimplifySupportedFromats.md)
- [SimplifyTextResponse](docs/SimplifyTextResponse.md)
- [SimplifyTrialFileRequest](docs/SimplifyTrialFileRequest.md)
- [StatusResponse](docs/StatusResponse.md)
- [SummarizationFileRequest](docs/SummarizationFileRequest.md)
- [SummarizationFileResponse](docs/SummarizationFileResponse.md)
- [SummarizationMediaRequest](docs/SummarizationMediaRequest.md)
- [SummarizationOcrRequest](docs/SummarizationOcrRequest.md)
- [SummarizationSupportedFormats](docs/SummarizationSupportedFormats.md)
- [SummarizationTextRequest](docs/SummarizationTextRequest.md)
- [SummarizationTextResponse](docs/SummarizationTextResponse.md)
- [SummarizationTrialFileRequest](docs/SummarizationTrialFileRequest.md)
- [SupportedConversionsFormats](docs/SupportedConversionsFormats.md)
- [SynonymizeFileRequest](docs/SynonymizeFileRequest.md)
- [SynonymizeOcrRequest](docs/SynonymizeOcrRequest.md)
- [SynonymizeTextRequest](docs/SynonymizeTextRequest.md)
- [SynonymizeTextResponse](docs/SynonymizeTextResponse.md)
- [Tokenizer](docs/Tokenizer.md)
- [TrialSupportedFormats](docs/TrialSupportedFormats.md)


## GroupDocs.Rewriter Cloud SDKs in Popular Languages

| .NET | Python | Java | Android | Go |
|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-dotnet) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-python) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-android) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Rewriter-Cloud/) | [PyPi](https://pypi.org/project/groupdocs-rewriter-cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-rewriter-cloud) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-rewriter-cloud-android) | |

---

[Product Page](https://products.groupdocs.cloud/rewriter/java/) | [Docs](https://docs.groupdocs.cloud/rewriter/) | [Demos](https://products.groupdocs.app/rewriter/family) | [Swagger UI](https://apireference.groupdocs.cloud/rewriter/) | [Examples](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/rewriter/) | [Search](https://search.groupdocs.cloud/) | [Free Support](https://forum.groupdocs.cloud/c/rewriter) | [Free Trial](https://purchase.groupdocs.cloud/trial)



