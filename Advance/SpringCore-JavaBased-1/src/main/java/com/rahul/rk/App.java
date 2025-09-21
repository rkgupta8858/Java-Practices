package com.rahul.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.rk.bean.TestBean;
import com.rahul.rk.config.MyConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        TestBean testBean = ac.getBean(TestBean.class);
        testBean.hello();
    }
}
