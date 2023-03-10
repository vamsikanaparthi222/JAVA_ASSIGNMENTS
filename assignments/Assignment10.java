package com.assignments;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		print numbers divisible by 7
		System.out.println("starting");
		int i = scanner.nextInt();
		
		System.out.println("ending");
		int j = scanner.nextInt();
		
		int k = i;
		while(k<=j) {
			if(k%7 == 0)
			System.out.println(k);
			k++;
			
		}
		
		scanner.close();

	}

}
