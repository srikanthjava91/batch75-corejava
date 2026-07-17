package com.languagefundamentals_1;

public class Student1 {

//	instance + Primitive variable
	int id1 = 10;

//	instance + Object variable
	String name1 = "Srikanth";

//	static + Primitive variable 
	static int instId = 555;

//	static + Object variable 
	static String instName = "Vcube";

	public static void main(String[] args) {

		System.out.println("main method started ");
		
		Student1 s1 = new Student1();
		
		System.out.println("********Accessing static data directly **********");
		System.out.println(instId);
		System.out.println(instName);

		System.out.println("********Accessing static data by using class name  **********");
		System.out.println(Student1.instId);
		System.out.println(Student1.instName);
		
		System.out.println("**** Accessing static data by using Object Reference  varibal  ******");
//		The static field Student1.instId should be accessed in a static way
		System.out.println(s1.instId);
		System.out.println(s1.instName);

		System.out.println("**** Accessing instance data by using Object reference variable *** ");
		System.out.println(s1.id1);
		System.out.println(s1.name1);
		
		System.out.println("---------------------------");
		Student1 s2 = null;
		System.out.println("**** Accessing static data by using Object Reference  varibal  ******");
//		The static field Student1.instId should be accessed in a static way
		System.out.println(s2.instId);
		System.out.println(s2.instName);
		
//		RE : Cannot read field "id1" because "s2" is null
		System.out.println(s2.id1);//NPE : NullPointerException
		System.out.println(s2.name1);//
		
		
		System.out.println("main method ended ");

	}

}
