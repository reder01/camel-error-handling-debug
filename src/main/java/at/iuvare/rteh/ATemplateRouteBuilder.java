package at.iuvare.rteh;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ATemplateRouteBuilder extends BaseRouteBuilder {

    @Override
    public void configure() throws Exception {
        super.configure();

        routeTemplate("errorTestRoute")
        .from("timer:test").process(exchange -> {
            throw new RuntimeException("Random Exception");
        }).log("Route done");
    }

}
