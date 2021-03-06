/*
 * PapSign API
 * The PapSign API
 *
 * OpenAPI spec version: 0.1
 * Contact: support@papsign.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OAuthScope
 */
@JsonAdapter(OAuthScope.Adapter.class)
public enum OAuthScope {
  USER("USER"),
  SIGN("SIGN"),
  FILE("FILE"),
  ADMIN("ADMIN"),
  OAUTH("OAUTH");

  private String value;

  OAuthScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuthScope fromValue(String text) {
    for (OAuthScope b : OAuthScope.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OAuthScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final OAuthScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OAuthScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OAuthScope.fromValue(String.valueOf(value));
    }
  }
}
