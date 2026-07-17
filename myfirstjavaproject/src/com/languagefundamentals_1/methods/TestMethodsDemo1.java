package com.languagefundamentals_1.methods;

//1) No return type + no arguments 
public class TestMethodsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method startetd ");

//		 calling the method directly
		hello();

		TestMethodsDemo1 t = new TestMethodsDemo1();
//		 calling the method by using object reference variable
		t.show();
	}

	// instance method
	private void show() {
		System.out.println("show method called ");
	}

	// static method
	private static void hello() {
		System.out.println("Hello !! Good morning have a nice day !!");
	}

}
