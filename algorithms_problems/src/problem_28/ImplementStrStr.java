package problem_28;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ImplementStrStr.java
 *
 * 	in:	haystack = "hello", needle = "ll"	out: 2
 * 	in:	haystack = "aaaaa", needle = "bba"	out: -1
 * 	in:	haystack = "", needle = ""			out: 0
 *  
 *  [solved]
 *  Runtime: 1 ms, faster than 65.04%
 *  Memory Usage: 39.7 MB, less than 6.59%
 *  
 */

public class ImplementStrStr {
	
	public static int strStr(String haystack, String needle) {
	    
		int l1 = haystack.length(), l2 = needle.length();
		
		if(l1 < l2) {
			return -1;
		} else if(l2 == 0) {
			return 0;
		} else {
			String needleFitstWord = needle.substring(0, 1);
			
			for(int i=0; i<l1;) {
				if(l1 < i+l2) return -1;
				String tempStr = haystack.substring(i, i+l2);
				
				if(tempStr.equals(needle)) {
					return i;
				} else if(tempStr.contains(needleFitstWord)) {
					i += tempStr.indexOf(needleFitstWord);
					if(l1 < i+l2) return -1;
					tempStr = haystack.substring(i, i+l2);
					if(tempStr.equals(needle)) return i;
					
					i++;
				} else {
					i += l2;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		String haystack1 = "hello", needle1 = "ll";
		String haystack2 = "aaaaa", needle2 = "bba";
		String haystack3 = "", needle3 = "";
		String haystack4 = "mississippi", needle4 = "issipi";
		
		System.out.println(strStr(haystack1, needle1));
		System.out.println(strStr(haystack2, needle2));
		System.out.println(strStr(haystack3, needle3));
		System.out.println(strStr(haystack4, needle4));
		
	}
}
