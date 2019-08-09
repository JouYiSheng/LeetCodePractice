package com.problem.numberArray;

public class AddBinary67 {
	 public String addBinary(String a, String b) {
	        StringBuilder sb=new StringBuilder();
		 int aLength=a.length();
		 int bLength=b.length();
		 int NumA=0;
		 int NumB=0;
		 int carry=0;
		 int i=0;
		 for(;i<a.length()&&i<b.length();i++) {
			 if(a.charAt(aLength-i-1)=='1') {
				 NumA=1;
			 }
			 else {
				 NumA=0;
			 }
			 
			 if(b.charAt(bLength-i-1)=='1') {
				 NumB=1;
			 }
			 else {
				 NumB=0;
			 }
			 
			 sb.append((NumA+NumB+carry)%2);
			carry= (NumA+NumB+carry)/2;
		 }
		 if(aLength>bLength) {
			 for(;i<a.length();i++) {
				 if(a.charAt(aLength-i-1)=='1') {
				 NumA=1;
				 }
				 else {
					 NumA=0;
				 }
				 sb.append((NumA+carry)%2);
				 carry= (NumA+carry)/2;
			 }
			 
			 if(carry==1) {
				 sb.append('1');
			 }
			 
		 }
		 else if(aLength<bLength) {
			 for(;i<b.length();i++) {
				 if(b.charAt(bLength-i-1)=='1') {
					 NumB=1;
				 }
				 else {
					 NumB=0;
				 }
				 sb.append((NumB+carry)%2);
				 carry= (NumB+carry)/2;
				 
			 }
			 
			 if(carry==1) {
				 sb.append('1');
			 }
			 
		 }
		 else {
			 if(carry==1) {
				 sb.append('1');
			 }
		 }
		 
	        
		 
	        return sb.reverse().toString();
	    }
	
	public static void main( String[] args ) {
		AddBinary67 util=new AddBinary67();
		String a="10101";
		String b="00101";
		System.out.println(util.addBinary(a, b));
	}

}
