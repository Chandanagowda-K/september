package com.Sonata;
import java.util.*;

public class replacing_ovals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String str=s;
	for(int i=0;i<s.length();i++)	
	{
		char c=s.charAt(i);
		if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			String front =s.substring(0,i);
			String back=s.substring(i+1);
			s=front+ "$" +back;
		}
	}
	System.out.println(str);
	System.out.println(s);

	}

}
