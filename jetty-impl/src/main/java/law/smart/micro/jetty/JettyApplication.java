package law.smart.micro.jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"law.smart"})
@EnableAutoConfiguration

@EnableFeignClients(basePackages = {"law.smart"})
@EnableEurekaClient

public class JettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JettyApplication.class, args);
    }
}
