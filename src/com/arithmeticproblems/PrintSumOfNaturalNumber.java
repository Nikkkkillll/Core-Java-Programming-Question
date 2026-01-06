package com.arithmeticproblems;

public class PrintSumOfNaturalNumber {

	static int printSumOfNaturalNumber(int num) {
		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = printSumOfNaturalNumber(10);
		System.out.println("Sum Of Natural Number is :: "+ sum);
	}

}
