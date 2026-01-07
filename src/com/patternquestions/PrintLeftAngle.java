package com.patternquestions;

import java.util.Scanner;

/*
 * 
 * Print a left-angled triangle of *.
 * 
 * */
public class PrintLeftAngle {

	static void starLeftAngleTraingle(int num) {
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
		starLeftAngleTraingle(num);

		scanner.close();
	}

}
