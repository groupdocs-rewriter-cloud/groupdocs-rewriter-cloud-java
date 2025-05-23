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
 * Gets or Sets SupportedConversionsFormats
 */
@JsonAdapter(SupportedConversionsFormats.Adapter.class)
public enum SupportedConversionsFormats {
  
  DOCX("Docx"),
  
  RTF("Rtf"),
  
  HTML("Html"),
  
  ODT("Odt"),
  
  TXT("Txt"),
  
  MD("Md"),
  
  PDF("Pdf"),
  
  TIFF("Tiff"),
  
  SVG("Svg"),
  
  XPS("Xps"),
  
  PPTX("Pptx");

  private String value;

  SupportedConversionsFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupportedConversionsFormats fromValue(String value) {
    for (SupportedConversionsFormats b : SupportedConversionsFormats.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SupportedConversionsFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final SupportedConversionsFormats enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SupportedConversionsFormats read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SupportedConversionsFormats.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SupportedConversionsFormats.fromValue(value);
  }
}

