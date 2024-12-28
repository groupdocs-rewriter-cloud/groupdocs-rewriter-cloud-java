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
 * CompareTextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:33:55.576459+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class CompareTextRequest {
  public static final String SERIALIZED_NAME_ORIGINAL_TEXT = "originalText";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TEXT)
  @javax.annotation.Nullable
  private String originalText;

  public static final String SERIALIZED_NAME_ALTERNATIVE_TEXT = "alternativeText";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVE_TEXT)
  @javax.annotation.Nullable
  private String alternativeText;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  public CompareTextRequest() {
  }

  public CompareTextRequest originalText(@javax.annotation.Nullable String originalText) {
    this.originalText = originalText;
    return this;
  }

  /**
   * Original text
   * @return originalText
   */
  @javax.annotation.Nullable
  public String getOriginalText() {
    return originalText;
  }

  public void setOriginalText(@javax.annotation.Nullable String originalText) {
    this.originalText = originalText;
  }


  public CompareTextRequest alternativeText(@javax.annotation.Nullable String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

  /**
   * Modified text
   * @return alternativeText
   */
  @javax.annotation.Nullable
  public String getAlternativeText() {
    return alternativeText;
  }

  public void setAlternativeText(@javax.annotation.Nullable String alternativeText) {
    this.alternativeText = alternativeText;
  }


  public CompareTextRequest origin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Information about SDK user, like a User-Agent
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareTextRequest compareTextRequest = (CompareTextRequest) o;
    return Objects.equals(this.originalText, compareTextRequest.originalText) &&
        Objects.equals(this.alternativeText, compareTextRequest.alternativeText) &&
        Objects.equals(this.origin, compareTextRequest.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalText, alternativeText, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareTextRequest {\n");
    sb.append("    originalText: ").append(toIndentedString(originalText)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
    openapiFields.add("originalText");
    openapiFields.add("alternativeText");
    openapiFields.add("origin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompareTextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompareTextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompareTextRequest is not found in the empty JSON string", CompareTextRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompareTextRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompareTextRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("originalText") != null && !jsonObj.get("originalText").isJsonNull()) && !jsonObj.get("originalText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalText").toString()));
      }
      if ((jsonObj.get("alternativeText") != null && !jsonObj.get("alternativeText").isJsonNull()) && !jsonObj.get("alternativeText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternativeText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alternativeText").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompareTextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompareTextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompareTextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompareTextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CompareTextRequest>() {
           @Override
           public void write(JsonWriter out, CompareTextRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompareTextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompareTextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompareTextRequest
   * @throws IOException if the JSON string is invalid with respect to CompareTextRequest
   */
  public static CompareTextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompareTextRequest.class);
  }

  /**
   * Convert an instance of CompareTextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

