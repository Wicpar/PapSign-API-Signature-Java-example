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
import io.swagger.client.model.GroupPermission;
import io.swagger.client.model.PDFSignatureProcessDTO;
import io.swagger.client.model.PDFSignatureStatusDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PDFSignatureProcessInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class PDFSignatureProcessInfoDTO {
  @SerializedName("permission")
  private GroupPermission permission = null;

  @SerializedName("process")
  private PDFSignatureProcessDTO process = null;

  @SerializedName("signatureStatus")
  private PDFSignatureStatusDTO signatureStatus = null;

  public PDFSignatureProcessInfoDTO permission(GroupPermission permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(required = true, description = "")
  public GroupPermission getPermission() {
    return permission;
  }

  public void setPermission(GroupPermission permission) {
    this.permission = permission;
  }

  public PDFSignatureProcessInfoDTO process(PDFSignatureProcessDTO process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @Schema(required = true, description = "")
  public PDFSignatureProcessDTO getProcess() {
    return process;
  }

  public void setProcess(PDFSignatureProcessDTO process) {
    this.process = process;
  }

  public PDFSignatureProcessInfoDTO signatureStatus(PDFSignatureStatusDTO signatureStatus) {
    this.signatureStatus = signatureStatus;
    return this;
  }

   /**
   * Get signatureStatus
   * @return signatureStatus
  **/
  @Schema(description = "")
  public PDFSignatureStatusDTO getSignatureStatus() {
    return signatureStatus;
  }

  public void setSignatureStatus(PDFSignatureStatusDTO signatureStatus) {
    this.signatureStatus = signatureStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PDFSignatureProcessInfoDTO pdFSignatureProcessInfoDTO = (PDFSignatureProcessInfoDTO) o;
    return Objects.equals(this.permission, pdFSignatureProcessInfoDTO.permission) &&
        Objects.equals(this.process, pdFSignatureProcessInfoDTO.process) &&
        Objects.equals(this.signatureStatus, pdFSignatureProcessInfoDTO.signatureStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, process, signatureStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PDFSignatureProcessInfoDTO {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    signatureStatus: ").append(toIndentedString(signatureStatus)).append("\n");
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
