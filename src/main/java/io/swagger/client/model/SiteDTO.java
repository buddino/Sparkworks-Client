/*
 * SparkWorks Core API
 * Management Service for the SparkWorks Processing Engine
 *
 * OpenAPI spec version: 1.0
 * Contact: info@sparkworks.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SiteDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T11:31:19.558Z")
public class SiteDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longtitude")
  private Double longtitude = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sharedUsers")
  private List<ShareDTO> sharedUsers = new ArrayList<ShareDTO>();

  @SerializedName("subsites")
  private List<SiteDTO> subsites = new ArrayList<SiteDTO>();

  @SerializedName("user")
  private UserDTO user = null;

  public SiteDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SiteDTO latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public SiteDTO longtitude(Double longtitude) {
    this.longtitude = longtitude;
    return this;
  }

   /**
   * Get longtitude
   * @return longtitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLongtitude() {
    return longtitude;
  }

  public void setLongtitude(Double longtitude) {
    this.longtitude = longtitude;
  }

  public SiteDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SiteDTO sharedUsers(List<ShareDTO> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }

  public SiteDTO addSharedUsersItem(ShareDTO sharedUsersItem) {
    this.sharedUsers.add(sharedUsersItem);
    return this;
  }

   /**
   * Get sharedUsers
   * @return sharedUsers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ShareDTO> getSharedUsers() {
    return sharedUsers;
  }

  public void setSharedUsers(List<ShareDTO> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  public SiteDTO subsites(List<SiteDTO> subsites) {
    this.subsites = subsites;
    return this;
  }

  public SiteDTO addSubsitesItem(SiteDTO subsitesItem) {
    this.subsites.add(subsitesItem);
    return this;
  }

   /**
   * Get subsites
   * @return subsites
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SiteDTO> getSubsites() {
    return subsites;
  }

  public void setSubsites(List<SiteDTO> subsites) {
    this.subsites = subsites;
  }

  public SiteDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteDTO siteDTO = (SiteDTO) o;
    return Objects.equals(this.id, siteDTO.id) &&
        Objects.equals(this.latitude, siteDTO.latitude) &&
        Objects.equals(this.longtitude, siteDTO.longtitude) &&
        Objects.equals(this.name, siteDTO.name) &&
        Objects.equals(this.sharedUsers, siteDTO.sharedUsers) &&
        Objects.equals(this.subsites, siteDTO.subsites) &&
        Objects.equals(this.user, siteDTO.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latitude, longtitude, name, sharedUsers, subsites, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longtitude: ").append(toIndentedString(longtitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    subsites: ").append(toIndentedString(subsites)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
