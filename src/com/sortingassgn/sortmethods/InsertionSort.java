package com.sortingassgn.sortmethods;

import com.sortingassgn.main.SortInterface;

public class InsertionSort implements SortInterface {

    public static void insertionSort(int arr[]) {
    	        int n = arr.length;
    	        int i, j, temp;
    	        for (i = 1; i< n; i++) 
    	        {
    	            j = i;
    	            temp = arr[i];    
    	            while (j > 0 && temp < arr[j-1])
    	            {
    	                arr[j] = arr[j-1];
    	                j = j-1;
    	            }
    	            arr[j] = temp;            
    	        }        
    }

	@Override
	public void print(int arr[]) {
       
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
	}
}