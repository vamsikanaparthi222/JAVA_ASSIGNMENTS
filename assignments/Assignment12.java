package com.assignments;

import java.util.Scanner;

public class Assignment12 {
//	print 1 to 100 values
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter starting numbers");
		int i = scanner.nextInt();
		System.out.println("enter ending number");
		int j = scanner.nextInt();
		
		for(i= 1;i<j;i++) {
			System.out.println(i);
		}
		scanner.close();

	}

}
