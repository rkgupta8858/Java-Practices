package com.rahul.rk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rahul.rk.bean.Test;
import com.rahul.rk.bean.TestBean;

public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("TestConfiguration.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
//    	TestBean testBean = (TestBean) beanFactory.getBean("rahul");
    	Test test = (Test) beanFactory.getBean("rahul");
    	
    	test.display();
    }
}
