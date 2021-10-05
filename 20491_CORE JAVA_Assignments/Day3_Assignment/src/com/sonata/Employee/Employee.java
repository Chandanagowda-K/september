package com.sonata.Employee;

public class Employee {
int empID;
String empName;
Address address;
double basicPay;
double noOfLeaves;

public Employee(int empID, String empName, Address address,double basicPay, double noOfLeaves) {
this.empID = empID;
this.empName = empName;
this.address = address;
this.basicPay = basicPay;
this.noOfLeaves = noOfLeaves;
}

public double basic() {
	return basicPay;
}
}