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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * FormalizeTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T22:39:40.868498+03:00[Europe/Moscow]", comments = "Generator version: 7.12.0")
public class FormalizeTextResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_FORMALIZE_RESULT = "formalizeResult";
  @SerializedName(SERIALIZED_NAME_FORMALIZE_RESULT)
  @javax.annotation.Nullable
  private String formalizeResult;

  public static final String SERIALIZED_NAME_FORMALIZE_RESULTS = "formalizeResults";
  @SerializedName(SERIALIZED_NAME_FORMALIZE_RESULTS)
  @javax.annotation.Nullable
  private List<String> formalizeResults;

  public FormalizeTextResponse() {
  }

  public FormalizeTextResponse status(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public HttpStatusCode getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
  }


  public FormalizeTextResponse message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Information about process
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public FormalizeTextResponse formalizeResult(@javax.annotation.Nullable String formalizeResult) {
    this.formalizeResult = formalizeResult;
    return this;
  }

  /**
   * Get formalizeResult
   * @return formalizeResult
   */
  @javax.annotation.Nullable
  public String getFormalizeResult() {
    return formalizeResult;
  }

  public void setFormalizeResult(@javax.annotation.Nullable String formalizeResult) {
    this.formalizeResult = formalizeResult;
  }


  public FormalizeTextResponse formalizeResults(@javax.annotation.Nullable List<String> formalizeResults) {
    this.formalizeResults = formalizeResults;
    return this;
  }

  public FormalizeTextResponse addFormalizeResultsItem(String formalizeResultsItem) {
    if (this.formalizeResults == null) {
      this.formalizeResults = new ArrayList<>();
    }
    this.formalizeResults.add(formalizeResultsItem);
    return this;
  }

  /**
   * Get formalizeResults
   * @return formalizeResults
   */
  @javax.annotation.Nullable
  public List<String> getFormalizeResults() {
    return formalizeResults;
  }

  public void setFormalizeResults(@javax.annotation.Nullable List<String> formalizeResults) {
    this.formalizeResults = formalizeResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormalizeTextResponse formalizeTextResponse = (FormalizeTextResponse) o;
    return Objects.equals(this.status, formalizeTextResponse.status) &&
        Objects.equals(this.message, formalizeTextResponse.message) &&
        Objects.equals(this.formalizeResult, formalizeTextResponse.formalizeResult) &&
        Objects.equals(this.formalizeResults, formalizeTextResponse.formalizeResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, formalizeResult, formalizeResults);
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
    sb.append("class FormalizeTextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    formalizeResult: ").append(toIndentedString(formalizeResult)).append("\n");
    sb.append("    formalizeResults: ").append(toIndentedString(formalizeResults)).append("\n");
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
    openapiFields.add("formalizeResult");
    openapiFields.add("formalizeResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FormalizeTextResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FormalizeTextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormalizeTextResponse is not found in the empty JSON string", FormalizeTextResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FormalizeTextResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FormalizeTextResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("formalizeResult") != null && !jsonObj.get("formalizeResult").isJsonNull()) && !jsonObj.get("formalizeResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formalizeResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formalizeResult").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("formalizeResults") != null && !jsonObj.get("formalizeResults").isJsonNull() && !jsonObj.get("formalizeResults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formalizeResults` to be an array in the JSON string but got `%s`", jsonObj.get("formalizeResults").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormalizeTextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormalizeTextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormalizeTextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormalizeTextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FormalizeTextResponse>() {
           @Override
           public void write(JsonWriter out, FormalizeTextResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FormalizeTextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FormalizeTextResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FormalizeTextResponse
   * @throws IOException if the JSON string is invalid with respect to FormalizeTextResponse
   */
  public static FormalizeTextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormalizeTextResponse.class);
  }

  /**
   * Convert an instance of FormalizeTextResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

