package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		// print average of the integers in integer array
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Please Enter The ArraySize");
		int arraySize =scanner.nextInt();
		
		int[] arr = new int[arraySize];

		System.out.println("Please Enter The Array Values");
		for(int i=0;i<arraySize;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("input"+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("output: "+sum/arr.length);
		
		scanner.close();
		

	}

}
