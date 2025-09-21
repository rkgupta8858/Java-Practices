package com.rahul.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Practice 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private Integer empId;
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private String empName;
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Double empSal;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	
}
