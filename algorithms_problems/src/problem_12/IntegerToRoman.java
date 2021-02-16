package problem_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : IntegerToRoman.java
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
 *	in:	3 		out: "III"
 * 	in:	4 		out: "IV"
 * 	in:	9 		out: "IX"
 * 	in:	58 		out: "LVIII"
 * 	in:	1994 	out: "MCMXCIV"
 * 	in:	1894 	out: "MDCCCXCIV"
 * 
 *
 */

public class IntegerToRoman {
	private static String intToRoman(int num) {
		
		Map<Integer, Character> tempMap = new LinkedHashMap<Integer, Character>() {
			{
				put(1000, 'M');
				put(500, 'D');
				put(100, 'C');
				put(50, 'L');
				put(10, 'X');
				put(5, 'V');
				put(1, 'I');
			}
		};
		
		ArrayList<Integer> tempList = new ArrayList<Integer>(
										Arrays.asList(1000, 500, 100, 50, 10, 5, 1));
		
		String result="";
		int tempNum;
		
		for(int i=0; i<tempList.size(); i++) {
			
			while(num / tempList.get(i) != 0) {
				
				tempNum = num / tempList.get(i);
				num %= tempList.get(i);
				
				for(int j=0; j<tempNum; j++) {
					result += tempMap.get(tempList.get(i));
				}
			}
			
			for(int j=(i+2)/2; j<tempList.size()/2+1; j++) {
				
				if(num / (tempList.get(i) - tempList.get(j*2)) > 0) {
					tempNum = num / (tempList.get(i)-tempList.get(j*2));
					num %= tempList.get(i)-tempList.get(j*2);
					
					for(int k=0; k<tempNum; k++) {
						result += tempMap.get(tempList.get(j*2));
						result += tempMap.get(tempList.get(i));
					}
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		int num3 = 9;
		int num4 = 58;
		int num5 = 1994;
		int num6 = 1894;
		
		System.out.println(intToRoman(num1));
		System.out.println(intToRoman(num2));
		System.out.println(intToRoman(num3));
		System.out.println(intToRoman(num4));
		System.out.println(intToRoman(num5));
		System.out.println(intToRoman(num6));
		
	}
}
