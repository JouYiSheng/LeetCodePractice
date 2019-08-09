package com.problem.numberArray;

public class BestTimeSellBuyStock121 {

	public int maxProfit(int[] prices) {
        int profit=-Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int price:prices) {
        	if(price<min) {
        		min=price;
        		continue;
        	}
        	
        	if(price-min>profit)
        		profit=price-min;
        	
        }
        
        
        
        if(profit<=0) {
        	profit=0;
        }
        
        return profit;
    
        
    }
	
	
	public static void main( String[] args ) {
		
		BestTimeSellBuyStock121 util=new BestTimeSellBuyStock121();
		int []prices= {7,1,5,3,6,4};
		System.out.println(util.maxProfit(prices));
		
	}
	
	
}
