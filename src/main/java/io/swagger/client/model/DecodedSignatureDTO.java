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
import io.swagger.client.model.DecodedCertificateDTO;
import io.swagger.client.model.MapStringString;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DecodedSignatureDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class DecodedSignatureDTO {
  @SerializedName("certificate")
  private DecodedCertificateDTO certificate = null;

  @SerializedName("data")
  private MapStringString data = null;

  @SerializedName("signatureDate")
  private OffsetDateTime signatureDate = null;

  @SerializedName("testValid")
  private Boolean testValid = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public DecodedSignatureDTO certificate(DecodedCertificateDTO certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(required = true, description = "")
  public DecodedCertificateDTO getCertificate() {
    return certificate;
  }

  public void setCertificate(DecodedCertificateDTO certificate) {
    this.certificate = certificate;
  }

  public DecodedSignatureDTO data(MapStringString data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public MapStringString getData() {
    return data;
  }

  public void setData(MapStringString data) {
    this.data = data;
  }

  public DecodedSignatureDTO signatureDate(OffsetDateTime signatureDate) {
    this.signatureDate = signatureDate;
    return this;
  }

   /**
   * Get signatureDate
   * @return signatureDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getSignatureDate() {
    return signatureDate;
  }

  public void setSignatureDate(OffsetDateTime signatureDate) {
    this.signatureDate = signatureDate;
  }

  public DecodedSignatureDTO testValid(Boolean testValid) {
    this.testValid = testValid;
    return this;
  }

   /**
   * Get testValid
   * @return testValid
  **/
  @Schema(required = true, description = "")
  public Boolean isTestValid() {
    return testValid;
  }

  public void setTestValid(Boolean testValid) {
    this.testValid = testValid;
  }

  public DecodedSignatureDTO text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public DecodedSignatureDTO valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @Schema(required = true, description = "")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodedSignatureDTO decodedSignatureDTO = (DecodedSignatureDTO) o;
    return Objects.equals(this.certificate, decodedSignatureDTO.certificate) &&
        Objects.equals(this.data, decodedSignatureDTO.data) &&
        Objects.equals(this.signatureDate, decodedSignatureDTO.signatureDate) &&
        Objects.equals(this.testValid, decodedSignatureDTO.testValid) &&
        Objects.equals(this.text, decodedSignatureDTO.text) &&
        Objects.equals(this.valid, decodedSignatureDTO.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, data, signatureDate, testValid, text, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodedSignatureDTO {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
    sb.append("    testValid: ").append(toIndentedString(testValid)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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