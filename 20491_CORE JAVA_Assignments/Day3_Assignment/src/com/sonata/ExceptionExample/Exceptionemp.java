package com.sonata.ExceptionExample;

public class Exceptionemp {

	public static void main(String[] args) throws MyException{
		int total = 50000;
		if(total<100000)
			throw new MyException("Not eligible to tax");
		else
			System.out.println("Welcome");
		}
}
