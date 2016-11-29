package io.swagger.client.helper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * Created by cuffaro on 29/11/2016.
 */
public class TokenRequest {

    private String access_token = null;
    private Long expires_in = null;

    public TokenRequest(String username, String password, String secret, String clientname) {
        Gson J = new Gson();
        OkHttpClient client = new OkHttpClient();
        FormEncodingBuilder formEncodingBuilder = new FormEncodingBuilder();
        RequestBody formBody = formEncodingBuilder
                .add("client_id", clientname)
                .add("client_secret", secret)
                .add("scope", "read")
                .add("grant_type", "password")
                .add("username", username)
                .add("password", password)
                .build();
        Request request = new Request.Builder()
                .url("https://sso.sparkworks.net/aa/oauth/token")
                .post(formBody)
                .build();
        try {
            Response response = client.newCall(request).execute();
            JsonObject resp = J.fromJson(response.body().string(), JsonObject.class);
            this.access_token = resp.get("access_token").getAsString();
            this.expires_in = resp.get("expires_in").getAsLong();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public Long getExpires_in() {
        return expires_in;
    }
}
