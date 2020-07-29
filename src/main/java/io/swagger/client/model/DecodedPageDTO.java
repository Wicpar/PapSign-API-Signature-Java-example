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
import io.swagger.client.model.DecodedSignatureDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DecodedPageDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class DecodedPageDTO {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("signatures")
  private List<DecodedSignatureDTO> signatures = new ArrayList<DecodedSignatureDTO>();

  public DecodedPageDTO page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * minimum: -2147483648
   * maximum: 2147483647
   * @return page
  **/
  @Schema(required = true, description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public DecodedPageDTO signatures(List<DecodedSignatureDTO> signatures) {
    this.signatures = signatures;
    return this;
  }

  public DecodedPageDTO addSignaturesItem(DecodedSignatureDTO signaturesItem) {
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/
  @Schema(required = true, description = "")
  public List<DecodedSignatureDTO> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<DecodedSignatureDTO> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodedPageDTO decodedPageDTO = (DecodedPageDTO) o;
    return Objects.equals(this.page, decodedPageDTO.page) &&
        Objects.equals(this.signatures, decodedPageDTO.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, signatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodedPageDTO {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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
