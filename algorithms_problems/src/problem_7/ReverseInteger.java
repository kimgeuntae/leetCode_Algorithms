package problem_7;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ReverseInteger.java
 *
 * 	in:	123 	out: 321
 * 	in:	-123 	out: -321
 * 	in:	120		out: 21
 * 	in:	0		out: 0
 * 	in:	1534236469 out: 0
 *
 */

public class ReverseInteger {
	public static int reverse(int num) {
		
		String temp = "";
		
		if(num<0) {
			temp += "-";
			num *= -1;
		}
		
		while(true) {
			if(num/10 == 0) {
				temp += num;
				break;
			}
			temp += num%10;
			num = num/10;
		}
		
		try {
			return Integer.parseInt(temp);
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		int num1 = 123;
		int num2 = -123;
		int num3 = 120;
		int num4 = 0;
		int num5 = 1534236469;
		
		System.out.println(reverse(num1));
		System.out.println(reverse(num2));
		System.out.println(reverse(num3));
		System.out.println(reverse(num4));
		System.out.println(reverse(num5));
		
	}
}
