package com.languagefundamentals_1;

public class TestLiteralsDemo3 {

	public static void main(String[] args) {

		String s = null;
//		The local variable s may not have been initialized
		System.out.println(s);

		boolean status = false;
		if (status) {
			System.out.println("Good morning ");
		}

		char c1 = 'A';// SIngle quote
		char c2 = 100;// ASCII
		char c3 = '\u0040';// UNI-code or Hex
		char c4 = 5776;// ASCII more than 127 values will consider as Junk characters

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
