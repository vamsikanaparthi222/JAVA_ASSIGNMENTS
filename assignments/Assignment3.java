package com.assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Day");
		
		String day = scanner.nextLine();
		if(day.equals( "Monday")|| 
				day.equals ("Tuesday")|| 
				day .equals("Wednesday") || 
				day .equals("Thursday") || 
				day .equals("Friday"))
			System.out.println("Uff, It's a Weekday");
		
		else if(day .equals("Saturday") || day .equals("Sunday"))
			System.out.println("Yaa , It's a Weekend");
		

	}

}
