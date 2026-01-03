package com.arithmeticproblem;

public class PrintOddNumber {

	static void printOddNumber(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {
		printOddNumber(10);
	}

}
