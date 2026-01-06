package com.arithmeticproblems;


public class PrintNumber {

	static void printNumber(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(" " + i);
		}
	}

	public static void main(String[] args) {
		printNumber(10);
	}

}