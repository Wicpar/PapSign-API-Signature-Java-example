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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EncodedSignatureDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class EncodedSignatureDTO {
  @SerializedName("hex")
  private String hex = null;

  public EncodedSignatureDTO hex(String hex) {
    this.hex = hex;
    return this;
  }

   /**
   * Get hex
   * @return hex
  **/
  @Schema(required = true, description = "")
  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodedSignatureDTO encodedSignatureDTO = (EncodedSignatureDTO) o;
    return Objects.equals(this.hex, encodedSignatureDTO.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodedSignatureDTO {\n");
    
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
