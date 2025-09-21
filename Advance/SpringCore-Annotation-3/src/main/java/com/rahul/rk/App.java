package com.rahul.rk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.rk.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("TestCfg.xml");
        Employee employee = ac.getBean(Employee.class);
        System.out.println(employee);
    }
}