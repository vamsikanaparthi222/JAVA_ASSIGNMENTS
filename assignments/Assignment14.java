package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
//		 print sum of integers in an integer Array
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("please enter the array size: ");
		//int arraySize =scanner.nextInt();
		//int[] arr = new int[arraySize];
		//System.out.println("please enter the array values: ");
		//for(int i =0 ;i<arraySize;i++) {
			//arr[i] = scanner.nextInt();
			
		//}
		
		//System.out.println("input"+Arrays.toString(arr));
		//int sum =0;
		//for(int i =0; i<arr.length;i++) {
			//sum += arr[i];
		//}
		//System.out.println("output: "+sum);
		//scanner.close();
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the array size");
		int arraySize =scanner.nextInt();
		
		int[] arr = new int[arraySize]; //array 
		System.out.println("please enter the array values");
		//we don't have use scanners then use loops
		//in this case i use the for loop
		
		for(int i=0;i<arraySize;i++) {
			arr[i]=scanner.nextInt();
		}
		
		
		System.out.println("input:"+Arrays.toString(arr));
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		
		System.out.println("output"+sum);
		
		scanner.close();
	}

}
