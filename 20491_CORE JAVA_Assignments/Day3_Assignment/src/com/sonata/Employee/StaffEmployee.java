package com.sonata.Employee;

public class StaffEmployee extends Employee{
	
	String title;
	
	public StaffEmployee(int empID, String empName, Address address,
			double basicPay, double noOfLeaves) {
		super(empID,empName,address,basicPay,noOfLeaves);
		this.title = title;
	}

	public double hra() {
		return super.basic() *18/100;
	}
	
@Override
public String toString() {
return "TechnicalEmployee [empID=" +empID+ ", empName =" +empName+ ", address=" +address+ ",basicPay=" +basicPay+", noOfLeaves=" +noOfLeaves+"]";
			
	}
}

