package com.rahul.rk.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Employee {
	@Value("101")
	private Integer empId;
	
	@Value("Rahul Kumar Gupta")
	private String empName;
	
	@Autowired
	private Address empAddress;
		
	@Value("#{T(java.util.List).of('Red', 'Green', 'Blue', 'Red')}")
	private List<String> colors;
	
	@Value("#{T(java.util.Set).of('Red', 'Green', 'Blue')}")
	private Set<String> colors1;
	
	@Value("#{T(java.util.Map).of(101,'Red', 102,'Green', 103,'Blue')}")
	private Map< Integer,String> colors2;

	@Override
	public String toString() {
		return "empId=" + empId + 
				"\nempName=" + empName + 
				"\nempAddress=" + empAddress + 
				"\nListColors=" + colors+
				"\nSetColors=" + colors1+
				"\nMapColors=" + colors2;
	}
	
	
}
