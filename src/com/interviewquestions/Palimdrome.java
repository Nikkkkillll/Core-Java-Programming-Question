package com.interviewquestions;

import java.util.Scanner;

public class Palimdrome {

	/*
	 * 
	 * Check if a number is palindrome (using loop).
	 */

	// Function to check palindrome
	static boolean checkPalindrome(int num) {

		int num1 = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + +num % 10;
			num = num / 10;
		}
		if (num1 == rev) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int num = scanner.nextInt();

		// Calling the function
		boolean value = checkPalindrome(num);

		// Printing the result
		if (value) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");

		}
		scanner.close();
	}

}