package com.languagefundamentals_1.methods;

import java.util.Scanner;

// WAP to find Areas of Rectangle, Triangle, Square, Circle.
//Rectangle : Length * breadth 
//Triangle : 0.5 * Base * Height 
//Square : side * side 
//CIrcle : PI  * r * r 
public class TestMethodDemo8 {

	double findAreaOfRectangle(double length, double breadth) {
		double arRec = length * breadth;
		return arRec;
	}

	double findAreaOfTriangle(float base, float height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}

	int findAreaOfSquare(double side) {
		double arSq = side * side;
		return (int) arSq;
	}

	double findAreaOfCircle(double radius) {
		double arCir = Math.PI * radius * radius;
		return arCir;
	}

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		double l = sc.nextDouble();

		System.out.println("Enter Breadth L ");
		double b = sc.nextDouble();

		double aRec = findAreaOfRectangle(l, b);
		System.out.println("Area of Reactangle is : " + aRec);
		System.out.println("******************************************");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double aCir = findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + aCir);

	}
}
