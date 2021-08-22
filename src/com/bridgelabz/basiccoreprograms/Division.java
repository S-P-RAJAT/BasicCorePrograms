package com.bridgelabz.basiccoreprograms;

public class Division {
	public static void main(String[] args) {
		int dividend = 28, divisor = 3, quotient, remainder;
		quotient = dividend / divisor;
		remainder = dividend - (divisor * quotient);
		System.out.println("Dividend: " + dividend);
		System.out.println("Divisor: " + divisor);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
}
