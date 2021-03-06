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
import io.swagger.client.model.IdentityInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GroupIdentities
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-27T15:04:00.483Z[GMT]")
public class GroupIdentities {
  @SerializedName("identities")
  private List<IdentityInfo> identities = new ArrayList<IdentityInfo>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("permission")
  private GroupPermission permission = null;

  @SerializedName("personal")
  private Boolean personal = null;

  public GroupIdentities identities(List<IdentityInfo> identities) {
    this.identities = identities;
    return this;
  }

  public GroupIdentities addIdentitiesItem(IdentityInfo identitiesItem) {
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @Schema(required = true, description = "")
  public List<IdentityInfo> getIdentities() {
    return identities;
  }

  public void setIdentities(List<IdentityInfo> identities) {
    this.identities = identities;
  }

  public GroupIdentities name(String name) {
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

  public GroupIdentities permission(GroupPermission permission) {
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

  public GroupIdentities personal(Boolean personal) {
    this.personal = personal;
    return this;
  }

   /**
   * Get personal
   * @return personal
  **/
  @Schema(required = true, description = "")
  public Boolean isPersonal() {
    return personal;
  }

  public void setPersonal(Boolean personal) {
    this.personal = personal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupIdentities groupIdentities = (GroupIdentities) o;
    return Objects.equals(this.identities, groupIdentities.identities) &&
        Objects.equals(this.name, groupIdentities.name) &&
        Objects.equals(this.permission, groupIdentities.permission) &&
        Objects.equals(this.personal, groupIdentities.personal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities, name, permission, personal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupIdentities {\n");
    
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
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
