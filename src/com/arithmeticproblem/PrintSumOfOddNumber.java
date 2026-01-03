package com.arithmeticproblem;

public class PrintSumOfOddNumber {

	static int printSumOfOddNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = printSumOfOddNumber(10);
		System.out.println("Sum Of Odd Number is :: " + sum);
	}

}
