package com.problem.numberArray;

import java.util.HashMap;
import java.util.Map;

public class MergeIntervals56 {

	 public int[][] merge(int[][] intervals) {
		  if(intervals.length<=1)
			  return intervals;
		 
	        sort(intervals,0,intervals.length-1);
	        
	       Map<Integer,Integer> map=new HashMap<>();
	       int start=intervals[0][0];
	       int edge=intervals[0][1];
	       
	        for(int i=1;i<intervals.length;i++) {
	        	if(intervals[i][0]<=edge) {
	        		if(intervals[i][1]>edge) {
	        			edge=intervals[i][1];
	        		}
	        	}
	        	else {
	        		map.put(start, edge);
	        		start=intervals[i][0];
	        		edge=intervals[i][1];
	        	}
	        }
	        
	       
	        	map.put(start, edge);
	      int answer[][]=new int[map.size()][2];
	      int index=0;
	      for(Integer item:map.keySet()) {
	    	  answer[index][0]=item;
	    	  answer[index][1]=map.get(item);
	    	  index++;
	      }
	        	
	        
		 return answer;
	    }
	 public void swap(int[] numA,int[] numB) {
		 int temp = numA[0]; 
		 numA[0] = numB[0]; 
		 numB[0] = temp; 
         
         int temp1 = numA[1]; 
         numA[1] = numB[1]; 
         numB[1] = temp1; 
	 }
	 
	 
	 public int partition(int arr[][], int low, int high) 
    { 
        int pivot = arr[high][0];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j][0] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                swap(arr[i],arr[j]);
               
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        swap(arr[i+1],arr[high]);
        
  
        return i+1; 
    } 
    
    public void sort(int arr[][], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
     public static void main( String[] args )
     {
    	 int array[][]= {{8,10},{15,18},{1,3},{2,6}};
    	 MergeIntervals56 util=new MergeIntervals56();
    	 util.sort(array, 0, array.length-1);
    	 for(int num[]:array) {
    		 for(int item:num) {
    			 System.out.print(item+" ");
    		 }
    		 System.out.println();
    	 }
    	 
     }
     
     
}
