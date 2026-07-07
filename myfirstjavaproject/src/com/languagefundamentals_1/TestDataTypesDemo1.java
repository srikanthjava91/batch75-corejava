package com.languagefundamentals_1;

//Primitive Data Types 
// byte --> short --> int --> long --> float --> double 
public class TestDataTypesDemo1 {

//	instance variables 
	byte b = 127;
	byte b1 = -128;

//	By default RHS numbers are int type.
//	-128 -127 -126 -125 ------0 1 2 3 4 ----- 125 126 127 
//	Type Casting : Converting one data type values to another data type will consider as Type Casting.
//	The Below Conversion is Consider as Explicit Type casting.
//	Explicit Type casting : Converting Big data type value to Low Data Types value. ex: int --> byte 
//	 byte = (byte) int; 
	byte b2 = (byte) 258;// Type mismatch: cannot convert from int to byte

//	-32768 to 32767 
	short s = 32767;// 2 bytes = 16 bits : -2^15 to (2^15)-1
	short s1 = (short) 32768;// Type mismatch: cannot convert from int to short

	int i = 2147483647;// 4 bytes = 32 bits : -2^31 to (2^31)-1
//	int i1 = 2147483648;//The literal 2147483648 of type int is out of range 
	int i2 = (int) 2147483648L;// Type mismatch: cannot convert from long to int
//	
	long l = 9223372036854775807L;// 8 bytes = 64 bits : -2^63 to (2^63)-1

	float f = 55;// int --> float //IMplcit Type Casting --> 55.0
//	float f1 = 55.5;//By default RHS decimal values are double, So we will get below CE.
//	Type mismatch: cannot convert from double to float

	float f2 = 55.5F;// 0.0 --> 55.5 --> 4 bytes --> 5 to 6 Decimal points
	float f3 = 57.89676465354675876764563543F;
	float f4 = 9223372036854775807897556354587987545F;
	double d = 57.89676465354675876764563543D;

//	32768 + 32767 = 65535 
//	2 bytes = 16 bits --> 0 to 65535 
	char c = 'A';// Single quote char
//	int --> char --> int : Implcit Type casting 
	char c1 = 75;// ASCII code 65=A 66=B 67 =C...90 =Z
//	97=a 98=b 99=c 100=d ..... 122=z
	char c2 = '\u0020';// Hex char or Unicode values

	int i4 = 'a';

	boolean boo = true;
	
//	boolean boo1 = 0;
//	boolean boo2 = 1;
	
//  boolean boo3 = TRUE;
//	boolean boo4 = False;
	
//	boolean boo5 = False;
//	boolean boo6 =  True;
	
// 	boolean boo7 = "true";
//	boolean boo8 = "false";
	
	
	public static void main(String[] args) {

		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value :" + t1.b);// 0
		System.out.println("byte value :" + t1.b1);// 0
		System.out.println("byte value :" + t1.b2);// 0 -128

		System.out.println("short value : " + t1.s);// 0
		System.out.println("int value : " + t1.i);// 0

		System.out.println("long value : " + t1.l);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("float value : " + t1.f2);// 0.0
		System.out.println("float value : " + t1.f3);// 0.0
		System.out.println("float value : " + t1.f4);// 0.0

		System.out.println("double value : " + t1.d);// 0.0

		System.out.println("char value : " + t1.c);//
		System.out.println("char value : " + t1.c1);//
		System.out.println("char value : " + t1.c2);//
		System.out.println("int value : " + t1.i4);// 0

		System.out.println("boolean value : " + t1.boo);// false
		
		if(t1.boo) {
			System.out.println("Good morning Have a nice day ");
		}

	}

}
