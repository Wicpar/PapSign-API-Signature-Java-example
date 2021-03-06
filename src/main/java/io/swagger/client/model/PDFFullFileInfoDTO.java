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
import io.swagger.client.model.PDFFileEventDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PDFFullFileInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class PDFFullFileInfoDTO {
  @SerializedName("bestPermission")
  private GroupPermission bestPermission = null;

  @SerializedName("events")
  private List<PDFFileEventDTO> events = new ArrayList<PDFFileEventDTO>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("processID")
  private Long processID = null;

  @SerializedName("versions")
  private Integer versions = null;

  public PDFFullFileInfoDTO bestPermission(GroupPermission bestPermission) {
    this.bestPermission = bestPermission;
    return this;
  }

   /**
   * Get bestPermission
   * @return bestPermission
  **/
  @Schema(description = "")
  public GroupPermission getBestPermission() {
    return bestPermission;
  }

  public void setBestPermission(GroupPermission bestPermission) {
    this.bestPermission = bestPermission;
  }

  public PDFFullFileInfoDTO events(List<PDFFileEventDTO> events) {
    this.events = events;
    return this;
  }

  public PDFFullFileInfoDTO addEventsItem(PDFFileEventDTO eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(required = true, description = "")
  public List<PDFFileEventDTO> getEvents() {
    return events;
  }

  public void setEvents(List<PDFFileEventDTO> events) {
    this.events = events;
  }

  public PDFFullFileInfoDTO id(Long id) {
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

  public PDFFullFileInfoDTO name(String name) {
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

  public PDFFullFileInfoDTO processID(Long processID) {
    this.processID = processID;
    return this;
  }

   /**
   * Get processID
   * minimum: 9223372036854775616
   * maximum: -9223372036854775616
   * @return processID
  **/
  @Schema(description = "")
  public Long getProcessID() {
    return processID;
  }

  public void setProcessID(Long processID) {
    this.processID = processID;
  }

  public PDFFullFileInfoDTO versions(Integer versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Get versions
   * minimum: -2147483648
   * maximum: 2147483647
   * @return versions
  **/
  @Schema(required = true, description = "")
  public Integer getVersions() {
    return versions;
  }

  public void setVersions(Integer versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PDFFullFileInfoDTO pdFFullFileInfoDTO = (PDFFullFileInfoDTO) o;
    return Objects.equals(this.bestPermission, pdFFullFileInfoDTO.bestPermission) &&
        Objects.equals(this.events, pdFFullFileInfoDTO.events) &&
        Objects.equals(this.id, pdFFullFileInfoDTO.id) &&
        Objects.equals(this.name, pdFFullFileInfoDTO.name) &&
        Objects.equals(this.processID, pdFFullFileInfoDTO.processID) &&
        Objects.equals(this.versions, pdFFullFileInfoDTO.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestPermission, events, id, name, processID, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PDFFullFileInfoDTO {\n");
    
    sb.append("    bestPermission: ").append(toIndentedString(bestPermission)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processID: ").append(toIndentedString(processID)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
