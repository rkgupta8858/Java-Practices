package com.rahul.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.rk.bean.Test;
import com.rahul.rk.bean.TestBean;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("TestCfg.xml");
//    	TestBean tb = ac.getBean(TestBean.class);
//    	tb.show();
    	
    	Test test = ac.getBean(Test.class);
    	test.show();
    }
}
