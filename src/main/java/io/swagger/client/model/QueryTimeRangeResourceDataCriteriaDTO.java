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
 * QueryTimeRangeResourceDataCriteriaDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T11:31:19.558Z")
public class QueryTimeRangeResourceDataCriteriaDTO {
  @SerializedName("from")
  private Long from = null;

  /**
   * Gets or Sets granularity
   */
  public enum GranularityEnum {
    @SerializedName("5min")
    _5MIN("5min"),
    
    @SerializedName("quarter")
    QUARTER("quarter"),
    
    @SerializedName("hour")
    HOUR("hour"),
    
    @SerializedName("day")
    DAY("day"),
    
    @SerializedName("month")
    MONTH("month");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("granularity")
  private GranularityEnum granularity = null;

  @SerializedName("resourceID")
  private Long resourceID = null;

  @SerializedName("resourceURI")
  private String resourceURI = null;

  @SerializedName("resultLimit")
  private Integer resultLimit = null;

  @SerializedName("to")
  private Long to = null;

  public QueryTimeRangeResourceDataCriteriaDTO from(Long from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public QueryTimeRangeResourceDataCriteriaDTO granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  @ApiModelProperty(example = "null", value = "")
  public GranularityEnum getGranularity() {
    return granularity;
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public QueryTimeRangeResourceDataCriteriaDTO resourceID(Long resourceID) {
    this.resourceID = resourceID;
    return this;
  }

   /**
   * Get resourceID
   * @return resourceID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getResourceID() {
    return resourceID;
  }

  public void setResourceID(Long resourceID) {
    this.resourceID = resourceID;
  }

  public QueryTimeRangeResourceDataCriteriaDTO resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * Get resourceURI
   * @return resourceURI
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public QueryTimeRangeResourceDataCriteriaDTO resultLimit(Integer resultLimit) {
    this.resultLimit = resultLimit;
    return this;
  }

   /**
   * Get resultLimit
   * @return resultLimit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getResultLimit() {
    return resultLimit;
  }

  public void setResultLimit(Integer resultLimit) {
    this.resultLimit = resultLimit;
  }

  public QueryTimeRangeResourceDataCriteriaDTO to(Long to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimeRangeResourceDataCriteriaDTO queryTimeRangeResourceDataCriteriaDTO = (QueryTimeRangeResourceDataCriteriaDTO) o;
    return Objects.equals(this.from, queryTimeRangeResourceDataCriteriaDTO.from) &&
        Objects.equals(this.granularity, queryTimeRangeResourceDataCriteriaDTO.granularity) &&
        Objects.equals(this.resourceID, queryTimeRangeResourceDataCriteriaDTO.resourceID) &&
        Objects.equals(this.resourceURI, queryTimeRangeResourceDataCriteriaDTO.resourceURI) &&
        Objects.equals(this.resultLimit, queryTimeRangeResourceDataCriteriaDTO.resultLimit) &&
        Objects.equals(this.to, queryTimeRangeResourceDataCriteriaDTO.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, granularity, resourceID, resourceURI, resultLimit, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimeRangeResourceDataCriteriaDTO {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    resultLimit: ").append(toIndentedString(resultLimit)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
