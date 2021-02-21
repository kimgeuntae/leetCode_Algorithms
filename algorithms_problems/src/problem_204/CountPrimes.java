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
 * 	in:	499979	out: 41537	Explanation: um.. there are 41537 under 499979.T_T
 *  
 *  [solved]
 *  Runtime: 186 ms, faster than 14.97%
 *  Memory Usage: 35.4 MB, less than 98.85%
 *  
 */

public class CountPrimes {
	
	public static boolean isPrime(int n) {
        if( n < 2 ) return false;
        if( n < 4 ) return true;
        if( n%2==0 || n%3==0 ) return false;
        for(int i=5; i*i<=n; i+=6 ) if(n%i==0 || n%(i+2)==0) return false;
        return true;
    }
	
	public static int countPrimes(int n) {
		
		int primeCount = 0;
		
		if(n > 1) {
			
			for(int i=2; i< n; i++) {
				if(isPrime(i)) {
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
