package com.sonata.Interface;

import java.lang.Math.*;

public class Square extends Shapes{
	
	Square(){}
	Square(int length ,int height,int width) {
		
		super(length,height,width);
	}
	
	public double Radious(int length,int height) {
		double k=(1/2)*height;
		double h=(k*k)*2;
		System.out.println("Radius="+h);
		return 0;
	}

	public static void main(String[] args) {
    
		Square s1=new Square();
		s1.Radious(10,20);

	}

}
