package com.arithmeticproblem;

/*
 * Print Even Number
 * 
 */
public class PrintEvenNumber {

	// Function to print even number
	static void printEvenNumber(int num) {

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {

		// Calling function
		printEvenNumber(10);
	}

}
