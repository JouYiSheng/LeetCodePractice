package com.problem.numberArray;

import java.util.Arrays;

public class PlusOne66 {

	public int[] plusOne(int[] digits) {
		digits[digits.length-1]=digits[digits.length-1]+1;
		boolean carry=true;
		boolean largerThan=false;
		int index=digits.length-1;
		 while(carry){
			 if(digits[index]>9) {
				 
				 digits[index]=0;
				 if(index-1<0) {
					 largerThan=true;
					 break;
				 }
				 else {
					 digits[index-1]=digits[index-1]+1;
					 index--;
				 }
			 }
			 else {
				 carry=false;
			 	}
	        }
		if(carry&&largerThan) {
			int newDigits[]=new int[digits.length+1];
			newDigits[0]=1;
			for(int i=0;i<digits.length;i++)
				newDigits[i+1]=digits[i];
			
			return newDigits;
		}
		 
		
        return digits;
    }
	
	public int[] findMax(int[] digits) {
		int max=Integer.MIN_VALUE;
        int maxStart=0,maxEnd=0;
        int Start=-1;
        boolean hasStarted=false;
        int current=0;
        for(int i=0;i<digits.length;i++) {
        	current+=digits[i];
        	if(!hasStarted) {
        		Start=i;
        		hasStarted=true;
        	}
        	if(current>max) {
        		maxStart=Start;
        		maxEnd=i;
        		max=current;
        	}
        	
        	if(current<0) {
        		current=0;
        		hasStarted=false;
        	}
        	
        }
       
        return Arrays.copyOfRange(digits, maxStart, maxEnd);
	}
	public static void main( String[] args ) {
		int digits[]= {9};
		PlusOne66 util=new PlusOne66();
		for(int num:util.plusOne(digits)) {
			System.out.println(num);
		}
		
		
	}
}
