package com.assignments;

//FIND THE MAX NUMBER FROM AN ARRAY AND PRINT IT ALONG WITH IT'S INDEX 
import java.util.Arrays;
import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please Enter The Array Size: ");
		int arrSize =scanner.nextInt();
		
		int[] arr =new int[arrSize];
		
		System.out.println("Please Enter The Array Values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Input: "+Arrays.toString(arr));
		
		int largestNumber=arr[0];
		int largestNumberIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(largestNumber<arr[i]) {
				largestNumber=arr[i];
				largestNumberIndex=i;
			}
		}
		System.out.println("LargestNumber: "+largestNumber);
		System.out.println("LargestNumberIndex: "+largestNumberIndex);
		
		scanner.close();

	}

}
