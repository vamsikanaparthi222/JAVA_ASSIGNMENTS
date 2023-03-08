package com.assignments;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The Number:-");
		int number = scanner.nextInt();
		int remainder = number%2;
		switch(remainder) {
		case 0:
			System.out.println("Given Number Is even");
			break;
			
		case 1:
			System.out.println("Given Number Is odd");
			break;
		}
		scanner.close();
		
		

	}

}
