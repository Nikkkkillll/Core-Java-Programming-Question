package com.interviewquestions;

import java.util.Scanner;

public class ReverseString {
	static String reverseString(String string) {
		String s = string;
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String word = scanner.next();

		String res = reverseString(word);
		System.out.println("Reversed String is ::" + res);

		scanner.close();

	}

}
