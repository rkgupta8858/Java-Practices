package com.rahul.rk.bean;

import java.util.Arrays;

public class TestBean implements Test {
	private String[] colours;

	public void setColours(String[] colours) {
		this.colours = colours;
	}
	
//	public TestBean(String[] colours) {
//		super();
//		this.colours = colours;
//	}

	@Override
	public String toString() {
		return "Colours=" + Arrays.toString(colours);
	}
	
}
