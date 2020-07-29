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
import io.swagger.client.model.LoginDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AccountPrivateInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class AccountPrivateInfo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("logins")
  private List<LoginDescription> logins = new ArrayList<LoginDescription>();

  @SerializedName("name")
  private String name = null;

  public AccountPrivateInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountPrivateInfo logins(List<LoginDescription> logins) {
    this.logins = logins;
    return this;
  }

  public AccountPrivateInfo addLoginsItem(LoginDescription loginsItem) {
    this.logins.add(loginsItem);
    return this;
  }

   /**
   * Get logins
   * @return logins
  **/
  @Schema(required = true, description = "")
  public List<LoginDescription> getLogins() {
    return logins;
  }

  public void setLogins(List<LoginDescription> logins) {
    this.logins = logins;
  }

  public AccountPrivateInfo name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPrivateInfo accountPrivateInfo = (AccountPrivateInfo) o;
    return Objects.equals(this.email, accountPrivateInfo.email) &&
        Objects.equals(this.logins, accountPrivateInfo.logins) &&
        Objects.equals(this.name, accountPrivateInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, logins, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPrivateInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
