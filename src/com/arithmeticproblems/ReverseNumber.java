package com.arithmeticproblems;

import java.util.Scanner;

public class ReverseNumber {

	/*
	 * Reverse a given number.
	 */

	// Function for reverse number
	static int reverseNumber(int num) {

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		return rev;
	}

	public static void main(String[] args) {
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int num = scanner.nextInt();

		// Calling the function
		int reverseNumber = reverseNumber(num);

		// Printing the reverse number
		System.out.println("Count of digit in given number is :: " + reverseNumber);
		
		scanner.close();
	}

}