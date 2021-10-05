package com.sonata.Employee;

public class UsingPeople {

public static void main(String[] args) 
{
	Address a1 = new Address(10,"vn street","bengaluru",560072);
	
	
	//int empID, String empName, Address address,double basicPay, double noOfLeaves;
	TechnicalEmployee t1 = new TechnicalEmployee(01,"Ram","Bengaluru",500000,10);
	StaffEmployee s1 = new StaffEmployee(02,"Raj","Bengaluru",30000,3);

	System.out.println(t1.basic() + t1.hra());
	System.out.println(s1.basic() + s1.hra());
	
}
}