package com.arithmeticproblem;

public class PrintEvenNumber {

	static void printEvenNumber(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {
		printEvenNumber(10);
	}

}
