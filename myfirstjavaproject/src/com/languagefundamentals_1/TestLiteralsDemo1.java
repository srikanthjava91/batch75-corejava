package com.languagefundamentals_1;

//Integral Literals 
//i)Decimal Literals 	--> 0 to 9 --> base is 10 
//ii)Octal Literals 		--> 0 to 7 --> base is 8 
//iii)HexaDecimal Literals --> 0 to 9 & a-f/A-F --> base is 16 
//i)Binary Literals 	--> 0 & 1 --> base 2
public class TestLiteralsDemo1 extends Object {

	public static void main(String[] args) {

		TestLiteralsDemo1 t1 = new TestLiteralsDemo1();
		System.out.println(t1);// Address of the Object --> 2b2fa4f7
		System.out.println(t1.hashCode());// 724542711

		int a = 0x2b2fa4f7;
		System.out.println(a);// 724542711

//		Decimal Literals 
		int a1 = 123;
		int a2 = 789;

//		Octal Literals, Any numbers starts with 0 will consider as Octal 
//		0 +1*8^2 +2*8^1 +3*8^0 = 64 + 16 + 3 = 83
		int a3 = 0123;
		int a4 = 0456;// 302
		int a5 = 0765;// 501
//		int a6 = 0876;//574 //The literal 0876 of type int is out of range 

//		Hexa-Decimal Literals, Any number starts with 0x will consider as Hexa-Decimal 
//		a/A=10, b/B=11, c/C=12, d/D=13, e/E=14, f/F=15 

//		1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291
		int a6 = 0x123;
		int a7 = 0x456;
		int a8 = 0x567;
		int a9 = 0xa1b2;//
		int a10 = 0xfaa;// 4010
		int a11 = 0XDAD;// 3501
		int a12 = 0XBeE;// 3054
//		int a13 = 0xbeer;//Syntax error on token "r", delete this token

//		1*2^3 +0*2^2 +1*2^1 +0*2^0 = 8 + 0 + 2 + 0 = 10 
		int a14 = 0b1010;

		int a15 = 0b1101;
		int a16 = 0B1111;
		int a17 = 0B00001;

		System.out.println(a1);// 123
		System.out.println(a2);// 789
		System.out.println(a3);// 0123 123 83

		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);

		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);

		System.out.println(a14);
		System.out.println(a15);
		System.out.println(a16);
		System.out.println(a17);

	}

}
