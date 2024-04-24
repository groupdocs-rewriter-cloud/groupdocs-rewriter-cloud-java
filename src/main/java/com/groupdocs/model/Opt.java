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
 * Opt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-24T13:25:06.936741+03:00[Europe/Moscow]", comments = "Generator version: 7.5.0")
public class Opt {
  public static final String SERIALIZED_NAME_BEAM_SIZE = "beam_size";
  @SerializedName(SERIALIZED_NAME_BEAM_SIZE)
  private Integer beamSize;

  public static final String SERIALIZED_NAME_GPU = "gpu";
  @SerializedName(SERIALIZED_NAME_GPU)
  private Integer gpu;

  public static final String SERIALIZED_NAME_REPLACE_UNK = "replace_unk";
  @SerializedName(SERIALIZED_NAME_REPLACE_UNK)
  private Boolean replaceUnk;

  public Opt() {
  }

  public Opt beamSize(Integer beamSize) {
    this.beamSize = beamSize;
    return this;
  }

   /**
   * Get beamSize
   * @return beamSize
  **/
  @javax.annotation.Nullable
  public Integer getBeamSize() {
    return beamSize;
  }

  public void setBeamSize(Integer beamSize) {
    this.beamSize = beamSize;
  }


  public Opt gpu(Integer gpu) {
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @javax.annotation.Nullable
  public Integer getGpu() {
    return gpu;
  }

  public void setGpu(Integer gpu) {
    this.gpu = gpu;
  }


  public Opt replaceUnk(Boolean replaceUnk) {
    this.replaceUnk = replaceUnk;
    return this;
  }

   /**
   * Get replaceUnk
   * @return replaceUnk
  **/
  @javax.annotation.Nullable
  public Boolean getReplaceUnk() {
    return replaceUnk;
  }

  public void setReplaceUnk(Boolean replaceUnk) {
    this.replaceUnk = replaceUnk;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opt opt = (Opt) o;
    return Objects.equals(this.beamSize, opt.beamSize) &&
        Objects.equals(this.gpu, opt.gpu) &&
        Objects.equals(this.replaceUnk, opt.replaceUnk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beamSize, gpu, replaceUnk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opt {\n");
    sb.append("    beamSize: ").append(toIndentedString(beamSize)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    replaceUnk: ").append(toIndentedString(replaceUnk)).append("\n");
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
    openapiFields.add("beam_size");
    openapiFields.add("gpu");
    openapiFields.add("replace_unk");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Opt
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Opt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Opt is not found in the empty JSON string", Opt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Opt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Opt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Opt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Opt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Opt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Opt.class));

       return (TypeAdapter<T>) new TypeAdapter<Opt>() {
           @Override
           public void write(JsonWriter out, Opt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Opt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Opt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Opt
  * @throws IOException if the JSON string is invalid with respect to Opt
  */
  public static Opt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Opt.class);
  }

 /**
  * Convert an instance of Opt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

