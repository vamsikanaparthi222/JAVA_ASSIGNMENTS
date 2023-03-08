package com.assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the dayname");
		
		String dayName =scanner.next();
		
		
		
		switch(dayName) {
		
		case "monday":
			System.out.println("Uff, it's a weekday");
			break;
		case "tuesday":
			System.out.println("Uff, it's a weekday");
			break;
		case "wednesday":
			System.out.println("Uff, it's a weekday");
			break;
		case "thursday":
			System.out.println("Uff, it's a weekday");
			break;
		case "friday":
			System.out.println("Uff, it's a weekday");
			break;
		case "satday":
			System.out.println("Yaaa!, it's a weekend");
			break;
		case "sunday":
			System.out.println("Yaaa!, it's a weekend");
			break;
		default :
			System.err.println("check code");
		}
		
		scanner.close();

	}

}
