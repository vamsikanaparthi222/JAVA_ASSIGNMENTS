package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

//REVERSE THE ARRAY AND PRINT IT IN CONSOLE
public class Assignment18 {

	public static void main(String[] args) {
		 
			Scanner scanner =new Scanner(System.in);
			System.out.println("Please Enter The Array Size: ");
			int arrSize =scanner.nextInt();
			
			boolean[] arr =new boolean[arrSize];
			
			System.out.println("Please Enter The Array Values");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scanner.nextBoolean();
			}
			
			System.out.println("Input: "+Arrays.toString(arr));
			Boolean[] revArr= new Boolean[arr.length];
			for(int i=0;i<arr.length;i++) {
				revArr[arr.length-i -1]=arr[i];
			}
			System.out.println("Output: "+Arrays.toString(revArr));
			
			scanner.close();

	}

}
