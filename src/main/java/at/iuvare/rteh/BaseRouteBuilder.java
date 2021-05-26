package at.iuvare.rteh;

import org.apache.camel.builder.RouteBuilder;

public class BaseRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        errorHandler(CustomErrorHandlerBuilderFactory.getBuilder());
        
    }
    
}
