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
import com.groupdocs.model.FileSavingMode;
import com.groupdocs.model.OcrInputFormat;
import com.groupdocs.model.OcrOutputFormat;
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
 * SynonymizeOcrRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T16:42:30.174218+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class SynonymizeOcrRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nonnull
  private String language;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  @javax.annotation.Nullable
  private String originalName;

  public static final String SERIALIZED_NAME_SAVING_MODE = "savingMode";
  @SerializedName(SERIALIZED_NAME_SAVING_MODE)
  @javax.annotation.Nullable
  private FileSavingMode savingMode;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "outputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nonnull
  private OcrOutputFormat outputFormat;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nonnull
  private OcrInputFormat format;

  public SynonymizeOcrRequest() {
  }

  public SynonymizeOcrRequest language(@javax.annotation.Nonnull String language) {
    this.language = language;
    return this;
  }

  /**
   * Set language of text
   * @return language
   */
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(@javax.annotation.Nonnull String language) {
    this.language = language;
  }


  public SynonymizeOcrRequest url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public SynonymizeOcrRequest origin(@javax.annotation.Nullable String origin) {
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


  public SynonymizeOcrRequest originalName(@javax.annotation.Nullable String originalName) {
    this.originalName = originalName;
    return this;
  }

  /**
   * Get originalName
   * @return originalName
   */
  @javax.annotation.Nullable
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(@javax.annotation.Nullable String originalName) {
    this.originalName = originalName;
  }


  public SynonymizeOcrRequest savingMode(@javax.annotation.Nullable FileSavingMode savingMode) {
    this.savingMode = savingMode;
    return this;
  }

  /**
   * Get savingMode
   * @return savingMode
   */
  @javax.annotation.Nullable
  public FileSavingMode getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(@javax.annotation.Nullable FileSavingMode savingMode) {
    this.savingMode = savingMode;
  }


  public SynonymizeOcrRequest outputFormat(@javax.annotation.Nonnull OcrOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat
   * @return outputFormat
   */
  @javax.annotation.Nonnull
  public OcrOutputFormat getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nonnull OcrOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }


  public SynonymizeOcrRequest format(@javax.annotation.Nonnull OcrInputFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @javax.annotation.Nonnull
  public OcrInputFormat getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nonnull OcrInputFormat format) {
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
    SynonymizeOcrRequest synonymizeOcrRequest = (SynonymizeOcrRequest) o;
    return Objects.equals(this.language, synonymizeOcrRequest.language) &&
        Objects.equals(this.url, synonymizeOcrRequest.url) &&
        Objects.equals(this.origin, synonymizeOcrRequest.origin) &&
        Objects.equals(this.originalName, synonymizeOcrRequest.originalName) &&
        Objects.equals(this.savingMode, synonymizeOcrRequest.savingMode) &&
        Objects.equals(this.outputFormat, synonymizeOcrRequest.outputFormat) &&
        Objects.equals(this.format, synonymizeOcrRequest.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, url, origin, originalName, savingMode, outputFormat, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynonymizeOcrRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
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
    openapiFields.add("outputFormat");
    openapiFields.add("format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("outputFormat");
    openapiRequiredFields.add("format");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SynonymizeOcrRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SynonymizeOcrRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SynonymizeOcrRequest is not found in the empty JSON string", SynonymizeOcrRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SynonymizeOcrRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SynonymizeOcrRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SynonymizeOcrRequest.openapiRequiredFields) {
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
      // validate the required field `outputFormat`
      OcrOutputFormat.validateJsonElement(jsonObj.get("outputFormat"));
      // validate the required field `format`
      OcrInputFormat.validateJsonElement(jsonObj.get("format"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SynonymizeOcrRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SynonymizeOcrRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SynonymizeOcrRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SynonymizeOcrRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SynonymizeOcrRequest>() {
           @Override
           public void write(JsonWriter out, SynonymizeOcrRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SynonymizeOcrRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SynonymizeOcrRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SynonymizeOcrRequest
   * @throws IOException if the JSON string is invalid with respect to SynonymizeOcrRequest
   */
  public static SynonymizeOcrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SynonymizeOcrRequest.class);
  }

  /**
   * Convert an instance of SynonymizeOcrRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

