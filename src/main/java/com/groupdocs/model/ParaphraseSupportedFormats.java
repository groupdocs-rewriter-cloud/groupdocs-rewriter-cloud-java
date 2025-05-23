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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ParaphraseSupportedFormats
 */
@JsonAdapter(ParaphraseSupportedFormats.Adapter.class)
public enum ParaphraseSupportedFormats {
  
  UNKNOWN("Unknown"),
  
  DOC("Doc"),
  
  DOCX("Docx"),
  
  DOCM("Docm"),
  
  RTF("Rtf"),
  
  ODT("Odt"),
  
  TXT("Txt"),
  
  PDF("Pdf"),
  
  MD("Md"),
  
  HTML("Html");

  private String value;

  ParaphraseSupportedFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParaphraseSupportedFormats fromValue(String value) {
    for (ParaphraseSupportedFormats b : ParaphraseSupportedFormats.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ParaphraseSupportedFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final ParaphraseSupportedFormats enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ParaphraseSupportedFormats read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ParaphraseSupportedFormats.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ParaphraseSupportedFormats.fromValue(value);
  }
}

