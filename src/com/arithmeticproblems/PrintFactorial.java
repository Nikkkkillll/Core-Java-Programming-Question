package com.arithmeticproblems;

public class PrintFactorial {

	static int printFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int fact = printFactorial(3);
		System.out.println("Factorial Of Number is :: " + fact);
	}

}
