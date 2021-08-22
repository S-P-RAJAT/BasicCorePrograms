package com.bridgelabz.basiccoreprograms;


public class FlipCoin {

	public static void main(String[] args) {
		int numberOfFlips = 10;
		if (numberOfFlips <= 0) {
			System.out.println("Please enter a positive integer value of number of flips!");
		} else {
			int numberOfHeads = 0;
			for (int i = 0; i < numberOfFlips; i++) {
				double value = Math.random();
				if(value<0.5)
					numberOfHeads++;
			}
			System.out.println("Number of heads:" + numberOfHeads*100.0/numberOfFlips);
			System.out.println("Number of tails:" +(numberOfFlips - numberOfHeads)*100.0/numberOfFlips);
		}
	}

}
