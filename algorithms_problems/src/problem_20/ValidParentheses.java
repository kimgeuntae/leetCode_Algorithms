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
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class ValidParentheses {
	public static boolean isValid(String s) {
        // TODO Runtime Error test_case s10
		
		if(s == null || s.length() % 2 == 1) return false;
		
		Map<Character, Character> tempMap = new HashMap<Character, Character>();
		tempMap.put('(', ')');
		tempMap.put('{', '}');
		tempMap.put('[', ']');
		
		char [] tempChr = s.toCharArray();
		
		if(tempMap.containsValue(tempChr[0]) || tempMap.containsKey(tempChr[tempChr.length-1])) {
			return false;
		}
		
		Stack<Character> tempStack = new Stack<Character>();
		
		for(int i=0; i<tempChr.length-1; i++) {
			
			char now = tempChr[i];
			char next = tempChr[i+1];
			
			if(tempMap.containsKey(now)) {
				tempStack.push(now);
			}
			
			if(now == tempMap.get(tempStack.lastElement())) {
				tempStack.pop();
			} else if(tempMap.get(tempStack.lastElement()) == next) {
				tempStack.pop();
				i++;
			} else if(tempMap.containsValue(next)) {
				return false;
			}
		}
		
		return (tempStack.size() <= 1) ? true : false;
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
		
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
		System.out.println(isValid(s4));
		System.out.println(isValid(s5));
		System.out.println(isValid(s6));
		System.out.println(isValid(s7));
		System.out.println(isValid(s8));
		System.out.println(isValid(s9));
		System.out.println(isValid(s10));

	}
}
