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
 * Gets or Sets DetectionSupportedFormats
 */
@JsonAdapter(DetectionSupportedFormats.Adapter.class)
public enum DetectionSupportedFormats {
  
  UNKNOWN("Unknown"),
  
  DOC("Doc"),
  
  DOCX("Docx"),
  
  DOCM("Docm"),
  
  RTF("Rtf"),
  
  ODT("Odt"),
  
  TXT("Txt"),
  
  PDF("Pdf");

  private String value;

  DetectionSupportedFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DetectionSupportedFormats fromValue(String value) {
    for (DetectionSupportedFormats b : DetectionSupportedFormats.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DetectionSupportedFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final DetectionSupportedFormats enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DetectionSupportedFormats read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DetectionSupportedFormats.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    DetectionSupportedFormats.fromValue(value);
  }
}

