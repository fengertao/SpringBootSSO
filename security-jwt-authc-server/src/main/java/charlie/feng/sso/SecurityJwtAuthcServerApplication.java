package charlie.feng.sso;

import charlie.feng.sso.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("charlie.feng.sso.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SecurityJwtAuthcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtAuthcServerApplication.class, args);
    }

}
