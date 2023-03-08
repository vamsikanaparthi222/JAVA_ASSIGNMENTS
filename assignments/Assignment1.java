package com.assignments;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		verify given number is even or odd
		System.out.println("Please Enter The Number:-");
		int as1 = scanner.nextInt();
		//System.out.println(as1%2);
		if(as1%2 == 0) {
			System.out.println("Given Number Is Even");
		}
		else {
			System.out.println("Given Number Is Odd");
		}
		
		
		scanner.close();
		
	}

}
