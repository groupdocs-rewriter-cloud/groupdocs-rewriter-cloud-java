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
 * Gets or Sets OcrInputFormat
 */
@JsonAdapter(OcrInputFormat.Adapter.class)
public enum OcrInputFormat {
  
  UNKNOWN("Unknown"),
  
  BMP("Bmp"),
  
  JPG("Jpg"),
  
  PNG("Png"),
  
  SVG("Svg"),
  
  GIF("Gif"),
  
  PDF("Pdf");

  private String value;

  OcrInputFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OcrInputFormat fromValue(String value) {
    for (OcrInputFormat b : OcrInputFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OcrInputFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final OcrInputFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OcrInputFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OcrInputFormat.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OcrInputFormat.fromValue(value);
  }
}

