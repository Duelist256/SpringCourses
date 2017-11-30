package quoters;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyFileApplicationContextTest {
    @Test
    public void name() throws Exception {
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }
}