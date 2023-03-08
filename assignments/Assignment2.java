package com.assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Student Marks");
		int marks = scanner.nextInt();
		if(marks <35) {
			System.out.println("Student Fail");
		}
		else if(marks == 35)
			System.out.println("Student Just Pass With Border Marks");
		else if(marks>35 && marks<70 )
			System.out.println("Student Secured Third Class");
		else if(marks>70 && marks<85)
			System.out.println("Student Secured Second Class");
		else {
			System.out.println("Student Secured First Class");
		}
		
		scanner.close();
		

	}

}
