package Inheritance_Assignment;

public class Car {
	int speed; 
	double regularPrice; 
	String color; 
	static {
		System.out.println("Show static block");
	}

	 Car(){}
	 Car(double regularPrice, int speed, String color) {
		 this.regularPrice = regularPrice;
			this.speed = speed;
			this.color = color;
	 }

	public void getSalePrice() {
	  System.out.println(regularPrice);
	}

	public void display()
	{
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
	}
	
}
