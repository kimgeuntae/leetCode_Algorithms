package problem_58;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : LengthOfLastWord.java
 *
 *	in:	s = "Hello World" 	out: 5
 * 	in:	s = " " 			out: 0
 * 	in:	s = " a e dase ee" 	out: 2
 *  in:	s = "a " 			out: 1
 *  in:	s = "a asd fa " 	out: 2
 *  in: s = "b   a    "		out: 1
 *  in: s = "        "		out: 0
 *  
 *  [solved]
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 38.8 MB, less than 15.85%
 */

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		
		while(s.lastIndexOf(" ") == s.length()-1) {
			s = s.substring(0, s.lastIndexOf(" "));
			if(s.length() == 0) {
				return 0;
			}
		}
		
		s = s.substring(s.lastIndexOf(" ")+1, s.length());
		return s.length();
	}
	
	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = " ";
		String str3 = " a e dase ee";
		String str4 = "a ";
		String str5 = "a asd fa ";
		String str6 = "b   a    ";
		String str7 = "        ";
		
		System.out.println(lengthOfLastWord(str1));
		System.out.println(lengthOfLastWord(str2));
		System.out.println(lengthOfLastWord(str3));
		System.out.println(lengthOfLastWord(str4));
		System.out.println(lengthOfLastWord(str5));
		System.out.println(lengthOfLastWord(str6));
		System.out.println(lengthOfLastWord(str7));
	}
}
