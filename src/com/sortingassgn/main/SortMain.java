package com.sortingassgn.main;

import java.util.Scanner;

public class SortMain {

@SuppressWarnings("resource")
public static void main(String[] args) {
	
	sortFactory sort=new sortFactory();
	int arr[]= {28,91,1,0,3,5,3,2,6,3};
	
	System.out.println("enter the algorithm to sort: 1:Quicksort 2:MergeSort 3:BubbleSort 4:InsertionSort");
	
	Scanner s=new Scanner(System.in);
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
