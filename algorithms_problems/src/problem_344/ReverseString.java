package problem_344;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ReverseString.java
 *
 * 	in:	["h","e","l","l","o"]		out: ["o","l","l","e","h"]
 * 	in:	["H","a","n","n","a","h"]	out: ["h","a","n","n","a","H"]
 *  
 *  [solved]
 *  Runtime: 1 ms, faster than 95.37%
 *  Memory Usage: 45.5 MB, less than 82.00% 
 *  
 */

public class ReverseString {
	
	public static void reverseString(char [] s) {
		int left = 0, right = s.length-1;
		char temp;
		
		while(left < right) {
			temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		char [] s1 = {'h','e','l','l','o'};
		char [] s2 = {'H','a','n','n','a','h'};
		
		reverseString(s1);
		System.out.println(s1);
		reverseString(s2);
		System.out.println(s2);
	}
}
