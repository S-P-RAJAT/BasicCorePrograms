package com.bridgelabz.basiccoreprograms;

public class PowerOfTwo {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		if (0 <= N && N < 31) {
			for (int i = 0; i <= N; i++) {
				int value = (int)Math.pow(2, i);
				System.out.print(value);
				if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0) {
					System.out.println("\t - Leap year");
				} else {
					System.out.println("\t - Not a leap year");
				}
			}
		} else {
			System.out.println("Please enter any value between 0 and 30");

		}

	}
}
