package com.Sonata;

public class sum_of_array {

	public static void main(String[] args) {
		 int[] array = {5, 10, 15, 20, 25, 30};
	      int sum = 0;
	 
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum  values of an array elements is:"+sum);

	}

}
