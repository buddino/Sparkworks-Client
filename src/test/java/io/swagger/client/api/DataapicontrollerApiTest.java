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


package io.swagger.client.api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.helper.TimerangeResult;
import io.swagger.client.helper.TokenRequest;
import io.swagger.client.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * API tests for DataapicontrollerApi
 */
public class DataapicontrollerApiTest {

    ApiClient client = new ApiClient();
    private final DataapicontrollerApi api = new DataapicontrollerApi();
    private final ResourceapicontrollerApi resApi = new ResourceapicontrollerApi();

    @Before
    public void setup(){
        Locale.setDefault(new Locale("en", "US"));
        TokenRequest tokenRequest = new TokenRequest("gaia-prato","cmRxm2","c9ce97aa-3b71-446e-b3f4-f7130dfddb32","CNIT");
        ApiClient apiClient = new ApiClient();
        apiClient.setAccessToken(tokenRequest.getAccess_token());
        api.setApiClient(apiClient);
        resApi.setApiClient(apiClient);

    }

    
    /**
     * getLatestSummary
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestSummaryUsingGETTest() throws ApiException {
        SummaryDTO response = api.getLatestSummaryUsingGET(154440L);
        System.out.println(response);
    }
    
    /**
     * getLatestValues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestValuesUsingGETTest() throws ApiException {
        Long resourceId = null;
        LatestDTO response = api.getLatestValuesUsingGET(154440L);
        System.out.println(response);

        // TODO: test validations
    }
    
    /**
     * queryLatestResourcesData
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryLatestResourcesDataUsingPOSTTest() throws ApiException {
        QueryLatestResourceDataDTO queryLatestResourceDataDTO = null;
        // QueryLatestResourceDataResultDTO response = api.queryLatestResourcesDataUsingPOST(queryLatestResourceDataDTO);

        // TODO: test validations
    }
    
    /**
     * queryTimeRangeResourcesData
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTimeRangeResourcesDataUsingPOSTTest() throws ApiException {
        Long t1;
        QueryTimeRangeResourceDataDTO q = new QueryTimeRangeResourceDataDTO();
        QueryTimeRangeResourceDataCriteriaDTO c = new QueryTimeRangeResourceDataCriteriaDTO();
        c.setResourceID(154440L);
        c.setFrom(1477954800000L);
        c.setTo(1480028400000L);
        c.setGranularity(QueryTimeRangeResourceDataCriteriaDTO.GranularityEnum._5MIN);
        q.addQueriesItem(c);
        t1 = System.currentTimeMillis();
            Collection<List> results = api.queryTimeRangeResourcesDataUsingPOST(q).getResults().values();
        System.out.println(String.format("Query time: %dms",System.currentTimeMillis() - t1));

        List<List> resultsList = new ArrayList(results);
        List measurements = resultsList.get(0);
        System.out.println(String.format("Found %d Measurements",measurements.size()));

        Gson gson = new Gson();
        JsonArray arr = (JsonArray) gson.toJsonTree(measurements);
        List<TimerangeResult> list = gson.fromJson(arr, new TypeToken<List<TimerangeResult>>(){}.getType());

        t1 = System.currentTimeMillis();
            Double avg = list.stream().mapToDouble(e->e.getReading()).average().getAsDouble();
            Double max = list.stream().mapToDouble(e->e.getReading()).max().getAsDouble();
            Double min = list.stream().mapToDouble(e->e.getReading()).min().getAsDouble();
        System.out.println(String.format("Computing time: %dms",System.currentTimeMillis() - t1));

        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);
    }

    @Test
    public void giveMeaName() throws ApiException {
        ResourceListDTO response = resApi.listUsingGET1("gaia-prato/gw1/weather/temp","",false,"");
        Long resourceId = response.getResources().get(0).getResourceId();

        QueryTimeRangeResourceDataDTO q = new QueryTimeRangeResourceDataDTO();
        QueryTimeRangeResourceDataCriteriaDTO c = new QueryTimeRangeResourceDataCriteriaDTO();
        c.setResourceID(resourceId);
        c.setFrom(1479769200000L);
        c.setTo(1479855600000L);
        c.setGranularity(QueryTimeRangeResourceDataCriteriaDTO.GranularityEnum.HOUR);
        q.addQueriesItem(c);
        Collection<List> results = api.queryTimeRangeResourcesDataUsingPOST(q).getResults().values();
        List<List> resultsList = new ArrayList(results);
        List measurements = resultsList.get(0);
        Gson gson = new Gson();
        JsonArray arr = (JsonArray) gson.toJsonTree(measurements);
        List<TimerangeResult> list = gson.fromJson(arr, new TypeToken<List<TimerangeResult>>(){}.getType());
        list.forEach(e-> System.out.println(String.format("%.2f\t%s",e.getReading(),e.getFormattedTimestamp())));
    }



    
}