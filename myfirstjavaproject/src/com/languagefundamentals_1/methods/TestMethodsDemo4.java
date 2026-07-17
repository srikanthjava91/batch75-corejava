package com.languagefundamentals_1.methods;

//2) No Return type + With arguments 
public class TestMethodsDemo4 {

	double balance = 10000.00;

	void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome To Vcube Banking !");
		checkBalance();
		deposite(5000);
		withdraw(2000);
		System.out.println("main method ended ");
	}

	void checkBalance() {
		System.out.println("The Current balanace is : " + balance);
	}

	void deposite(double amount) {
		System.out.println("Deposite method called ");
		balance += amount;
		checkBalance();
	}

	void withdraw(double amount) {
		System.out.println("Withdraw method called ");

		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Your Transaction cancelled. Due to Insuffient funds !");
		}

		checkBalance();
	}

}
