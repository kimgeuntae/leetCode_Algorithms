package problem_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ValidParentheses.java
 *
 * 	in:	"()"		out: true
 * 	in:	"()[]{}"	out: true
 * 	in:	"(]"		out: false
 * 	in:	"([)]"		out: false
 * 	in:	"{[]}"		out: true
 *  
 *  [solved]
 *  Runtime: 2 ms, faster than 29.63%
 *  Memory Usage: 37.5 MB, less than 25.76%
 *  
 */

public class ValidParentheses {
	public static boolean isValid(String s) {
		
		if(s == null || s.length() <= 1 || s.length() % 2 == 1) return false;	// Odd length return false
		
		Map<Character, Character> tempMap = new HashMap<Character, Character>();
		tempMap.put('(', ')');
		tempMap.put('{', '}');
		tempMap.put('[', ']');
		
		char [] tempChr = s.toCharArray();
		
		if(tempMap.containsValue(tempChr[0]) || tempMap.containsKey(tempChr[tempChr.length-1])) {
			return false;
		}	// Start [closed] , end [open] return false
		
		Stack<Character> tempStack = new Stack<Character>();
		
		for(int i=0; i<tempChr.length; i++) {
			
			char now = tempChr[i];
			
			if(tempMap.containsKey(now)) {
				char next = tempChr[i+1];
				
				if(tempMap.get(now) == next) {
					i++;
				} else if(tempMap.containsValue(next)) {
					return false;
				} else {
					tempStack.push(now);	// Only push [open]
				}
			} else {
				if(tempStack.isEmpty()) {
					return false;
				} else if(tempMap.get(tempStack.lastElement()) == now) {
					tempStack.pop();		// Only pop [closed]
				} else {
					return false;
				}
			}
		}
		
		return tempStack.isEmpty();		// Non clean stack return false
    }
	
	public static void main(String[] args) {
		
		String s1 = "()";		// true
		String s2 = "()[]{}";	// true
		String s3 = "(]";		// false
		String s4 = "([)]";		// false
		String s5 = "{[]}";		// true
		String s6 = "(){";		// false
		String s7 = "((";		// false
		String s8 = "]]";		// false
		String s9 = "[[[]";		// false
		String s10 = "()))";	// false
		String s11 = "[([]])";	// false
		String s12 = "(([]){})";	// true
		
		System.out.println("1 : " + isValid(s1));
		System.out.println("2 : " + isValid(s2));
		System.out.println("3 : " + isValid(s3));
		System.out.println("4 : " + isValid(s4));
		System.out.println("5 : " + isValid(s5));
		System.out.println("6 : " + isValid(s6));
		System.out.println("7 : " + isValid(s7));
		System.out.println("8 : " + isValid(s8));
		System.out.println("9 : " + isValid(s9));
		System.out.println("10 : " + isValid(s10));
		System.out.println("11 : " + isValid(s11));
		System.out.println("12 : " + isValid(s12));

	}
}
