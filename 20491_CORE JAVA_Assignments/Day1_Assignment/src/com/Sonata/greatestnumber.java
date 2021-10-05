package com.Sonata;

public class greatestnumber {

	public static void main(String[] args) {
		double n1 = 12, n2 = 25, n3 = 89;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the greatest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the greatest number.");

        else
            System.out.println(n3 + " is the greatest number.");
  }
}