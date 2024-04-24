# Java SDK for GroupDocs.Rewriter Cloud

![](https://img.shields.io/badge/api-v2.0-lightgrey) ![GitHub license](https://img.shields.io/github/license/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet)

[Product Page](https://products.groupdocs.cloud/rewriter/java/) | [Documentation](https://docs.groupdocs.cloud/rewriter/) | [Demos](https://products.groupdocs.app/rewriter/family) | [Swagger UI](https://reference.groupdocs.cloud/rewriter/) | [Examples](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/rewriter/) | [Search](https://search.groupdocs.cloud/) | [Free Support](https://forum.groupdocs.cloud/c/rewriter) | [Free Trial](https://purchase.groupdocs.cloud/trial)

GroupDocs.Rewriter Cloud SDK for Java is a simple Python SDK that enables your cloud Apps to perform paraphrasing, simplification, summarization and paraphrasing detection of Microsoft Word®, OpenOffice, Markdown, HTML and Adobe Acrobat® PDF documents as well as plain text by adding just a few lines of code.

In other words, it's a SDK for document and plain text rewriting, summarization, etc. in our Cloud, that supports paraphrasing of .doc, .docx, .docm, .pdf, .rtf, .odt, .md, .html, .txt files. Just pass a specific file or text to the GroupDocs.Rewriter Cloud API, and it will process and save result in our Cloud or will return resulting text.

It is easy to get started with GroupDocs.Rewriter Cloud and there is nothing to install. Create an account at GroupDocs Cloud and get your application information, then you are ready to use SDKs.

## Cloud Features

- Paraphrasing / summarization / simplification / paraphrase detection of documents
- Paraphrasing / summarization / simplification / paraphrase detection / comparison of plain text
- Words and idioms synonyms finder
- Return resulting text in response
- Save processed file in cloud
- No need to install any 3rd party software

## Supported Document Formats

You can specify format of document to process putting in the request’s body:

- **Microsoft Word®:** DOC, DOCX, DOCM
- **Adobe®:** PDF
- **Markdown:** MD
- **HTML:** HTML
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
- **fr** — to process French text or document
- **id** — to process Indonesian text or document
- **ru** — to process Russian text or document
- **uk** — to process Ukrainian text or document
- **sk** — to process Slovak text or document
- **pt** — to process Portuguese text or document
- **it** — to process Italian text or document

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
  <version>24.4</version>
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
     implementation "com.groupdocs:GroupDocs-rewriter-cloud:24.4"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/GroupDocs-rewriter-cloud-24.4.jar`
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
*DetectApi* | [**detectDocumentPost**](docs/DetectApi.md#detectDocumentPost) | **POST** /detect/document | Detect paraphrasing in the document
*DetectApi* | [**detectDocumentRequestIdGet**](docs/DetectApi.md#detectDocumentRequestIdGet) | **GET** /detect/document/{requestId} | Return document detection status.  Also return probability of paraphrasing for the whole document and per paragraph
*DetectApi* | [**detectDocumentTrialPost**](docs/DetectApi.md#detectDocumentTrialPost) | **POST** /detect/document/trial | Trial detect paraphrasing in the document
*DetectApi* | [**detectHcGet**](docs/DetectApi.md#detectHcGet) | **GET** /detect/hc | Health check for detect all services.
*DetectApi* | [**detectTextPost**](docs/DetectApi.md#detectTextPost) | **POST** /detect/text | Detect paraphrasing in text
*DetectApi* | [**detectTextRequestIdGet**](docs/DetectApi.md#detectTextRequestIdGet) | **GET** /detect/text/{requestId} | Return text detection status.  Also return probability of paraphrasing for the whole text
*DetectApi* | [**detectTextTrialPost**](docs/DetectApi.md#detectTextTrialPost) | **POST** /detect/text/trial | Trial detect paraphrasing in text
*FileApi* | [**fileUploadPost**](docs/FileApi.md#fileUploadPost) | **POST** /file/upload | 
*InfoApi* | [**infoAvailableLanguagesGet**](docs/InfoApi.md#infoAvailableLanguagesGet) | **GET** /info/availableLanguages | 
*ParaphraseApi* | [**paraphraseDocumentPost**](docs/ParaphraseApi.md#paraphraseDocumentPost) | **POST** /paraphrase/document | Paraphrase document
*ParaphraseApi* | [**paraphraseDocumentRequestIdGet**](docs/ParaphraseApi.md#paraphraseDocumentRequestIdGet) | **GET** /paraphrase/document/{requestId} | Return document rewriting status.  Also return URLs for downloading of rewritten document if paraphrasig was successful
*ParaphraseApi* | [**paraphraseDocumentTrialPost**](docs/ParaphraseApi.md#paraphraseDocumentTrialPost) | **POST** /paraphrase/document/trial | Trial paraphrase document
*ParaphraseApi* | [**paraphraseHcGet**](docs/ParaphraseApi.md#paraphraseHcGet) | **GET** /paraphrase/hc | Health check for all paraphrase services.
*ParaphraseApi* | [**paraphraseSupportedConversionsGet**](docs/ParaphraseApi.md#paraphraseSupportedConversionsGet) | **GET** /paraphrase/supportedConversions | 
*ParaphraseApi* | [**paraphraseTextPost**](docs/ParaphraseApi.md#paraphraseTextPost) | **POST** /paraphrase/text | Rewrite text
*ParaphraseApi* | [**paraphraseTextRequestIdGet**](docs/ParaphraseApi.md#paraphraseTextRequestIdGet) | **GET** /paraphrase/text/{requestId} | Return text rewriting status.  Also return rewritten text if paraphrasing was successful
*ParaphraseApi* | [**paraphraseTextTrialPost**](docs/ParaphraseApi.md#paraphraseTextTrialPost) | **POST** /paraphrase/text/trial | Trial rewrite text
*SimplifyApi* | [**simplifyDocumentPost**](docs/SimplifyApi.md#simplifyDocumentPost) | **POST** /simplify/document | Simplify document
*SimplifyApi* | [**simplifyDocumentRequestIdGet**](docs/SimplifyApi.md#simplifyDocumentRequestIdGet) | **GET** /simplify/document/{requestId} | Return document simplifying status.  Also return URLs for downloading of simplified document if paraphrasig was successful
*SimplifyApi* | [**simplifyDocumentTrialPost**](docs/SimplifyApi.md#simplifyDocumentTrialPost) | **POST** /simplify/document/trial | Trial simplify document
*SimplifyApi* | [**simplifyHcGet**](docs/SimplifyApi.md#simplifyHcGet) | **GET** /simplify/hc | Health check for all simplify services.
*SimplifyApi* | [**simplifySupportedConversionsGet**](docs/SimplifyApi.md#simplifySupportedConversionsGet) | **GET** /simplify/supportedConversions | 
*SimplifyApi* | [**simplifyTextPost**](docs/SimplifyApi.md#simplifyTextPost) | **POST** /simplify/text | Simplify text
*SimplifyApi* | [**simplifyTextRequestIdGet**](docs/SimplifyApi.md#simplifyTextRequestIdGet) | **GET** /simplify/text/{requestId} | Return text simplifying status.  Also return simplified text if paraphrasing was successful
*SimplifyApi* | [**simplifyTextTrialPost**](docs/SimplifyApi.md#simplifyTextTrialPost) | **POST** /simplify/text/trial | Trial simplify text
*SummarizeApi* | [**summarizeDocumentPost**](docs/SummarizeApi.md#summarizeDocumentPost) | **POST** /summarize/document | Summarize document
*SummarizeApi* | [**summarizeDocumentRequestIdGet**](docs/SummarizeApi.md#summarizeDocumentRequestIdGet) | **GET** /summarize/document/{requestId} | Return document summarizing status.  Also return URLs for downloading of summarized document if summarization was successful
*SummarizeApi* | [**summarizeDocumentTrialPost**](docs/SummarizeApi.md#summarizeDocumentTrialPost) | **POST** /summarize/document/trial | Trial summarize document
*SummarizeApi* | [**summarizeHcGet**](docs/SummarizeApi.md#summarizeHcGet) | **GET** /summarize/hc | Health check for all summarize services.
*SummarizeApi* | [**summarizeSupportedConversionsGet**](docs/SummarizeApi.md#summarizeSupportedConversionsGet) | **GET** /summarize/supportedConversions | 
*SummarizeApi* | [**summarizeTextPost**](docs/SummarizeApi.md#summarizeTextPost) | **POST** /summarize/text | Summarize text
*SummarizeApi* | [**summarizeTextRequestIdGet**](docs/SummarizeApi.md#summarizeTextRequestIdGet) | **GET** /summarize/text/{requestId} | Return text summarizing status status.  Also return rewrote text if translation was successful
*SummarizeApi* | [**summarizeTextTrialPost**](docs/SummarizeApi.md#summarizeTextTrialPost) | **POST** /summarize/text/trial | Trial summarize text
*SwaggerApi* | [**swaggerSpecGet**](docs/SwaggerApi.md#swaggerSpecGet) | **GET** /swagger/spec | 
*SynonymizeApi* | [**synonymizeHcGet**](docs/SynonymizeApi.md#synonymizeHcGet) | **GET** /synonymize/hc | Health check for all synonymizer services.
*SynonymizeApi* | [**synonymizeTextPost**](docs/SynonymizeApi.md#synonymizeTextPost) | **POST** /synonymize/text | Synonymize word
*SynonymizeApi* | [**synonymizeTextRequestIdGet**](docs/SynonymizeApi.md#synonymizeTextRequestIdGet) | **GET** /synonymize/text/{requestId} | Return text synonymizing status.  Also return list of synonyms if it was successful
*SynonymizeApi* | [**synonymizeTextTrialPost**](docs/SynonymizeApi.md#synonymizeTextTrialPost) | **POST** /synonymize/text/trial | Trial synonymize word


## Documentation for Models

 - [BaseTextRequest](docs/BaseTextRequest.md)
 - [CloudTextRequest](docs/CloudTextRequest.md)
 - [DegreeEnum](docs/DegreeEnum.md)
 - [DetectionFileRequest](docs/DetectionFileRequest.md)
 - [DetectionFileResponse](docs/DetectionFileResponse.md)
 - [DetectionTextRequest](docs/DetectionTextRequest.md)
 - [DetectionTextResponse](docs/DetectionTextResponse.md)
 - [DetectionTrialFileRequest](docs/DetectionTrialFileRequest.md)
 - [FileSavingMode](docs/FileSavingMode.md)
 - [HealthCheckInfo](docs/HealthCheckInfo.md)
 - [HealthCheckResponse](docs/HealthCheckResponse.md)
 - [HttpStatusCode](docs/HttpStatusCode.md)
 - [LanguageInfo](docs/LanguageInfo.md)
 - [Model](docs/Model.md)
 - [Opt](docs/Opt.md)
 - [ParaphraseFileRequest](docs/ParaphraseFileRequest.md)
 - [ParaphraseFileResponse](docs/ParaphraseFileResponse.md)
 - [ParaphraseTextRequest](docs/ParaphraseTextRequest.md)
 - [ParaphraseTextResponse](docs/ParaphraseTextResponse.md)
 - [ParaphraseTrialFileRequest](docs/ParaphraseTrialFileRequest.md)
 - [SimplifyFileRequest](docs/SimplifyFileRequest.md)
 - [SimplifyFileResponse](docs/SimplifyFileResponse.md)
 - [SimplifyTextResponse](docs/SimplifyTextResponse.md)
 - [SimplifyTrialFileRequest](docs/SimplifyTrialFileRequest.md)
 - [StatusResponse](docs/StatusResponse.md)
 - [SummarizationFileRequest](docs/SummarizationFileRequest.md)
 - [SummarizationFileResponse](docs/SummarizationFileResponse.md)
 - [SummarizationTextRequest](docs/SummarizationTextRequest.md)
 - [SummarizationTextResponse](docs/SummarizationTextResponse.md)
 - [SummarizationTrialFileRequest](docs/SummarizationTrialFileRequest.md)
 - [SupportedConversionsFormats](docs/SupportedConversionsFormats.md)
 - [SynonymizeTextRequest](docs/SynonymizeTextRequest.md)
 - [SynonymizeTextResponse](docs/SynonymizeTextResponse.md)
 - [Tokenizer](docs/Tokenizer.md)
 - [TrialSupportedFormats](docs/TrialSupportedFormats.md)


## GroupDocs.Rewriter Cloud SDKs in Popular Languages

| .NET | Python | Java
|---|---|---|
| [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-dotnet) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-dotnet) | [GitHub](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java)
| [NuGet](https://www.nuget.org/packages/GroupDocs.Rewriter-Cloud/) | [PyPi](https://pypi.org/project/groupdocs-rewriter-cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-rewriter-cloud)

---

[Product Page](https://products.groupdocs.cloud/rewriter/java/) | [Docs](https://docs.groupdocs.cloud/rewriter/) | [Demos](https://products.groupdocs.app/rewriter/family) | [Swagger UI](https://apireference.groupdocs.cloud/rewriter/) | [Examples](https://github.com/groupdocs-rewriter-cloud/groupdocs-rewriter-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/rewriter/) | [Search](https://search.groupdocs.cloud/) | [Free Support](https://forum.groupdocs.cloud/c/rewriter) | [Free Trial](https://purchase.groupdocs.cloud/trial)

