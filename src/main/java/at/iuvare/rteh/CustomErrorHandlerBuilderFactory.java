package at.iuvare.rteh;

import org.apache.camel.builder.DefaultErrorHandlerBuilder;
import org.apache.camel.builder.ErrorHandlerBuilder;
import org.apache.camel.support.processor.DelegateAsyncProcessor;

public class CustomErrorHandlerBuilderFactory {

    public static ErrorHandlerBuilder getBuilder() {
        DefaultErrorHandlerBuilder defaultErrorHandlerBuilder = new DefaultErrorHandlerBuilder();
        CustomErrorHandler p = new CustomErrorHandler();
        final DelegateAsyncProcessor delegateAsyncProcessor = new DelegateAsyncProcessor(exchange -> {
            p.process(exchange);           
        });

        defaultErrorHandlerBuilder.setOnExceptionOccurred(delegateAsyncProcessor);
        return defaultErrorHandlerBuilder;
    }

}
