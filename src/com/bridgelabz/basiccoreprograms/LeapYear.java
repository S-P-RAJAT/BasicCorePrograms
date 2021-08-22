package com.bridgelabz.basiccoreprograms;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1984;
		if(Integer.toString(year).length()!=4) {
			System.out.println("Please enter the year in format(YYYY)!");
		} else {
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println("It is a leap year");
			}else {
			System.out.println("It is not a leap year");
			}
		}
	}
}
