package problem_258;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : AddDigits.java
 *
 * 	in:	38 out: 2
 * 	in:	0  out: 0
 * 	in:	2147483647  out: 1
 *  
 *  [solved]
 *  Runtime: 1 ms, faster than 100.00%
 *  Memory Usage: 35.9 MB, less than 84.79%
 *  
 */

public class AddDigits {
	
	public static int addDigits(int num) {
		int temp = 0;
		
		if(num / 10 == 0) {
			return num;
		} else {
			while(10 <= num) {
				temp += num % 10;
				num = num / 10;
			}
			
			temp += num % 10;
			return addDigits(temp);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(addDigits(38));
		System.out.println(addDigits(0));
		System.out.println(addDigits(2147483647));
	}
}
