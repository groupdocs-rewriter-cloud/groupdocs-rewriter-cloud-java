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
 * SynonymizeTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-24T13:25:06.936741+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class SynonymizeTextResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SYNONYMIZER_RESULTS = "synonymizerResults";
  @SerializedName(SERIALIZED_NAME_SYNONYMIZER_RESULTS)
  private List<String> synonymizerResults;

  public SynonymizeTextResponse() {
  }

  public SynonymizeTextResponse status(HttpStatusCode status) {
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


  public SynonymizeTextResponse message(String message) {
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


  public SynonymizeTextResponse synonymizerResults(List<String> synonymizerResults) {
    this.synonymizerResults = synonymizerResults;
    return this;
  }

  public SynonymizeTextResponse addSynonymizerResultsItem(String synonymizerResultsItem) {
    if (this.synonymizerResults == null) {
      this.synonymizerResults = new ArrayList<>();
    }
    this.synonymizerResults.add(synonymizerResultsItem);
    return this;
  }

   /**
   * Get synonymizerResults
   * @return synonymizerResults
  **/
  @javax.annotation.Nullable
  public List<String> getSynonymizerResults() {
    return synonymizerResults;
  }

  public void setSynonymizerResults(List<String> synonymizerResults) {
    this.synonymizerResults = synonymizerResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynonymizeTextResponse synonymizeTextResponse = (SynonymizeTextResponse) o;
    return Objects.equals(this.status, synonymizeTextResponse.status) &&
        Objects.equals(this.message, synonymizeTextResponse.message) &&
        Objects.equals(this.synonymizerResults, synonymizeTextResponse.synonymizerResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, synonymizerResults);
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
    sb.append("class SynonymizeTextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    synonymizerResults: ").append(toIndentedString(synonymizerResults)).append("\n");
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
    openapiFields.add("synonymizerResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SynonymizeTextResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SynonymizeTextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SynonymizeTextResponse is not found in the empty JSON string", SynonymizeTextResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SynonymizeTextResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SynonymizeTextResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("synonymizerResults") != null && !jsonObj.get("synonymizerResults").isJsonNull() && !jsonObj.get("synonymizerResults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `synonymizerResults` to be an array in the JSON string but got `%s`", jsonObj.get("synonymizerResults").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SynonymizeTextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SynonymizeTextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SynonymizeTextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SynonymizeTextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SynonymizeTextResponse>() {
           @Override
           public void write(JsonWriter out, SynonymizeTextResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SynonymizeTextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SynonymizeTextResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SynonymizeTextResponse
  * @throws IOException if the JSON string is invalid with respect to SynonymizeTextResponse
  */
  public static SynonymizeTextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SynonymizeTextResponse.class);
  }

 /**
  * Convert an instance of SynonymizeTextResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
