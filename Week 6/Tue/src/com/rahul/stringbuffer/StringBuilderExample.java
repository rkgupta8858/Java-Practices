package com.rahul.stringbuffer;

public class StringBuilderExample {

	public static void main(String[] args) {
		String userName = "rkgupta8858";
		String orderStatus = "Dispatched";
		String date = "10/08/2025";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Dear "+userName+ " Your order has been "+orderStatus+ " and will be delivered by "+date);
		System.out.println(sb);

	}

}
