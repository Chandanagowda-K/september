package com.sonata.question1;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m=new Manager(1,"ram",50000d);
		Developer d=new Developer(2,"sita",75000d);
		Tester t=new Tester(3,"chandu",30000d);
		m.display();
		m.salCal();
		d.display();
		d.salCal();
		t.display();
		t.salCal();
	}

}