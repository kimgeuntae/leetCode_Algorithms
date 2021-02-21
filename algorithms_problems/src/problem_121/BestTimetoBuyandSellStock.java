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
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int [] prices) {
		
		int profitVal = 0;
		
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				if(profitVal < prices[j] - prices[i]) {
					profitVal = prices[j] - prices[i];
				}
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
