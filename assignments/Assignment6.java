package com.assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter Target Operation");
		String operation = scanner.next();
		int result = 0;
		switch(operation) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		case "%":
			result = num1%num2;
			break;
		default :
			System.err.println("Invalid Operation");
			break;
		}
		System.out.println(result);
		scanner.close();

	}

}
