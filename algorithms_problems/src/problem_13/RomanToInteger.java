package problem_13;

import java.util.HashMap;
import java.util.Map;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : RomanToInteger.java
 *	
 * I	1
 * V	5
 * X	10
 * L	50
 * C	100
 * D	500
 * M	1000
 * 
 * I Before V and X -1
 * X Before L and C -10
 * C Before D and M -100
 *
 * 	in:	III			out: 3
 * 	in:	IV			out: 4
 * 	in:	IX			out: 9
 * 	in:	LVIII		out: 58
 * 	in:	MCMXCIV		out: 1994
 *
 */

public class RomanToInteger {
	private static int romanToInt(String s) {
		
		Map<Character, Integer> tempMap = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
		
		int result=0;
		
		for(int i=0; i<s.length(); i++) {
			if(i == s.length()-1) {
				result += tempMap.get(s.charAt(i));
			} else if(tempMap.get(s.charAt(i)) < tempMap.get(s.charAt(i+1))) {
				result -= tempMap.get(s.charAt(i));
			} else {
				result += tempMap.get(s.charAt(i));
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String str1 = "III";
		String str2 = "IV";
		String str3 = "IX";
		String str4 = "LVIII";
		String str5 = "MCMXCIV";
		
		System.out.println(romanToInt(str1));
		System.out.println(romanToInt(str2));
		System.out.println(romanToInt(str3));
		System.out.println(romanToInt(str4));
		System.out.println(romanToInt(str5));
		
	}
}
