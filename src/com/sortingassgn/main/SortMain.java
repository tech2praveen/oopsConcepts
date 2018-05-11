package com.sortingassgn.main;

import java.util.Scanner;

public class SortMain {

@SuppressWarnings("resource")
public static void main(String[] args) {
	
	sortFactory sort=new sortFactory();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length of Array to sort:");
	int len=s.nextInt();
	int[] arr = new int[len];
	System.out.println("Enter the Array to sort:");
	for(int i=0;i<len;i++)
	{
	  arr[i]=(int) s.nextInt();
	}
	
	System.out.println("enter the algorithm to sort: 1:Quicksort 2:MergeSort 3:BubbleSort 4:InsertionSort");
	

	int in=s.nextInt();
	
	switch(in)
	{
		case 1:SortInterface s1=sort.getSortMethod(1);
				s1.print(arr);
				break;
		case 2:SortInterface s2=sort.getSortMethod(2);
				s2.print(arr);
				break;
		case 3:SortInterface s3=sort.getSortMethod(3);
				s3.print(arr);
				break;
		case 4:SortInterface s4=sort.getSortMethod(4);
			s4.print(arr);
			break;
		default:System.out.println("Enter valid Input");
				
	}
	
}
}
