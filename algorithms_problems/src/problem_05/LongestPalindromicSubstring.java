package problem_05;

import java.util.ArrayList;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LongestPalindromicSubstring.java
 *
 * 	in:	"babad" out: "bab"
 * 	in:	"cbbd" out: "bb"
 * 	in:	"a" out: "a"
 * 	in:	"ac" out: "a"
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		
		if(s == null || s.length() <= 1) return s;
		
		String longestStr = s.substring(0, 1);
		
		ArrayList<Character> tempList = new ArrayList<Character>();
		char [] tempChr = s.toCharArray();
		
		for(int i=0; i<tempChr.length; i++) {
			String now = "";
			
			if(tempList.contains(tempChr[i])) {
				now = s.substring(tempList.lastIndexOf(tempChr[i]), i+1);
			}
			
			tempList.add(tempChr[i]);
			
			if(longestStr.length() < now.length()) {
				longestStr = now;
			}
		}
		
		return longestStr;
	}
	
	public static void main(String[] args) {
		
		String s1 = "babad";
		String s2 = "cbbd";
		String s3 = "a";
		String s4 = "ac";
		
		System.out.println(longestPalindrome(s1));
		System.out.println(longestPalindrome(s2));
		System.out.println(longestPalindrome(s3));
		System.out.println(longestPalindrome(s4));
		
	}
}
