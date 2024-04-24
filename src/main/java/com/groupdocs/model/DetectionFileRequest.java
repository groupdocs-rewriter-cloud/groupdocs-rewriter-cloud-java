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
import com.groupdocs.model.DetectionSupportedFormats;
import com.groupdocs.model.FileSavingMode;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * DetectionFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-24T13:25:06.936741+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class DetectionFileRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_SAVING_MODE = "savingMode";
  @SerializedName(SERIALIZED_NAME_SAVING_MODE)
  private FileSavingMode savingMode;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private DetectionSupportedFormats format;

  public DetectionFileRequest() {
  }

  public DetectionFileRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Set language of text
   * @return language
  **/
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public DetectionFileRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public DetectionFileRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Information about SDK user, like a User-Agent
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public DetectionFileRequest originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public DetectionFileRequest savingMode(FileSavingMode savingMode) {
    this.savingMode = savingMode;
    return this;
  }

   /**
   * Get savingMode
   * @return savingMode
  **/
  @javax.annotation.Nullable
  public FileSavingMode getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(FileSavingMode savingMode) {
    this.savingMode = savingMode;
  }


  public DetectionFileRequest minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @javax.annotation.Nullable
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public DetectionFileRequest format(DetectionSupportedFormats format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  public DetectionSupportedFormats getFormat() {
    return format;
  }

  public void setFormat(DetectionSupportedFormats format) {
    this.format = format;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionFileRequest detectionFileRequest = (DetectionFileRequest) o;
    return Objects.equals(this.language, detectionFileRequest.language) &&
        Objects.equals(this.url, detectionFileRequest.url) &&
        Objects.equals(this.origin, detectionFileRequest.origin) &&
        Objects.equals(this.originalName, detectionFileRequest.originalName) &&
        Objects.equals(this.savingMode, detectionFileRequest.savingMode) &&
        Objects.equals(this.minLength, detectionFileRequest.minLength) &&
        Objects.equals(this.format, detectionFileRequest.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, url, origin, originalName, savingMode, minLength, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionFileRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("url");
    openapiFields.add("origin");
    openapiFields.add("originalName");
    openapiFields.add("savingMode");
    openapiFields.add("minLength");
    openapiFields.add("format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DetectionFileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DetectionFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetectionFileRequest is not found in the empty JSON string", DetectionFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DetectionFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetectionFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DetectionFileRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("originalName") != null && !jsonObj.get("originalName").isJsonNull()) && !jsonObj.get("originalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalName").toString()));
      }
      // validate the optional field `savingMode`
      if (jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) {
        FileSavingMode.validateJsonElement(jsonObj.get("savingMode"));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        DetectionSupportedFormats.validateJsonElement(jsonObj.get("format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetectionFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetectionFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetectionFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetectionFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DetectionFileRequest>() {
           @Override
           public void write(JsonWriter out, DetectionFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetectionFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DetectionFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DetectionFileRequest
  * @throws IOException if the JSON string is invalid with respect to DetectionFileRequest
  */
  public static DetectionFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetectionFileRequest.class);
  }

 /**
  * Convert an instance of DetectionFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

