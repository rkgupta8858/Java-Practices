package com.rahul.rk.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean implements Test
{
	public void show() {
		System.out.println("Hello Rahul ! Welcome to Alpha World......");
	}
}
