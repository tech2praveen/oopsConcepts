package com.sortingassgn.main;

import com.sortingassgn.sortmethods.BubbleSort;
import com.sortingassgn.sortmethods.InsertionSort;
import com.sortingassgn.sortmethods.QuickSort;
import com.sortingassgn.sortmethods.mergeSort;

public class sortFactory {
	 public SortInterface getSortMethod(int sortType){
		
		 if(sortType==1)
		 {
			return new QuickSort();
			
		 }
		 else if(sortType==2)
		 {
			 return new mergeSort();
			 
		 }
		 else if(sortType==3)
		 {
			 return new BubbleSort();
			 
		 }
		 else if(sortType==4)
		 {
			 return new InsertionSort();
			 
		 }
		 else
			 return null;
		 
		 
		 
	 }
	 

}
