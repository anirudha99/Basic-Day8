package com.basicprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void flipCoinMethod() {
		double heads = 0.0;
		double tails = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the times the coin flipped:");
		int n=sc.nextInt();
		sc.close();
		
		if(n<0) {
			System.out.println("Enter n value greater than 0");
			System.exit(0);
		}
		
		Random random = new Random();
		
		for(int i=0;i<n;i++) {
			float res = random.nextFloat();
			if(res < 0.5)
				tails++;
			else
				heads++;
			
		}
		double headperc = (heads/n)*100;
		double tailperc = (tails/n)*100;
		
		System.out.println("Percentage of heads : "+headperc+"%");
		System.out.println("Percentage of tails : "+tailperc+"%");
	}

}
