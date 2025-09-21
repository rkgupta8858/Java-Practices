// set

package com.rahul.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.rk.bean.Test;
import com.rahul.rk.bean.TestBean;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap = new ClassPathXmlApplicationContext("TestCfg.xml");
    	Test test = ap.getBean(TestBean.class);
    	System.out.println(test);
    }
}
