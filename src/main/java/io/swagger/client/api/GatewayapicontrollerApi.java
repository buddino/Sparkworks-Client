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

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.GatewayDTO;
import io.swagger.client.model.GatewayListDTO;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GatewayapicontrollerApi {
    private ApiClient apiClient;

    public GatewayapicontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GatewayapicontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addGatewayUsingPOST */
    private com.squareup.okhttp.Call addGatewayUsingPOSTCall(GatewayDTO gatewayDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = gatewayDTO;
        
        // verify the required parameter 'gatewayDTO' is set
        if (gatewayDTO == null) {
            throw new ApiException("Missing the required parameter 'gatewayDTO' when calling addGatewayUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/v1/gateway".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * addGateway
     * 
     * @param gatewayDTO gatewayDTO (required)
     * @return GatewayDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GatewayDTO addGatewayUsingPOST(GatewayDTO gatewayDTO) throws ApiException {
        ApiResponse<GatewayDTO> resp = addGatewayUsingPOSTWithHttpInfo(gatewayDTO);
        return resp.getData();
    }

    /**
     * addGateway
     * 
     * @param gatewayDTO gatewayDTO (required)
     * @return ApiResponse&lt;GatewayDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GatewayDTO> addGatewayUsingPOSTWithHttpInfo(GatewayDTO gatewayDTO) throws ApiException {
        com.squareup.okhttp.Call call = addGatewayUsingPOSTCall(gatewayDTO, null, null);
        Type localVarReturnType = new TypeToken<GatewayDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * addGateway (asynchronously)
     * 
     * @param gatewayDTO gatewayDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addGatewayUsingPOSTAsync(GatewayDTO gatewayDTO, final ApiCallback<GatewayDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addGatewayUsingPOSTCall(gatewayDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listGatewaysUsingGET */
    private com.squareup.okhttp.Call listGatewaysUsingGETCall(String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/v1/gateway".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * listGateways
     * 
     * @param name name (optional)
     * @return GatewayListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GatewayListDTO listGatewaysUsingGET(String name) throws ApiException {
        ApiResponse<GatewayListDTO> resp = listGatewaysUsingGETWithHttpInfo(name);
        return resp.getData();
    }

    /**
     * listGateways
     * 
     * @param name name (optional)
     * @return ApiResponse&lt;GatewayListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GatewayListDTO> listGatewaysUsingGETWithHttpInfo(String name) throws ApiException {
        com.squareup.okhttp.Call call = listGatewaysUsingGETCall(name, null, null);
        Type localVarReturnType = new TypeToken<GatewayListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * listGateways (asynchronously)
     * 
     * @param name name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGatewaysUsingGETAsync(String name, final ApiCallback<GatewayListDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGatewaysUsingGETCall(name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
