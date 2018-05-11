package com.sortingassgn.sortmethods;

import com.sortingassgn.main.SortInterface;

public class BubbleSort implements SortInterface{  
	
     void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){     
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  

	@Override
	public void print(int arr[]) { 
		 bubbleSort(arr);
		 for(int i=0; i < arr.length; i++){  
             System.out.print(arr[i] + " ");  
     }  
		
	}  
}  