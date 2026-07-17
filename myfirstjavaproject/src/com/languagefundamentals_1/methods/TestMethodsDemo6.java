package com.languagefundamentals_1.methods;

import java.util.Scanner;

//3) With return type + No arguments 
//Create methods for get Salary and get Bonus from different methods, 
//calculate these two values in main method..

public class TestMethodsDemo6 {

	Scanner sc = new Scanner(System.in);

	double getSalary() {
		int sal = 0;
		System.out.println("Enter your salary : ");
		sal = sc.nextInt();// 500000.00
		return sal;
	}

	double getBonus() {
		double bonus = 0;
		System.out.println("Enter your Bonus : ");
		bonus = sc.nextDouble();// 5000.00
		return bonus;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestMethodsDemo6 t = new TestMethodsDemo6();
		double b = t.getBonus();
		double s = t.getSalary();

		System.out.println("Total Salary of the Employee : " + (b + s));

	}

}
