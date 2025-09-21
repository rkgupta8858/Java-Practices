// Legacy Class ---->  "Properties"

package com.rahul.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.rk.bean.Test;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("TestCfg.xml");
    	Test test = ac.getBean(Test.class);
    	System.out.println(test);
    }
}
