package com.languagefundamentals_1;

import java.util.Scanner;
import java.util.ArrayList;

//4 5 6 7 8 9  10 11 
 class TestIdentifiersDemo1 {

	private int id1 = 101;
		String name_1 = "Srikanth";
	public int $rupees;
	
//	var name = "Srikanth";//'var' is not allowed here
//	var gen = 'M';//'var' is not allowed here

	void method$_1() {
		System.out.println("Hello method1 ");
	}

	int addition() {
		var sum = 10 + 20;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Integer i = 10;
		var name = "Srikanth";
		var gen = 'M';
		
		
		
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true

		Scanner sc = new Scanner(System.in);

		TestIdentifiersDemo1 t = new TestIdentifiersDemo1();

		System.out.println(t.id1);
		System.out.println(t.name_1);

		t.method$_1();

		System.out.println("main method ended ");

	}

}
