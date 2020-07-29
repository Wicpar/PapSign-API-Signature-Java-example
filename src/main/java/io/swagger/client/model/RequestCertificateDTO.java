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
import io.swagger.client.model.PublicKeyDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RequestCertificateDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class RequestCertificateDTO {
  @SerializedName("identity")
  private Long identity = null;

  @SerializedName("key")
  private PublicKeyDTO key = null;

  @SerializedName("validity")
  private Integer validity = null;

  public RequestCertificateDTO identity(Long identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * minimum: 9223372036854775616
   * maximum: -9223372036854775616
   * @return identity
  **/
  @Schema(required = true, description = "")
  public Long getIdentity() {
    return identity;
  }

  public void setIdentity(Long identity) {
    this.identity = identity;
  }

  public RequestCertificateDTO key(PublicKeyDTO key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(required = true, description = "")
  public PublicKeyDTO getKey() {
    return key;
  }

  public void setKey(PublicKeyDTO key) {
    this.key = key;
  }

  public RequestCertificateDTO validity(Integer validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * minimum: -2147483648
   * maximum: 2147483647
   * @return validity
  **/
  @Schema(required = true, description = "")
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(Integer validity) {
    this.validity = validity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCertificateDTO requestCertificateDTO = (RequestCertificateDTO) o;
    return Objects.equals(this.identity, requestCertificateDTO.identity) &&
        Objects.equals(this.key, requestCertificateDTO.key) &&
        Objects.equals(this.validity, requestCertificateDTO.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, key, validity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCertificateDTO {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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
