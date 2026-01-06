package com.patternquestions;

import java.util.Scanner;

/*
 * 
 * Print a right-angled triangle of *.
 * 
 * */
public class PrintRightAngle {

	static void startRightAngleTraingle(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int num = scanner.nextInt();
		startRightAngleTraingle(num);

		scanner.close();
	}

}
