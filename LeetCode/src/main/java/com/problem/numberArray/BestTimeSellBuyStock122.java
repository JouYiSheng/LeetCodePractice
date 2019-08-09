package com.problem.numberArray;

public class BestTimeSellBuyStock122 {

	 public int maxProfit(int[] prices) {
		 if(prices.length==0) {
			 return 0;
		 }
		 int totalProfit=0;
		 boolean isBuy=false;
		 	int profit;
	        int buy=Integer.MAX_VALUE;
	        int previous=0;
	        for(int price:prices) {
	        	if(!isBuy) {
	        		isBuy=true;
	        		buy=price;
	        		previous=price;
	        		continue;
	        	}
	        	
	        	
//	        	if(price<buy) {
//	        		buy=price;
//	        		previous=price;
//	        		continue;
//	        	}
	        	
	        	if(previous>price) {
	        		System.out.println("previous: "+previous+" buy: "+buy);
	        		//price start to fall down finish previous transaction
	        		profit=previous-buy;
	        		if(profit>0) {
	        			totalProfit+=profit;
	        		}
	        		
	        		buy=price;
	        		
	        	}
	        	
	        	previous=price;
	        	
	        }
	        
	       System.out.println("out loop previous: "+previous+" buy: "+buy);
	       profit=previous-buy;
	       
	       if(profit>0) {
   			totalProfit+=profit;
   		}
	        
	        return totalProfit;
	    }
	 
	 public static void main( String[] args ) {
			
		 BestTimeSellBuyStock122 util=new BestTimeSellBuyStock122();
			int []prices= {2,4,1};
			System.out.println(util.maxProfit(prices));
			
		}
}
