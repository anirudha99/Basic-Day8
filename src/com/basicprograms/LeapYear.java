package com.basicprograms;

import java.util.Scanner;

public class LeapYear {
	public static void leapYearMethod() {
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if(year<1000 && year>9999) {
			System.out.println("Enter the four digit number");
			System.exit(0);
		}
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not leap year");
		
	}

}
