package com.arithmeticproblems;

import java.util.Scanner;

/*
 * Find the sum of digits of a number.
 */
public class SumOfDigitOfNumber {

	// Function for sum of digit
	static int sumOfDigit(int num) {

		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int num = scanner.nextInt();

		// Calling the function
		int sumOfDigit = sumOfDigit(num);

		// Printing the reverse number
		System.out.println("Sum of digit is :: " + sumOfDigit);

		scanner.close();
	}

}