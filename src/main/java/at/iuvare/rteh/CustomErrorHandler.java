package at.iuvare.rteh;

import org.apache.camel.Exchange;
import org.apache.camel.ExtendedExchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.ErrorHandlerBuilder;
import org.apache.camel.processor.errorhandler.ErrorHandlerSupport;
import org.apache.camel.spi.ErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomErrorHandler extends ErrorHandlerSupport implements Processor {

    public final static Logger LOG = LoggerFactory.getLogger(CustomErrorHandler.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("Handled Error");
        ExtendedExchange ex = (ExtendedExchange)exchange;
        ex.setErrorHandlerHandled(true);     
    }

    @Override
    public ErrorHandler clone(Processor output) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Processor getOutput() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean supportTransacted() {
        // TODO Auto-generated method stub
        return false;
    }

}
