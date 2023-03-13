package com.assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("ending number");
		int endingNumber = scanner.nextInt();
		
		for(int number=startingNumber;number<=endingNumber;startingNumber++) {
			if(number%2==0)
			System.out.println(number);
		}
		
		scanner.close();

	}

}
