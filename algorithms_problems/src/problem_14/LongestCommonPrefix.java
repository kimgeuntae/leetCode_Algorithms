package problem_14;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LongestCommonPrefix.java
 *
 * 	in: ["flower","flow","flight"]	 	out: "fl"
 * 	in:	["dog","racecar","car"]			out: ""
 * 	in:	["dlowerflow","flow","flowht"]	out: "flow"
 * 	in:	["safsdaeccdswedss","flow","flight"]
 *	out: "f"
 * 	in:	[]	out: ""
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class LongestCommonPrefix {
	private static String longestCommonPrefix(String [] strs) {
		// TODO Runtime Error test_case [strs5]
		
		String minStr = strs[0];
		String longestCommonStr = "";
		
		for(String str : strs) {
			if(minStr.length() > str.length()) {
				minStr = str;
			}
		}
		
		for(String str : strs) {
			longestCommonStr = "";
			
			for(int i=0; i<minStr.length(); i++) {
				for(int j=minStr.length(); j>=i; j--) {
					if(str.contains(minStr.substring(i, j))) {
						if(longestCommonStr.length() < minStr.substring(i, j).length()) {
							longestCommonStr = minStr.substring(i,  j);
						}
					}
				}
			}
			
			if(longestCommonStr.equals("")) {
				return "";
			} else {
				minStr = longestCommonStr;
			}
		}
		
		return longestCommonStr;
	}
	
	public static void main(String[] args) {
		
		String [] strs1 = {"flower","flow","flight"};
		String [] strs2 = {"dog","racecar","car"};
		String [] strs3 = {"dlowerflow","flow","flowht"};
		String [] strs4 = {"safsdaeccdswedss","flow","flight"};
		String [] strs5 = {};
		
		System.out.println(longestCommonPrefix(strs1));
		System.out.println(longestCommonPrefix(strs2));
		System.out.println(longestCommonPrefix(strs3));
		System.out.println(longestCommonPrefix(strs4));
		System.out.println(longestCommonPrefix(strs5));
	}
}
