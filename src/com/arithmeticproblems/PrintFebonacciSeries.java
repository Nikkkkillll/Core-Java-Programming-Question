package com.arithmeticproblems;

public class PrintFebonacciSeries {

	static void printFebonaciSeries(int num) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(" " + num1);
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

	}

	public static void main(String[] args) {
		 printFebonaciSeries(10);
		
	}

}
