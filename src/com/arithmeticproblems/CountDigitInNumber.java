package com.arithmeticproblems;

import java.util.Scanner;

/* 
 * Count digits in a given number.
 */

public class CountDigitInNumber {

	// Function to count digit
	static int CountDigit(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int num = scanner.nextInt();

		// Calling the function
		int count = CountDigit(num);

		// Printing the count
		System.out.println("Count of digit in given number is :: " + count);

		scanner.close();
	}

}