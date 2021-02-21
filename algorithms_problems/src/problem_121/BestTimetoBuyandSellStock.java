package problem_121;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : BestTimetoBuyandSellStock.java
 *
 * 	in:	[7,1,5,3,6,4]	out: 5
 * 	in:	[7,6,4,3,1]		out: 0
 * 	in:	[3,115,10,12,1,5,2]		out: 112
 * 	in:	[0,4,8,1,5]		out: 8
 *  
 *  [solved]
 *  Runtime: 2 ms, faster than 50.63%
 *  Memory Usage: 52.5 MB, less than 27.79%
 *  
 */

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int [] prices) {
		
		int profitVal = 0;
		int minVal = prices[0];
		
		for(int i=1; i<prices.length; i++) {
			
			if(minVal < prices[i]) {
				if(profitVal < prices[i] - minVal) {
					profitVal = prices[i] - minVal;
				}
			} else {
				minVal = prices[i];
			}

		}
		
		return profitVal;
	}
	
	public static void main(String[] args) {
		
		int [] prices1 = {7,1,5,3,6,4};
		int [] prices2 = {7,6,4,3,1};
		int [] prices3 = {3,115,10,12,1,5,2};
		int [] prices4 = {0,4,8,1,5};

		System.out.println(maxProfit(prices1));
		System.out.println(maxProfit(prices2));
		System.out.println(maxProfit(prices3));
		System.out.println(maxProfit(prices4));

	}
}
