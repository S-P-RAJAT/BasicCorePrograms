package com.bridgelabz.basiccoreprograms;

public class FindLargest {
	public static void main(String[] args) {
		int a = 30, b = 43, c = 127;
		if (a > b) {
			if (a > c) {
				System.out.println("a = " + a + " is greater");
			} else {
				System.out.println("c = " + c + " is greater");
			}
		} else {
			if (b > c) {
				System.out.println("b = " + b + " is greater");
			} else {
				System.out.println("c = " + c + " is greater");
			}
		}
	}
}
