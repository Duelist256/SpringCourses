package com.ps.beans.others;

import com.ps.beans.SimpleBeanImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/config-01-*.xml");

        // config-01-simple-bean.xml
        SimpleBeanImpl bean = (SimpleBeanImpl) ctx.getBean("simpleBean");
        assertNotNull(bean);

        // config-01-collection-holder.xml
        CollectionHolder ch = (CollectionHolder) ctx.getBean("collectionHolder");
        assertNotNull(ch);

        // config-01-date-converter.xml
        CustomEditorConfigurer cec = ctx.getBean(CustomEditorConfigurer.class);
        assertNotNull(cec);

        // config-01-multibean.xml
        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);

        // config-01-patterns.xml
        SimpleSingleton instance = (SimpleSingleton) ctx.getBean("simpleSingleton");
        assertNotNull(instance);
        assertEquals(SimpleSingleton.getInstance(), instance);

        SimpleBeanImpl simpleBean = (SimpleBeanImpl) ctx.getBean("simpleFm");
        assertNotNull(simpleBean);

        SimpleFactoryBean simpleBeanFactory = (SimpleFactoryBean) ctx.getBean("simpleBeanFactory");
        assertNotNull(simpleBeanFactory);

        SimpleBeanImpl simpleBean2 = (SimpleBeanImpl) ctx.getBean("simpleFB");
        assertNotNull(simpleBean2);

        SimpleBeanImpl smartBean = (SimpleBeanImpl) ctx.getBean("smartBean");
        assertNotNull(smartBean);
    }
}
