package com.languagefundamentals_1.methods;

//2) No Return type + With arguments 
public class TestMethodsDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");

//		Calling no argument method
		show();

//		Call by value 
		show("Reema");
		show("Lakshmi");
		show("Sravani");

		System.out.println("main method ended ");
	}

	void show() {
		System.out.println("Good morning Students ");
	}

	void show(String name) {
		System.out.println("Name of the Student is : " + name);
	}

}
