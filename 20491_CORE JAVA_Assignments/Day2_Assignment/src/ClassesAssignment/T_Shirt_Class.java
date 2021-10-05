package ClassesAssignment;

class T_Shirt{
	String color;
	String material; 
    String design;
}

public class T_Shirt_Class {
	
	public static void main(String[] args) {
		
	T_Shirt Small = new T_Shirt();
	T_Shirt Large = new T_Shirt();
	T_Shirt Extra_Large = new T_Shirt();
	
           Small.color ="Red";
           Small.material ="Cotton";
           Small.design ="V_neck";
           
           Large.color ="Blue";
           Large.material ="Nilon";
           Large.design ="O_neck";
           
           Extra_Large.color ="Green";
           Extra_Large.material ="Jersy";
           Extra_Large.design = "Polo";
           
           
           System.out.println(Small.color);
           System.out.println(Small.material);
           System.out.println(Small.design);
           
           System.out.println(Large.color);
           System.out.println(Large.material);
           System.out.println(Large.design);
           
           System.out.println(Extra_Large.color);
           System.out.println(Extra_Large.material);
           System.out.println(Extra_Large.design);
           }

}
