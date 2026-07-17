package com.languagefundamentals_1.methods;

import java.util.Scanner;

//2) No Return type + With arguments --> Scanner 
public class TestMethodsDemo5 {

	void getFullName(String fname, String lname) {
		System.out.println("Employee Full Name  :" + fname + " " + lname);
	}

	void getAge(int age) {
		System.out.println("Age of The Employee : " + age);
	}

	void salaryInfo(double salary) {
		System.out.println("EMployee Salary is : " + salary);
	}

	void heightAndWeightInfo(float height, double weight) {
		System.out.println("Employee Height : " + height);
		System.out.println("Employee Weight : " + weight);
	}

	void genderInfo(char c) {
		System.out.println("Gender is : " + c);
	}

	void main() {
		System.out.println("main method started ");

		String s = new String();
		TestMethodsDemo5 t = new TestMethodsDemo5();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
//		Reading the element from Scanner 
		int age = sc.nextInt();

		System.out.println("Enter your First Name : ");
		sc.nextLine();
		String firstName = sc.nextLine();

		System.out.println("Enter your Lastname : ");
		String lastName = sc.next();

		System.out.println("Enter your salary info : ");
		double sal = sc.nextDouble();

		System.out.println("ENter your height : ");
		float h = sc.nextFloat();

		System.out.println("Enter your Weight  : ");
		double w = sc.nextDouble();

		System.out.println("Enter your Gender : ");
		char c = sc.next().charAt(0);// Method Chaining

//		Calling all methods 
		getFullName(firstName, lastName);
		getAge(age);
		salaryInfo(sal);
		heightAndWeightInfo(h, w);
		genderInfo(c);

		System.out.println("main method ended ");

	}

}
