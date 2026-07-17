package com.languagefundamentals_1;

//Note : If the Data is Primitive "==" operator always checks the values but not address.
//If values are same then will return true.

//If the Data is Object type "==" Operator always checks the addresses of the Objects but not the values.
//If we want to Check the values of String Objects we must need to use 
//.equals(String str) or .equalsIgnoreCase(String str) 

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 20;

		System.out.println(a == b);
		System.out.println(a == c);

		String s1 = "Srikanth";// String Literals --> 1 Object
		String s2 = new String("Java");// new Object --> 2 Objects

		String s3 = "Srikanth";// 0 objects
		String s4 = new String("Java");// 1 in Heap
		
		String s5 = "Java";//0 objects

		System.out.println(s1 == s3);//true
		System.out.println(s2 == s4);//false
		System.out.println("---------------------------");
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));

	}

}
