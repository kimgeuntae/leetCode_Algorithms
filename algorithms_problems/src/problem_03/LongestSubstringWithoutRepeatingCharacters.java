package problem_03;

import java.util.LinkedList;
import java.util.Queue;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LongestSubstringWithoutRepeatingCharacters.java
 *
 * 	in:	s = "abcabcbb"	out: 3
 * 	in:	s = "bbbbb"		out: 1
 * 	in:	s = "pwwkew"	out: 3
 * 	in:	s = ""			out: 0
 *	in:	s = "awersnvakjvzQiushdawkejrk"		out: 14
 *	in:	s = " "			out: 1
 *	in:	s = "au"		out: 2
 *	in:	s = "aab"		out: 2
 *	in:	s = "qrsvbspk"	out: 5
 *
 */

public class LongestSubstringWithoutRepeatingCharacters {
	public static int search(String str) {
		
		Queue<Character> tempQueue = new LinkedList<>();
		
		if(str.length() == 0)
			return 0;
		else if(str.length() == 1)
			return 1;
		
		int num=0;
		
		for(int i=0; i<str.length(); i++) {
			char chr = str.charAt(i);
			
			while (tempQueue.contains(chr)) {
				if(num < tempQueue.size()) {
					num = tempQueue.size();
				}
				tempQueue.remove();
			}
			
			tempQueue.add(chr);
		}
		
		return num > tempQueue.size() ? num : tempQueue.size();
	}
	
	public static void main(String[] args) {
		
		String str1 = "abcabcbb";
		String str2 = "bbbbb";
		String str3 = "pwwkew";
		String str4 = "";
		String str5 = "awersnvakjvzQiushdawkejrk";
		String str6 = " ";
		String str7 = "au";
		String str8 = "aab";
		String str9 = "qrsvbspk";
		
		System.out.println(search(str1));
		System.out.println(search(str2));
		System.out.println(search(str3));
		System.out.println(search(str4));
		System.out.println(search(str5));
		System.out.println(search(str6));
		System.out.println(search(str7));
		System.out.println(search(str8));
		System.out.println(search(str9));
		
	}
}
