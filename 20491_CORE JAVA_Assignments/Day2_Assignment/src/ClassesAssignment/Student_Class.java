package ClassesAssignment;

class Student {
	String stdName;
	String stdId;
	String stdClass;
}
public class Student_Class {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		
		s1.stdName="RAM";
		s1.stdId="2021";
		s2.stdName="SITA";
		s2.stdId="2022";
		
		System.out.println(s1.stdName);
		System.out.println(s2.stdName);
		}
}