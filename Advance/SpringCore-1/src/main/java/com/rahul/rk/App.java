package com.rahul.rk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.rahul.rk.bean.TestBean;

public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new FileSystemResource("TextConfiguration.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	TestBean testBean = (TestBean) beanFactory.getBean("testBean");
    	testBean.show();
    }
}
