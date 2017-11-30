package quoters;

import org.junit.Test;

public class PropertyFileApplicationContextTest {
    @Test
    public void sayQuote() throws Exception {
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }
}