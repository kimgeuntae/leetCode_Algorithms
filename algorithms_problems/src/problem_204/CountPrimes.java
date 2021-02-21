package problem_204;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : CountPrimes.java
 *
 * 	in:	10	out: 4	Explanation: 2, 3, 5, 7
 * 	in:	0	out: 0
 * 	in:	1	out: 0
 * 	in:	6	out: 3	Explanation: 2, 3, 5
 * 	in:	3	out: 1	Explanation: 2
 * 	in:	499979	out: 	Explanation: 
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class CountPrimes {
	public static int countPrimes(int n) {
		// TODO Error Time Limit Exceeded test_case n6 
		
		int primeCount = 0;
		int nonPrimeCount;
		
		if(n > 1) {
			
			for(int i=2; i< n; i++) {
				nonPrimeCount=0;
				
				for(int j=2; j<i-1; j++) {
					if(i%j == 0) {
						nonPrimeCount++;
						break;
					}
				}
				
				if(nonPrimeCount == 0) {
					primeCount++;
				}
			}
		}
		
		return primeCount;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		int n3 = 1;
		int n4 = 6;
		int n5 = 3;
		int n6 = 499979;
		
		System.out.println(countPrimes(n1));
		System.out.println(countPrimes(n2));
		System.out.println(countPrimes(n3));
		System.out.println(countPrimes(n4));
		System.out.println(countPrimes(n5));
		System.out.println(countPrimes(n6));
		
	}
}
