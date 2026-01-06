package com.arithmeticproblems;

import java.util.Scanner;


public class PrintMultiple {

	static void printMultiple(int num) {
		for (int i = 1; i <= 10; i++) {

			System.out.print(" " + i * num);

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number for Mathamatical Tables :: ");
		int num = scanner.nextInt();

		printMultiple(num);
		
		scanner.close();
	}

}
