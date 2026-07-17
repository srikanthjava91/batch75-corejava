package com.languagefundamentals_1;

public class Student2 {

	static int collegeId = 666;
	static String collegeName = "Vcube";

	public static void main(String[] args) {

//		int a;
//		CE : The local variable a may not have been initialized
//		JVM does not provide default values for local variables, 
//		we must need to initialize.
//		System.out.println(a);

//		CE : Illegal modifier for parameter a; only final is permitted
//		static int a = 10;

//		local + primitive 
		int a = 100;
		System.out.println(a);

		int collegeId = 777;
		String collegeName = "VSS";

		System.out.println(collegeId);
		System.out.println(collegeName);

		System.out.println(Student2.collegeId);
		System.out.println(Student2.collegeName);

		System.out.println(Student1.instId);
		System.out.println(Student1.instName);

	}

}
