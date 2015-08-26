package law.smart.micro.jetty.ctrl;


import law.smart.micro.jetty.JettyService;
import law.smart.micro.jetty.exception.MissingGreetingException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class JettyController implements JettyService {

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String home() {
        return "{\"status\" : \"ok\"}";
    }

    @Override
    public String get() throws MissingGreetingException {
        throw new MissingGreetingException("Get");
    }

    @Override
    public String post() throws MissingGreetingException {
        throw new MissingGreetingException("Post");
    }

    @Override
    public String put() throws MissingGreetingException {
        throw new MissingGreetingException("Put");
    }

    @Override
    public String delete() throws MissingGreetingException {
        throw new MissingGreetingException("Delete");
    }
}
