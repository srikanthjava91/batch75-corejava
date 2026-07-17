package com.languagefundamentals_1;

//Floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		
		double d1 = 10D;
		
		float f = 10;
		float f1 = 10F;
		float f2 = 123.5F;

		float f3 = 0123;
		float f4 = 0123.5F;
		float f5 = 0123F;

		float f6 = 0x123;
//		float f7 = 0x123.5F;//Invalid hex literal number
		float f8 = 0x123F;

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);

		System.out.println(f3);
		System.out.println(f4);// 123.5
		System.out.println(f5);// 123.0

		System.out.println(f6);
//		System.out.println(f7);
		System.out.println(f8);

	}

}
