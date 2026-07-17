package com.languagefundamentals_1;

class Student {
	String name = "Srikanth";
	int sid = 123;
	
}

class Dog{
	
}

public class TestDataTypesDemo3 {
	Student s2;
	Dog d;

	public static void main(String[] args) {
		
		TestDataTypesDemo3 t = new TestDataTypesDemo3();
		
		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.sid);
		
		System.out.println("*************************");
		System.out.println(t.s2);//null
		System.out.println(t.d);//null
	}
}
