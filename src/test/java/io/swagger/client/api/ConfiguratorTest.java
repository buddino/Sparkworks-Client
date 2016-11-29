package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.helper.Configurator;
import org.junit.Assert;
import org.junit.Test;

public class ConfiguratorTest {

    @Test
    public void configuratorTest(){
        ApiClient client = Configurator.getApiClient();
        Assert.assertNotNull(client);
    }

}
