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
import io.swagger.client.model.AccountInfo;
import io.swagger.client.model.PDFFileEvents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * PDFFileEventDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class PDFFileEventDTO {
  @SerializedName("account")
  private AccountInfo account = null;

  @SerializedName("event")
  private PDFFileEvents event = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("time")
  private OffsetDateTime time = null;

  public PDFFileEventDTO account(AccountInfo account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public AccountInfo getAccount() {
    return account;
  }

  public void setAccount(AccountInfo account) {
    this.account = account;
  }

  public PDFFileEventDTO event(PDFFileEvents event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(required = true, description = "")
  public PDFFileEvents getEvent() {
    return event;
  }

  public void setEvent(PDFFileEvents event) {
    this.event = event;
  }

  public PDFFileEventDTO ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(required = true, description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public PDFFileEventDTO time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PDFFileEventDTO pdFFileEventDTO = (PDFFileEventDTO) o;
    return Objects.equals(this.account, pdFFileEventDTO.account) &&
        Objects.equals(this.event, pdFFileEventDTO.event) &&
        Objects.equals(this.ip, pdFFileEventDTO.ip) &&
        Objects.equals(this.time, pdFFileEventDTO.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, event, ip, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PDFFileEventDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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