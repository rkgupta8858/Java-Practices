package com.rahul.rk.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Address {
	
	@Value("999")
	private Integer houseNo;
	
	@Value("My Home RK Gupta Palace")
	private String houseName;

	@Override
	public String toString() {
		return "houseNo=" + houseNo + "\nhouseName=" + houseName;
	}
}
