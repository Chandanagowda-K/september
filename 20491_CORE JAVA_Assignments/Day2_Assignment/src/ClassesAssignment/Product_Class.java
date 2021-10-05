package ClassesAssignment;

class Product {
	String ProName;
	String ProId;
	String ProPrice;
}
public class  Product_Class {

	public static void main(String[] args) {
		Product p1= new Product();
		 
		p1.ProName="Pen";
		p1.ProId="11";
		p1.ProPrice="100+"+"GST";
		
	
		System.out.println(p1.ProName);
		System.out.println(p1.ProId);
		System.out.println(p1.ProPrice);
		}
}



	

	


