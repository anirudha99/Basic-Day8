package com.functional;

import java.util.Scanner;

public class SumZero {
	public static void triplets() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
		int num = scan.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the  array elements: ");
		for(int i=0;i<num;i++) {
			array[i] = scan.nextInt();
		}
		sum(num,array);
		scan.close();
		
	}
	public static void sum(int n,int a[]) {
		boolean flag = false;
		int count = 0;
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(a[i]+a[j]+a[k]==0) {
						count++;
						System.out.println("Triplets are ("+a[i]+","+a[j]+","+a[k]+")");
						flag = true;
					}	
				}
			}
		}
		
		if(flag==false) {
			System.out.println("No triplets found");
		}
		System.out.println("No. of triplet pairs : "+count);
	}

}
