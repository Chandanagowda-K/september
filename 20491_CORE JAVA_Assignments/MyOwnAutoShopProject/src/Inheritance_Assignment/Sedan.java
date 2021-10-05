package Inheritance_Assignment;


	public class Sedan extends Car {
		
		 int length;
		double discount;
		Sedan(){}
		 Sedan( int s,double r, String c) {
		 super(s,(int) r,c);
		 }
public void getSalePrice(int length) {
	  if(length>20)
	  {
		  discount =(0.05)*regularPrice;
	  }
	  else
	  {
		  discount =(0.01)*regularPrice;
	  }
	  System.out.println("Discount"+discount);
      }
	}
		

