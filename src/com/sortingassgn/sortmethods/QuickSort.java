package com.sortingassgn.sortmethods;

import com.sortingassgn.main.SortInterface;

public class QuickSort implements SortInterface
{

 int partition(int arr[], int low, int high)
 {
     int pivot = arr[high]; 
     int i = (low-1);
     for (int j=low; j<high; j++)
     {
         
         if (arr[j] <= pivot)
         {
             i++;

            
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;

     return i+1;
 }

 void sort(int arr[], int low, int high)
 {
     if (low < high)
     {
         int pi = partition(arr, low, high);

         sort(arr, low, pi-1);
         sort(arr, pi+1, high);
     }
 }


@Override
public void print(int arr[]) {
	 
	     int n = arr.length;
	     QuickSort ob = new QuickSort();
	     ob.sort(arr, 0, n-1);
	     
	     for (int i=0; i<n; ++i)
	         System.out.print(arr[i]+" ");
	
}
}