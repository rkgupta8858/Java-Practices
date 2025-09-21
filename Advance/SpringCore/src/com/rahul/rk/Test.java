package com.rahul.rk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs = new FileSystemResource("testcnf.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
//		TestBean ts = (TestBean) bf.getBean("test");
//		TestBean ts = bf.getBean("test",TestBean.class);
		TestBean ts = bf.getBean(TestBean.class);
		
		System.out.println(ts.getId());
		System.out.println(ts.getName());
		System.out.println(ts.getClass());
		
	}

}
