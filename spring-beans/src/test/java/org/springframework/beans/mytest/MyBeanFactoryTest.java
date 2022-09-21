package org.springframework.beans.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

/**
 * @author dufresne
 * @date 2022/9/4
 */
@SuppressWarnings("deprecation")
public class MyBeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("xmlTest.xml", getClass()));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		Assert.isTrue("testStr".equals(bean.getTestStr()), "it's a pity!");
	}
}
