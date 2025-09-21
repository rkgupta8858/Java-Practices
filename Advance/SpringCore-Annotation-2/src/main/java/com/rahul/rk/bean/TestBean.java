package com.rahul.rk.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class TestBean{
	
	// if we use value then no need to define setter or constructer....
	
	@Value("101")
	private int no;
	
	@Value("Rahul")
	private String name;
	
	@Value("50000.0")
	private Double sal;

	@Override
	public String toString() {
		return "No is : " + no + "\nName is : " + name + "\nSalary is : " + sal;
	}
	
	
	
}
