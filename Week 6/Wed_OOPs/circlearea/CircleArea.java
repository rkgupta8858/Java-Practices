package com.rahul.oops.circlearea;

public class CircleArea {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		double r = circle.getRadius();
		
		CircleArea ca = new CircleArea();
		double areaOfCircle=ca.area(r);
		
		System.out.println(areaOfCircle);
		
		

	}
	public double area(double radius)
	{
		double area = (22.0/7)*radius*radius;
		return area;
	}
}
