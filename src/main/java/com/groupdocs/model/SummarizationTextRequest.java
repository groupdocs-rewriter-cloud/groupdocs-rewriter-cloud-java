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
import com.groupdocs.model.DegreeEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * SummarizationTextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-24T13:25:06.936741+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class SummarizationTextRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TEXTS = "texts";
  @SerializedName(SERIALIZED_NAME_TEXTS)
  private List<String> texts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_SUMMARIZATION_DEGREE = "summarizationDegree";
  @SerializedName(SERIALIZED_NAME_SUMMARIZATION_DEGREE)
  private DegreeEnum summarizationDegree;

  public SummarizationTextRequest() {
  }

  public SummarizationTextRequest language(String language) {
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


  public SummarizationTextRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Single text paragraph
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public SummarizationTextRequest texts(List<String> texts) {
    this.texts = texts;
    return this;
  }

  public SummarizationTextRequest addTextsItem(String textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<>();
    }
    this.texts.add(textsItem);
    return this;
  }

   /**
   * Text paragraphs
   * @return texts
  **/
  @javax.annotation.Nullable
  public List<String> getTexts() {
    return texts;
  }

  public void setTexts(List<String> texts) {
    this.texts = texts;
  }


  public SummarizationTextRequest origin(String origin) {
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


  public SummarizationTextRequest summarizationDegree(DegreeEnum summarizationDegree) {
    this.summarizationDegree = summarizationDegree;
    return this;
  }

   /**
   * Get summarizationDegree
   * @return summarizationDegree
  **/
  @javax.annotation.Nullable
  public DegreeEnum getSummarizationDegree() {
    return summarizationDegree;
  }

  public void setSummarizationDegree(DegreeEnum summarizationDegree) {
    this.summarizationDegree = summarizationDegree;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarizationTextRequest summarizationTextRequest = (SummarizationTextRequest) o;
    return Objects.equals(this.language, summarizationTextRequest.language) &&
        Objects.equals(this.text, summarizationTextRequest.text) &&
        Objects.equals(this.texts, summarizationTextRequest.texts) &&
        Objects.equals(this.origin, summarizationTextRequest.origin) &&
        Objects.equals(this.summarizationDegree, summarizationTextRequest.summarizationDegree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, text, texts, origin, summarizationDegree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarizationTextRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    summarizationDegree: ").append(toIndentedString(summarizationDegree)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("texts");
    openapiFields.add("origin");
    openapiFields.add("summarizationDegree");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SummarizationTextRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SummarizationTextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SummarizationTextRequest is not found in the empty JSON string", SummarizationTextRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SummarizationTextRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SummarizationTextRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SummarizationTextRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("texts") != null && !jsonObj.get("texts").isJsonNull() && !jsonObj.get("texts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `texts` to be an array in the JSON string but got `%s`", jsonObj.get("texts").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      // validate the optional field `summarizationDegree`
      if (jsonObj.get("summarizationDegree") != null && !jsonObj.get("summarizationDegree").isJsonNull()) {
        DegreeEnum.validateJsonElement(jsonObj.get("summarizationDegree"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SummarizationTextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SummarizationTextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SummarizationTextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SummarizationTextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SummarizationTextRequest>() {
           @Override
           public void write(JsonWriter out, SummarizationTextRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SummarizationTextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SummarizationTextRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SummarizationTextRequest
  * @throws IOException if the JSON string is invalid with respect to SummarizationTextRequest
  */
  public static SummarizationTextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SummarizationTextRequest.class);
  }

 /**
  * Convert an instance of SummarizationTextRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

