package io.swagger.client.helper;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import io.swagger.client.ApiClient;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class Configurator {

    static ClassLoader classloader = Configurator.class.getClassLoader();
    static private Map<String,String> map;
    static ApiClient apiClient;

    static {
        String confFile = classloader.getResource("account.yaml").getFile();
        FileReader fr = null;
        try {
            fr = new FileReader(confFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        YamlReader yaml = new YamlReader(fr);
        try {
            map = (Map<String, String>) yaml.read();
        } catch (YamlException e) {
            e.printStackTrace();
        }
        TokenRequest tokenRequest = new TokenRequest(map.get("username"),map.get("password"),map.get("secret"),map.get("client"));
        apiClient = new ApiClient();
        apiClient.setAccessToken(tokenRequest.getAccess_token());
    }

    private Configurator(){

    }

    public static ApiClient getApiClient(){
        return apiClient;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
