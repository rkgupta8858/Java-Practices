package com.rahul.rk;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer a1 = (Integer) o1;
		Integer a2 = (Integer) o2;
		if(a1<a2) {
			return +1;
		}
		else if(a1>a2) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
