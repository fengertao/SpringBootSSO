package charlie.feng.sso;

import charlie.feng.sso.utils.RsaUtils;
import org.junit.jupiter.api.Test;

public class JwtTest {

    @Test
    public void test1() throws Exception {
        String privateKey = "id_rsa";
        String publicKey = "id_rsa.pub";
        RsaUtils.generateKey(publicKey, privateKey, "dpb", 1024);
    }

}