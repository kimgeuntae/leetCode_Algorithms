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
 *
 */

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		
		if(s.lastIndexOf(" ") == s.length()) {
			return 0;
		} else {
			s = s.substring(s.lastIndexOf(" ")+1, s.length());
			return s.length();
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = " ";
		String str3 = " a e dase ee";
		String str4 = "a ";
		String str5 = "a asd fa ";
		
		System.out.println(lengthOfLastWord(str1));
		System.out.println(lengthOfLastWord(str2));
		System.out.println(lengthOfLastWord(str3));
		System.out.println(lengthOfLastWord(str4));
		System.out.println(lengthOfLastWord(str5));
	}
}
