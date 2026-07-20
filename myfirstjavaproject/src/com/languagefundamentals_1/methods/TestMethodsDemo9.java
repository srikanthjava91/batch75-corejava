package com.languagefundamentals_1.methods;

class Student {
	int sid;
	String name;
	int age;
	String city;

}

public class TestMethodsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Student s = getStudentInfo();
		printStudentInfo(s);

		System.out.println("main method ended ");
	}

	static void printStudentInfo(Student s) {
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.city);
	}

	// Factory method
	static Student getStudentInfo() {
		Student s = new Student();
		s.sid = 45;
		s.name = "Rohit";
		s.age = 38;
		s.city = "Mumbai";

		return s;
	}

}
