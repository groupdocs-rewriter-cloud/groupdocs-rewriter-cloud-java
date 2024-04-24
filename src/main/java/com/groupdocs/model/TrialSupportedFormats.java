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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TrialSupportedFormats
 */
@JsonAdapter(TrialSupportedFormats.Adapter.class)
public enum TrialSupportedFormats {
  
  DOCX("Docx"),
  
  PDF("Pdf");

  private String value;

  TrialSupportedFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrialSupportedFormats fromValue(String value) {
    for (TrialSupportedFormats b : TrialSupportedFormats.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TrialSupportedFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final TrialSupportedFormats enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TrialSupportedFormats read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TrialSupportedFormats.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TrialSupportedFormats.fromValue(value);
  }
}
