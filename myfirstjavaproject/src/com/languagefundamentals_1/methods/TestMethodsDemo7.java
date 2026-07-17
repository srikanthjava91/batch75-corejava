package com.languagefundamentals_1.methods;

import java.util.Scanner;

public class TestMethodsDemo7 {

	Scanner sc = new Scanner(System.in);

	double getPrice() {
		double price = 0;
		System.out.println("The Product Price is : ");
		price = sc.nextDouble();
		return price;
	}

	int getQuantity() {
		System.out.println("The quantity is : ");
		return sc.nextInt();
	}

	void main(String[] args) {

		System.out.println("main method started ");
		double price = getPrice();
		int quantity = getQuantity();

		System.out.println("Total Price of all quanities : " + quantity * price);
	}

}
