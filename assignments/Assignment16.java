package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

//MERGE TWO ARRAYS AND PRINT THE OUTPUT IN THE CONSOLE

public class Assignment16 {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		scanner.close();
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Please Enter The array1 Size: ");
		int arr1Size =scanner.nextInt();
		
		String[] arr1 =new String[arr1Size];
		
		System.out.println("Please Enter the array1 values");
		for(int i=0;i<arr1Size;i++) {
			arr1[i]= scanner.next();
		}
		
		System.out.println("please Enter the array2 size");
		int arr2Size = scanner.nextInt();
		
		String[] arr2 =new String[arr2Size];
		
		System.out.println("Please Enter the array2 value");
		for(int i=0;i<arr2Size;i++) {
			arr2[i] =scanner.next();
		}
		
		System.out.println("Input1: "+Arrays.toString(arr1));
		System.out.println("Input2: "+Arrays.toString(arr2));
		
		
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[i+arr1.length]=arr2[i];
			
			
		}
		System.out.println("Output: "+Arrays.toString(arr3));
		
		scanner.close();

	}

}
