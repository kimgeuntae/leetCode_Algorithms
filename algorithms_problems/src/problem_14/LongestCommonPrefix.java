package problem_14;

import java.util.Arrays;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LongestCommonPrefix.java
 *
 * 	in: ["flower","flow","flight"]	 	out: "fl"
 * 	in:	["dog","racecar","car"]			out: ""
 * 	in:	["dlowerflow","flow","flowht"]	out: ""
 * 	in:	["safsdaeccdswedss","flow","flight"]  out: ""
 * 	in:	[]	out: ""
 *  
 *  [solved]
 *  Runtime: 1 ms, faster than 62.50%
 *  Memory Usage: 38.8 MB, less than 30.12%
 *  
 */

public class LongestCommonPrefix {
	private static String longestCommonPrefix(String [] strs) {
		
		if(strs.length == 0) return "";
		
		Arrays.sort(strs);
		
		int same = 0;
		
		while(same < strs[0].length()) {
			if(strs[0].charAt(same) == strs[strs.length-1].charAt(same)) {
				same++;
			} else break;
		}
		
		return strs[0].substring(0, same);
	}
	
	public static void main(String[] args) {
		
		String [] strs1 = {"flower","flow","flight"};
		String [] strs2 = {"dog","racecar","car"};
		String [] strs3 = {"dlowerflow","flow","flowht"};
		String [] strs4 = {"safsdaeccdswedss","flow","flight"};
		String [] strs5 = {};
		String [] strs6 = {"reflower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs1));
		System.out.println(longestCommonPrefix(strs2));
		System.out.println(longestCommonPrefix(strs3));
		System.out.println(longestCommonPrefix(strs4));
		System.out.println(longestCommonPrefix(strs5));
		System.out.println(longestCommonPrefix(strs6));
		
	}
}
