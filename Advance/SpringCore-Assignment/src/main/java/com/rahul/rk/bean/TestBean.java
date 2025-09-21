package com.rahul.rk.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestBean implements Test{
	private int empId;
	private String empName;
	private Double empSal;
	private String[] colours;
	private List<String> name;
	private Set<String> hobbies;
	private Map<Integer, String> infor;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public void setColours(String[] colours) {
		this.colours = colours;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setInfor(Map<Integer, String> infor) {
		this.infor = infor;
	}
	@Override
	public String toString() {
		return "empId=" + empId + "\nempName=" + empName + "\nempSal=" + empSal + "\ncolours="
				+ Arrays.toString(colours) + "\nname=" + name + "\nhobbies=" + hobbies + "\ninfor : " + infor + "]";
	}
	
	
		
}
