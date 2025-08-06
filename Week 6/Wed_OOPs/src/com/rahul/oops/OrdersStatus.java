package com.rahul.oops;

public class OrdersStatus {
	public static void main(String[] args) {
		EncapsulationSettetGetter esg = new EncapsulationSettetGetter();
		esg.setProductId(101);
		esg.setProductName("Realme 9");
		esg.setProductPrice(20999);
		esg.setAddress("J. P. Nagar, Bengalore");
		
		System.out.println(esg.getProductId());
		System.out.println(esg.getProductName());
		System.out.println(esg.getProductPrice());
		System.out.println(esg.getAddress());
		
		
		
		
	}
}
