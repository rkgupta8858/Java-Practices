package com.rahul.rk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	App app = new App();

	@Test
	public void addTwoNumberPositive() {
		int expected = 40;
		int sum = app.addTwoNumber(10, 30);
		assertEquals(expected, sum);
	}
	@Test
	public void addTwoNumberNegative() {
		int expected = -40;
		int sum = app.addTwoNumber(-10, -30);
		assertEquals(expected, sum);
	}
	@Test
	public void addTwoNumberLeftNegative() {
		int expected = 20;
		int sum = app.addTwoNumber(-10, 30);
		assertEquals(expected, sum);
	}
	@Test
	public void addTwoNumberRightNegative() {
		int expected = -20;
		int sum = app.addTwoNumber(10, -30);
		assertEquals(expected, sum);
	}
	
	@Test
	public void divTwoNumberRightZero() {
		int expected = 0;
		int div = app.divTwoNumber(10, 0);
		assertEquals(expected, div);
	}

}
