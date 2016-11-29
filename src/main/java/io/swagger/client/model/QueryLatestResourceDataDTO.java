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
 * QueryLatestResourceDataDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T11:31:19.558Z")
public class QueryLatestResourceDataDTO {
  @SerializedName("queries")
  private List<QueryResourceDataCriteriaDTO> queries = new ArrayList<QueryResourceDataCriteriaDTO>();

  public QueryLatestResourceDataDTO queries(List<QueryResourceDataCriteriaDTO> queries) {
    this.queries = queries;
    return this;
  }

  public QueryLatestResourceDataDTO addQueriesItem(QueryResourceDataCriteriaDTO queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<QueryResourceDataCriteriaDTO> getQueries() {
    return queries;
  }

  public void setQueries(List<QueryResourceDataCriteriaDTO> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryLatestResourceDataDTO queryLatestResourceDataDTO = (QueryLatestResourceDataDTO) o;
    return Objects.equals(this.queries, queryLatestResourceDataDTO.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryLatestResourceDataDTO {\n");
    
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

