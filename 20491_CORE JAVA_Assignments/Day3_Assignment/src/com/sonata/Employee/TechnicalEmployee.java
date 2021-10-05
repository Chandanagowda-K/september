package com.sonata.Employee;

public class TechnicalEmployee extends Employee {
	
	String technicalSkill;
	public TechnicalEmployee(int empID, String empName, Address address,double basicPay, double noOfLeaves) {
		super(empID,empName,address,basicPay,noOfLeaves);
		this.technicalSkill = technicalSkill;
	}
    
	public double hra() {
		return super.basic() * 12/100;
	}
	
	@Override
	public String toString() {
		return "TechnicalEmployee [empID=" +empID+ ", empName =" +empName+ ", address=" +address+ ",basicPay=" +basicPay+", noOfLeaves=" +noOfLeaves+"]";
	}
}
