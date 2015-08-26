package law.smart.micro.jetty;


import law.smart.micro.jetty.exception.MissingGreetingException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/*
 * The name of the Faign client should be the same as the spring.application.name property of the implementation.
 */
@FeignClient("jetty")
public interface JettyService {

    @RequestMapping(method = GET, value = "/test")
    String get() throws MissingGreetingException;

    @RequestMapping(method = POST, value = "/test")
    String post() throws MissingGreetingException;

    @RequestMapping(method = PUT, value = "/test")
    String put() throws MissingGreetingException;

    @RequestMapping(method = DELETE, value = "/test")
    String delete() throws MissingGreetingException;

}
