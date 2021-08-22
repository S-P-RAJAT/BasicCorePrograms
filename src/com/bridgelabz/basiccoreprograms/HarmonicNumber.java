package com.bridgelabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		double nthHarmonic = 0;
		int N = 5;
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				nthHarmonic += 1.0/i;
			}
			System.out.println("nth Harmonic value = "+nthHarmonic);
		} else {
			System.out.println("Please enter values greater than zero!");

		}
	}
}
