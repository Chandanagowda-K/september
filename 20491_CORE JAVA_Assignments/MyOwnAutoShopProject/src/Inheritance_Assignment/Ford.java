package Inheritance_Assignment;

public class Ford extends Car {

    int year;
    int manufacturerDiscount;
    int cost;
Ford(){}
 Ford( int s,double r, String c) {
 super(s,(int) r,c);
 }
 public void getSalePrice() {
	 System.out.println(year);
 }
 public void display() {
	 System.out.println(year);
	 
 }
}