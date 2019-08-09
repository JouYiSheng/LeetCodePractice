package com.problem.numberArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Combinations77 {

	 public List<List<Integer>> combine(int n, int k) {
		 List<List<Integer>> answer=new ArrayList<>();
		 if(k>n)
			 return answer;
		 
		 if(k==n) {
			 List<Integer> temp=new ArrayList<>();
			 for(int i=1;i<=n;i++) {
				 temp.add(i);
			 }
			 answer.add(temp);
		 }
		 
		 if(k<n) {
			 HashSet<Integer> temp=new HashSet<>();
			 add(answer,temp,n,k,1,0);
			 
		 }
		 
		 
		 return answer;
		 
	    }
	 
	 public List<List<Integer>> add(List<List<Integer>> answer,HashSet<Integer> set,int n,int k,int num,int size) {
		
		 
		  if(size==k) {
			 List<Integer> temp=new ArrayList<>(set);
			 answer.add(temp);
			 return answer;
			 
		 }
		 
		if(num>n) {
			 return answer;
		 }
			 set.add(num);
			 answer= add(answer,set,n,k,num+1,size+1);
			
			 set.remove(num);
			 answer= add(answer,set,         n,k,num+1,size);
			 //printList(answer);
		 
		 return answer;
	 }
	 public void printList(List<List<Integer>>  list) {
		 for(List<Integer> item:list) {
			 System.out.print("[");
			 for(Integer num:item) {
				 System.out.print(num+" , ");
			 }
			 System.out.println("]");
			 
		 }
	 }
	 
	 public static void main( String[] args ) {
		 Combinations77 util=new Combinations77();
		 int k=2;
		 int n=4;
		 
		 List<List<Integer>> list=util.combine(n, k);
		 for(List<Integer> item:list) {
			 for(Integer num:item) {
				 System.out.print(num+" , ");
			 }
			 System.out.println();
			 
		 }
		 
	 }
}
