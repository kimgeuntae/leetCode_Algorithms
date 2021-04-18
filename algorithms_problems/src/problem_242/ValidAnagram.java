package problem_242;

import java.util.HashMap;
import java.util.Map;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ValidAnagram.java
 *
 * 	in:	 out: 
 * 	in:	 out: 
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class ValidAnagram {
	
	public static boolean isAnagram(String s, String t) {
        
		if(s.length() != t.length()) return false;
		
		Map<Character, Integer> sMap = countAlpha(s);
		Map<Character, Integer> tMap = countAlpha(t);
		
		for(char ch : t.toCharArray()) {
			if(!sMap.containsKey(ch) || tMap.get(ch) != sMap.get(ch))
				return false;
		}
		
		return true;
	}
	
	public static Map<Character, Integer> countAlpha(String s) {
		
		char [] sArr = s.toCharArray();
		
		Map<Character, Integer> checkData = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			
			char now = sArr[i];
			int count = 1;
			int left = i+1;
			int right = s.length()-1;
			
			if(!checkData.containsKey(now)) {
				while(left <= right) {
					if(now == sArr[left] || now == sArr[right]) count ++;
					left++;
					right--;
				}
				checkData.put(now, count);
			}
		}
		
		return checkData;
	}
	
	public static void main(String[] args) {
		
		String s1 = "anagram";
		String t1 = "nagaram";
		System.out.println(isAnagram(s1, t1));
		
		String s2 = "rat";
		String t2 = "ar";
		System.out.println(isAnagram(s2, t2));
		
//		TODO 33 / 34 test cases passed.
//		Wrong Answer of last case.
		
	}
}
