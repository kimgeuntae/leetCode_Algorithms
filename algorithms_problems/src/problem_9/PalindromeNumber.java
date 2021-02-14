package problem_9;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : PalindromeNumber.java
 *
 * 	in:	121		out: true
 * 	in:	-121	out: false
 * 	in:	10		out: false
 * 	in:	-101	out: false
 * 	in:	123454321 out: true
 *
 */

public class PalindromeNumber {
	public static boolean checkNumber(int num) {
		
		if(num<0) return false;
		else if(num/10 == 0) return true;
		
		char [] tempChrArr = Integer.toString(num).toCharArray();
		
		for(int i=0; i<tempChrArr.length/2; i++) {
			if(tempChrArr[i] != tempChrArr[tempChrArr.length-i-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int num1 = 121;
		int num2 = -121;
		int num3 = 10;
		int num4 = -101;
		int num5 = 123454321;
		
		System.out.println(checkNumber(num1));
		System.out.println(checkNumber(num2));
		System.out.println(checkNumber(num3));
		System.out.println(checkNumber(num4));
		System.out.println(checkNumber(num5));

	}
}
