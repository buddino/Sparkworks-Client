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

import java.util.Objects;

/**
 * ResourceDataDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T11:31:19.558Z")
public class ResourceDataDTO {
  @SerializedName("reading")
  private Double reading = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  public ResourceDataDTO reading(Double reading) {
    this.reading = reading;
    return this;
  }

   /**
   * Get reading
   * @return reading
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getReading() {
    return reading;
  }

  public void setReading(Double reading) {
    this.reading = reading;
  }

  public ResourceDataDTO timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDataDTO resourceDataDTO = (ResourceDataDTO) o;
    return Objects.equals(this.reading, resourceDataDTO.reading) &&
        Objects.equals(this.timestamp, resourceDataDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reading, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDataDTO {\n");
    
    sb.append("    reading: ").append(toIndentedString(reading)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

