package no.avec.hackit;

import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by ronny.ness on 11/08/15.
 */

@Component
@Path("/hello")
public class HelloController {

    @GET
    @Produces("application/json")
    public String hello() {
        return new String("Hello!");
    }
}
