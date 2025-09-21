package com.rahul.rk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rahul.rk.bean.Test;

public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("TestConfiguration.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	
    	Test test = beanFactory.getBean(Test.class);
    	test.display();
    	
    }
}
