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


package com.groupdocs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.model.HttpStatusCode;
import java.io.IOException;
import java.util.Arrays;

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
 * CompareTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T16:42:30.174218+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class CompareTextResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  @javax.annotation.Nullable
  private Float probability;

  public static final String SERIALIZED_NAME_IS_PARAPHRASED_OR_TRANSLATED = "isParaphrasedOrTranslated";
  @SerializedName(SERIALIZED_NAME_IS_PARAPHRASED_OR_TRANSLATED)
  @javax.annotation.Nullable
  private Boolean isParaphrasedOrTranslated;

  public CompareTextResponse() {
  }

  public CompareTextResponse status(@javax.annotation.Nullable HttpStatusCode status) {
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


  public CompareTextResponse message(@javax.annotation.Nullable String message) {
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


  public CompareTextResponse probability(@javax.annotation.Nullable Float probability) {
    this.probability = probability;
    return this;
  }

  /**
   * The probability that the text turned out to be paraphrased
   * @return probability
   */
  @javax.annotation.Nullable
  public Float getProbability() {
    return probability;
  }

  public void setProbability(@javax.annotation.Nullable Float probability) {
    this.probability = probability;
  }


  public CompareTextResponse isParaphrasedOrTranslated(@javax.annotation.Nullable Boolean isParaphrasedOrTranslated) {
    this.isParaphrasedOrTranslated = isParaphrasedOrTranslated;
    return this;
  }

  /**
   * Get isParaphrasedOrTranslated
   * @return isParaphrasedOrTranslated
   */
  @javax.annotation.Nullable
  public Boolean getIsParaphrasedOrTranslated() {
    return isParaphrasedOrTranslated;
  }

  public void setIsParaphrasedOrTranslated(@javax.annotation.Nullable Boolean isParaphrasedOrTranslated) {
    this.isParaphrasedOrTranslated = isParaphrasedOrTranslated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareTextResponse compareTextResponse = (CompareTextResponse) o;
    return Objects.equals(this.status, compareTextResponse.status) &&
        Objects.equals(this.message, compareTextResponse.message) &&
        Objects.equals(this.probability, compareTextResponse.probability) &&
        Objects.equals(this.isParaphrasedOrTranslated, compareTextResponse.isParaphrasedOrTranslated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, probability, isParaphrasedOrTranslated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareTextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    isParaphrasedOrTranslated: ").append(toIndentedString(isParaphrasedOrTranslated)).append("\n");
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
    openapiFields.add("probability");
    openapiFields.add("isParaphrasedOrTranslated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompareTextResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompareTextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompareTextResponse is not found in the empty JSON string", CompareTextResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompareTextResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompareTextResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompareTextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompareTextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompareTextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompareTextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CompareTextResponse>() {
           @Override
           public void write(JsonWriter out, CompareTextResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompareTextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompareTextResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompareTextResponse
   * @throws IOException if the JSON string is invalid with respect to CompareTextResponse
   */
  public static CompareTextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompareTextResponse.class);
  }

  /**
   * Convert an instance of CompareTextResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

