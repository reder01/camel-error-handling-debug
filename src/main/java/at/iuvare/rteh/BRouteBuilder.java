package at.iuvare.rteh;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.TemplatedRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BRouteBuilder extends BaseRouteBuilder {

    @Override
    public void configure() throws Exception {
        super.configure();
        TemplatedRouteBuilder.builder(getContext(), "errorTestRoute")
        .routeId("errorTestRouteInstance")
        .add();
    }

}
