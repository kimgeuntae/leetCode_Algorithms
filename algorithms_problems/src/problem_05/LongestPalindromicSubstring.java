package problem_05;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LongestPalindromicSubstring.java
 *
 * 	in:	"babad" out: "bab"
 * 	in:	"cbbd" out: "bb"
 * 	in:	"a" out: "a"
 * 	in:	"ac" out: "a"
 * 	in:	"ccc" out: "ccc"
 * 	in:	"babadb" out: "bab"
 *  
 *  [solved]
 *  Runtime: 940 ms, faster than 5.01%
 *  Memory Usage: 39.4 MB, less than 56.79%
 *  
 */

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		
		if(s == null || s.length() <= 1) return s;
		
		String longestStr = s.substring(0, 1);
		char [] tempChr = s.toCharArray();
		
		for(int i=1; i<tempChr.length; i++) {
			String curStr = s.substring(0, i+1);
			String curWord = Character.toString(tempChr[i]);
			boolean isPalindromic = false;
			
			while(curStr.contains(curWord)) {
				
				curStr = curStr.substring(curStr.indexOf(tempChr[i]));
				char [] curChrArr = curStr.toCharArray();
				int left = 0;
				int right = curStr.length()-1;
				
				while(left <= right) {
					if(curChrArr[left] != curChrArr[right]) {
						isPalindromic = false;
						break;
					} else {
						isPalindromic = true;
						left++;
						right--;
					}
				}
				
				if(isPalindromic) break;
				curStr = curStr.substring(1);
			}
			
			if(longestStr.length() < curStr.length() && isPalindromic) {
				longestStr = curStr;
			}
		}
		
		return longestStr;
	}
	
	public static void main(String[] args) {
		
		String s1 = "babad";
		String s2 = "cbbd";
		String s3 = "a";
		String s4 = "ac";
		String s5 = "ccc";	//	"ccc"
		String s6 = "babadb";	// "bab"
		
		System.out.println(longestPalindrome(s1));
		System.out.println(longestPalindrome(s2));
		System.out.println(longestPalindrome(s3));
		System.out.println(longestPalindrome(s4));
		System.out.println(longestPalindrome(s5));
		System.out.println(longestPalindrome(s6));
		
	}
}
