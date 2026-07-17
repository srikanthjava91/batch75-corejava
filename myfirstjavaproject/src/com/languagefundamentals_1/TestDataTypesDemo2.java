package com.languagefundamentals_1;

import java.math.BigInteger;
import java.math.BigDecimal;

public class TestDataTypesDemo2 {

//	Auto-Boxing : Converting "Primitive Data Types to Wrapper Object data Types"
//	Integer i1 = Integer.valueOf(10);
	Integer i = 10;// int to Integer conversion --> Auto-Boxing
	Character c = 'A';// char to Character

//	String : Storing a collection of characters into a single variable using double quotes.
	String s = "Vcube";// String Literal

	// Type mismatch: cannot convert from String to StringBuffer
//	StringBuffer sb1 = "Java";
	StringBuffer sb1 = new StringBuffer("Java");
	StringBuilder sb2 = new StringBuilder("Srikanth");

//	BigInteger bi1 = 10;//Type mismatch: cannot convert from int to BigInteger

	BigInteger bi1 = new BigInteger("854678907654325678976543256789654356");
	BigInteger bi2 = new BigInteger("854678907654325678976543256789654356");

	BigDecimal bd1 = new BigDecimal("87654324987087543245678.87654324567890754");
	BigDecimal bd2 = new BigDecimal("87654324987087543245678.87654324567890754");

	public static void main(String[] args) {
		System.out.println("main method started ");
//		== Operator Checks the Addresses of the Object

//		The Data Range will be -128 to 127 only for Wrapper Caching 
//		If we use below 127 numbers will use same address, 
//		So i2 == i3 is returning true.

		Integer i2 = 100;
		Integer i3 = 100;
		System.out.println(i2 == i3);// true

//		200 is more than 127, So here its taking for two value two different addresses 
//		So i4==i5 will return false
		Integer i4 = 200;
		Integer i5 = 200;
		System.out.println(i4 == i5);// false

		TestDataTypesDemo2 t1 = new TestDataTypesDemo2();

		t1.i = 100;

//		AutoUnboxing : Wrapper Object Data Type --> Primitive Data Types
//		int a = t1.i.intValue(); --> xxxValue();
		int a = t1.i;

		System.out.println(t1.i);// null
		System.out.println(t1.c);// null

		System.out.println(t1.s);// null
		System.out.println(t1.sb1);// null
		System.out.println(t1.sb2);// null

		System.out.println(t1.bi1);// null
		System.out.println(t1.bd1);// null

		// The operator + is undefined for the argument type(s)
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t1.bi1 + t1.bi2);
		System.out.println(t1.bi1.multiply(t1.bi2));

		System.out.println(t1.bd1.add(t1.bd2));

		System.out.println("main method ended ");
	}

}
