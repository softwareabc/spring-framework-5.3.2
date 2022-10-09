package mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

/**
 * @author dufresne
 * @date 2022/9/4
 */
//@SuppressWarnings("deprecation")
public class MyApplicationContextTest {

	@Test
	public void testSimpleLoad() {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("xmlTest.xml", getClass()));
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mytest/xmlTest.xml");
		MyTestBean bean = (MyTestBean) applicationContext.getBean("myTestBean");
		Assert.isTrue("myTestBeanStr".equals(bean.getTestStr()), "it's a pity!");
		//Configuration problem: Bean name 'myTestBean' is already used in this <beans> element
		//Offending resource: class path resource [mytest/xmlTest.xml]
	}
}
