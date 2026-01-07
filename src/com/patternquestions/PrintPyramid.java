package com.patternquestions;

/*
 * 
 * Print a pyramid pattern.
 * 
 * */
public class PrintPyramid {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
