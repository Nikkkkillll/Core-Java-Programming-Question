package com.patternquestions;

import java.util.Scanner;

/*
 * 
 * Print a right-angled triangle of *.
 * 
 * */
public class PrintRightAngle {

	static void starRightAngleTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int num = scanner.nextInt();
		starRightAngleTriangle(num);
		scanner.close();
	}
}
