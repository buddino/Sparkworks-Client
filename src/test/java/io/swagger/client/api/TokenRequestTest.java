package io.swagger.client.api;

import io.swagger.client.helper.TokenRequest;
import org.junit.Test;

/**
 * Created by cuffaro on 29/11/2016.
 */
public class TokenRequestTest {

    @Test
    public void requestTest(){
        TokenRequest tokenRequest = new TokenRequest("gaia-prato","cmRxm2","c9ce97aa-3b71-446e-b3f4-f7130dfddb32","CNIT");
        System.out.println(tokenRequest.getAccess_token());
    }
}
