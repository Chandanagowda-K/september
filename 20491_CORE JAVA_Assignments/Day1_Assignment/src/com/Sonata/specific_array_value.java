package com.Sonata;

public class specific_array_value {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		int toTest = 3;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toTest) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toTest + ".Yes it contains a specific value.");
	    else
	      System.out.println(toTest + " No it does not contains a specific value");

	}

}
