package com.assignments;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		print even numbers b/w to 200 to 500
		System.out.println("starting");
		int i = scanner.nextInt();
		
		System.out.println("ending");
		int j = scanner.nextInt();
		
		int k = i;
		while(k<=j) {
			if(k%2 == 0)
			System.out.println(k);
			k++;
			
		}
		
		scanner.close();

	}

}
