package com.rahul.rk.bean;

import java.util.Properties;

public class TestBean implements Test
{
	private Properties infor;

	public TestBean(Properties infor) {
		super();
		this.infor = infor;
	}

	@Override
	public String toString() {
		return "TestBean [infor=" + infor + "]";
	}
	
}
