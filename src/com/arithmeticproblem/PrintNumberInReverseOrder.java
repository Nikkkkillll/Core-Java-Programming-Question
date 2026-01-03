package com.arithmeticproblem;

import java.util.Scanner;

public class PrintNumberInReverseOrder {

	static void printNumber(int num) {
		for (int i = num; i >= 0; i--) {
			System.out.print(" " + i);
		}
	}

	public static void main(String[] args) {
		printNumber(10);
	}

}