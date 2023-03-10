package com.assignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		print 1 to 10
		System.out.println("Please enter starting number");
		int i = scanner.nextInt();
		
		System.out.println("Please enter ending number");
		int j = scanner.nextInt();
		
		while (i<j) {
			System.out.println(i);
			i++;
		}
		
		scanner.close();

	}

}
