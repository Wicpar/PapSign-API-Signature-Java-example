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
import io.swagger.client.model.SignatureSlotData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SignatureSlot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class SignatureSlot {
  @SerializedName("oneOf")
  private List<SignatureSlotData> oneOf = null;

  public SignatureSlot oneOf(List<SignatureSlotData> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  public SignatureSlot addOneOfItem(SignatureSlotData oneOfItem) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList<SignatureSlotData>();
    }
    this.oneOf.add(oneOfItem);
    return this;
  }

   /**
   * Get oneOf
   * @return oneOf
  **/
  @Schema(description = "")
  public List<SignatureSlotData> getOneOf() {
    return oneOf;
  }

  public void setOneOf(List<SignatureSlotData> oneOf) {
    this.oneOf = oneOf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureSlot signatureSlot = (SignatureSlot) o;
    return Objects.equals(this.oneOf, signatureSlot.oneOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneOf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureSlot {\n");
    
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
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
