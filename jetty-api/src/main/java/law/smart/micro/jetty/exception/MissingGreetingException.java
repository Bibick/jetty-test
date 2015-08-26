package law.smart.micro.jetty.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Exceptions that are part of a service's public API should be placed in the *-api module. Furthermore they should
// inherit from the generic exception class in the SmartLaw microservice library. The @ResponseStatus annotation will
// be used for the transparent error transport implementation during Feign interactions and must be present on
// exceptions that are part of the public API exposed by this service. For other exception types, this annotation is not
// required by the system.

// ServiceExceptions must have a constructor taking a string as parameter, to be reinstantiated at consumer side!
@ResponseStatus(reason = "jetty-missing-greeting", value = HttpStatus.BAD_REQUEST)
public class MissingGreetingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

    public MissingGreetingException(String language) {
        super("Missing greeting in " + language);
    }

}
