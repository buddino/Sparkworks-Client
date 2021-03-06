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
 * IntelligenceDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T11:31:19.558Z")
public class IntelligenceDTO {
  @SerializedName("actuators")
  private List<ActuatorDTO> actuators = new ArrayList<ActuatorDTO>();

  @SerializedName("creationDate")
  private Long creationDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("site")
  private SiteDTO site = null;

  @SerializedName("triggers")
  private List<TriggerDTO> triggers = new ArrayList<TriggerDTO>();

  @SerializedName("type")
  private String type = null;

  @SerializedName("user")
  private UserDTO user = null;

  public IntelligenceDTO actuators(List<ActuatorDTO> actuators) {
    this.actuators = actuators;
    return this;
  }

  public IntelligenceDTO addActuatorsItem(ActuatorDTO actuatorsItem) {
    this.actuators.add(actuatorsItem);
    return this;
  }

   /**
   * Get actuators
   * @return actuators
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ActuatorDTO> getActuators() {
    return actuators;
  }

  public void setActuators(List<ActuatorDTO> actuators) {
    this.actuators = actuators;
  }

  public IntelligenceDTO creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public IntelligenceDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IntelligenceDTO id(Long id) {
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

  public IntelligenceDTO name(String name) {
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

  public IntelligenceDTO site(SiteDTO site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(example = "null", value = "")
  public SiteDTO getSite() {
    return site;
  }

  public void setSite(SiteDTO site) {
    this.site = site;
  }

  public IntelligenceDTO triggers(List<TriggerDTO> triggers) {
    this.triggers = triggers;
    return this;
  }

  public IntelligenceDTO addTriggersItem(TriggerDTO triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TriggerDTO> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<TriggerDTO> triggers) {
    this.triggers = triggers;
  }

  public IntelligenceDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IntelligenceDTO user(UserDTO user) {
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
    IntelligenceDTO intelligenceDTO = (IntelligenceDTO) o;
    return Objects.equals(this.actuators, intelligenceDTO.actuators) &&
        Objects.equals(this.creationDate, intelligenceDTO.creationDate) &&
        Objects.equals(this.description, intelligenceDTO.description) &&
        Objects.equals(this.id, intelligenceDTO.id) &&
        Objects.equals(this.name, intelligenceDTO.name) &&
        Objects.equals(this.site, intelligenceDTO.site) &&
        Objects.equals(this.triggers, intelligenceDTO.triggers) &&
        Objects.equals(this.type, intelligenceDTO.type) &&
        Objects.equals(this.user, intelligenceDTO.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actuators, creationDate, description, id, name, site, triggers, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligenceDTO {\n");
    
    sb.append("    actuators: ").append(toIndentedString(actuators)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

