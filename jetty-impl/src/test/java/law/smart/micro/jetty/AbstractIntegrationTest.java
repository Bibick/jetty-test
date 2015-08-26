package law.smart.micro.jetty;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes =law.smart.micro.jetty.JettyApplication.class)
@WebAppConfiguration
@IntegrationTest({
    "server.port:0",
    "eureka.client.registerWithEureka:false",
    "eureka.client.fetchRegistry:false",
    "tenant.context.requestinterceptor.usehostname:true"
})
@DirtiesContext
public abstract class AbstractIntegrationTest {


    @Value("${local.server.port}")
    private int port;


    public int getPort() {
        return port;
    }

}
