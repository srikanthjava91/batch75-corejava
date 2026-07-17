package com.languagefundamentals_1.methods;

//1) No return type + no arguments 
public class TestMethodsDemo2 {

	// in instance can we call instance methods ..?
	// in instance can we call static methods ..?
	void main() {
		System.out.println("main method started ");
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
		System.out.println("main method ended ");
	}

	void addition() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(sum);
	}

	static void subtraction() {
		int a = 100;
		int b = 200;
		int diff = a - b;
		System.out.println(diff);
	}

	void multiplication() {
		int a = 98;
		int b = 87;
		System.out.println(a * b);
	}

	void division() {
		int a = 97;
		int b = 4;
		System.out.println(a / b);// quotient --> 24
	}

	void modulus() {
		int x = 59;
		int y = 4;
		System.out.println(x % y);// Reminder --> 3
	}

	{
		System.out.println("Hello instance !!");
	}

}
