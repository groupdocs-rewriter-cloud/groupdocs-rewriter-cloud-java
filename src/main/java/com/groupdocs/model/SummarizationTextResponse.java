/*
 * GroupDocs.Rewriter API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.4.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupdocs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.model.HttpStatusCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * SummarizationTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-24T13:25:06.936741+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class SummarizationTextResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SUMMARIZATION_RESULT = "summarizationResult";
  @SerializedName(SERIALIZED_NAME_SUMMARIZATION_RESULT)
  private String summarizationResult;

  public static final String SERIALIZED_NAME_SUMMARIZATION_RESULTS = "summarizationResults";
  @SerializedName(SERIALIZED_NAME_SUMMARIZATION_RESULTS)
  private List<String> summarizationResults;

  public SummarizationTextResponse() {
  }

  public SummarizationTextResponse status(HttpStatusCode status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public HttpStatusCode getStatus() {
    return status;
  }

  public void setStatus(HttpStatusCode status) {
    this.status = status;
  }


  public SummarizationTextResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Information about process
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public SummarizationTextResponse summarizationResult(String summarizationResult) {
    this.summarizationResult = summarizationResult;
    return this;
  }

   /**
   * Get summarizationResult
   * @return summarizationResult
  **/
  @javax.annotation.Nullable
  public String getSummarizationResult() {
    return summarizationResult;
  }

  public void setSummarizationResult(String summarizationResult) {
    this.summarizationResult = summarizationResult;
  }


  public SummarizationTextResponse summarizationResults(List<String> summarizationResults) {
    this.summarizationResults = summarizationResults;
    return this;
  }

  public SummarizationTextResponse addSummarizationResultsItem(String summarizationResultsItem) {
    if (this.summarizationResults == null) {
      this.summarizationResults = new ArrayList<>();
    }
    this.summarizationResults.add(summarizationResultsItem);
    return this;
  }

   /**
   * Get summarizationResults
   * @return summarizationResults
  **/
  @javax.annotation.Nullable
  public List<String> getSummarizationResults() {
    return summarizationResults;
  }

  public void setSummarizationResults(List<String> summarizationResults) {
    this.summarizationResults = summarizationResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarizationTextResponse summarizationTextResponse = (SummarizationTextResponse) o;
    return Objects.equals(this.status, summarizationTextResponse.status) &&
        Objects.equals(this.message, summarizationTextResponse.message) &&
        Objects.equals(this.summarizationResult, summarizationTextResponse.summarizationResult) &&
        Objects.equals(this.summarizationResults, summarizationTextResponse.summarizationResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, summarizationResult, summarizationResults);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarizationTextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    summarizationResult: ").append(toIndentedString(summarizationResult)).append("\n");
    sb.append("    summarizationResults: ").append(toIndentedString(summarizationResults)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("summarizationResult");
    openapiFields.add("summarizationResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SummarizationTextResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SummarizationTextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SummarizationTextResponse is not found in the empty JSON string", SummarizationTextResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SummarizationTextResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SummarizationTextResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        HttpStatusCode.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("summarizationResult") != null && !jsonObj.get("summarizationResult").isJsonNull()) && !jsonObj.get("summarizationResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summarizationResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summarizationResult").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("summarizationResults") != null && !jsonObj.get("summarizationResults").isJsonNull() && !jsonObj.get("summarizationResults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `summarizationResults` to be an array in the JSON string but got `%s`", jsonObj.get("summarizationResults").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SummarizationTextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SummarizationTextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SummarizationTextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SummarizationTextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SummarizationTextResponse>() {
           @Override
           public void write(JsonWriter out, SummarizationTextResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SummarizationTextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SummarizationTextResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SummarizationTextResponse
  * @throws IOException if the JSON string is invalid with respect to SummarizationTextResponse
  */
  public static SummarizationTextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SummarizationTextResponse.class);
  }

 /**
  * Convert an instance of SummarizationTextResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
