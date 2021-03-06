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
import io.swagger.client.model.GroupInfo;
import io.swagger.client.model.PDFFileInfoDTO;
import io.swagger.client.model.PDFProcessSignerInfoDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PDFSignatureProcessDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class PDFSignatureProcessDTO {
  @SerializedName("file")
  private PDFFileInfoDTO file = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("keep")
  private Boolean keep = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private GroupInfo owner = null;

  @SerializedName("signers")
  private List<PDFProcessSignerInfoDTO> signers = new ArrayList<PDFProcessSignerInfoDTO>();

  public PDFSignatureProcessDTO file(PDFFileInfoDTO file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(required = true, description = "")
  public PDFFileInfoDTO getFile() {
    return file;
  }

  public void setFile(PDFFileInfoDTO file) {
    this.file = file;
  }

  public PDFSignatureProcessDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 9223372036854775616
   * maximum: -9223372036854775616
   * @return id
  **/
  @Schema(required = true, description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PDFSignatureProcessDTO keep(Boolean keep) {
    this.keep = keep;
    return this;
  }

   /**
   * Get keep
   * @return keep
  **/
  @Schema(required = true, description = "")
  public Boolean isKeep() {
    return keep;
  }

  public void setKeep(Boolean keep) {
    this.keep = keep;
  }

  public PDFSignatureProcessDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PDFSignatureProcessDTO owner(GroupInfo owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(required = true, description = "")
  public GroupInfo getOwner() {
    return owner;
  }

  public void setOwner(GroupInfo owner) {
    this.owner = owner;
  }

  public PDFSignatureProcessDTO signers(List<PDFProcessSignerInfoDTO> signers) {
    this.signers = signers;
    return this;
  }

  public PDFSignatureProcessDTO addSignersItem(PDFProcessSignerInfoDTO signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Get signers
   * @return signers
  **/
  @Schema(required = true, description = "")
  public List<PDFProcessSignerInfoDTO> getSigners() {
    return signers;
  }

  public void setSigners(List<PDFProcessSignerInfoDTO> signers) {
    this.signers = signers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PDFSignatureProcessDTO pdFSignatureProcessDTO = (PDFSignatureProcessDTO) o;
    return Objects.equals(this.file, pdFSignatureProcessDTO.file) &&
        Objects.equals(this.id, pdFSignatureProcessDTO.id) &&
        Objects.equals(this.keep, pdFSignatureProcessDTO.keep) &&
        Objects.equals(this.name, pdFSignatureProcessDTO.name) &&
        Objects.equals(this.owner, pdFSignatureProcessDTO.owner) &&
        Objects.equals(this.signers, pdFSignatureProcessDTO.signers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, id, keep, name, owner, signers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PDFSignatureProcessDTO {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keep: ").append(toIndentedString(keep)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
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
