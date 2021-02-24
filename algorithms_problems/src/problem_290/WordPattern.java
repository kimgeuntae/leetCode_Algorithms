package problem_290;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : WordPattern.java
 *
 * 	in:	pattern = "abba", s = "dog cat cat dog"
 * 	out: true
 * 
 * 	in:	pattern = "abba", s = "dog cat cat fish"
 * 	out: false
 * 
 * 	in:	pattern = "aaaa", s = "dog cat cat dog"
 * 	out: false
 *  
 *  in:	pattern = "abba", s = "dog dog dog dog"
 * 	out: false
 * 
 *  in:	pattern = "ab", s = "dog dog"
 * 	out: false
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		// TODO Error Wrong Answer test_case pattern2
		
		String [] splitedStr = s.split(" ");
		char [] splitedPattern = pattern.toCharArray();
		
		if(splitedStr.length != splitedPattern.length) return false;
		
		for(int i=0; i<splitedPattern.length; i++) {
			int left = i+1, right = splitedPattern.length-1;
			
			while(left < right) {
				if(splitedPattern[i] == splitedPattern[left]) {
					if(!splitedStr[i].equals(splitedStr[left])) return false;
				} else if(splitedPattern[i] != splitedPattern[left]) {
					if(splitedStr[i].equals(splitedStr[left])) return false;
				}
				
				if(splitedPattern[i] == splitedPattern[right]) {
					if(!splitedStr[i].equals(splitedStr[right])) return false;
				} else if(splitedPattern[i] != splitedPattern[right]) {
					if(splitedStr[i].equals(splitedStr[right])) return false;
				}
				
				left++;
				right--;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String pattern1 = "abba", s1 = "dog cat cat dog";
		String pattern2 = "ab", s2 = "dog dog";
		
		System.out.println(wordPattern(pattern1, s1));
		System.out.println(wordPattern(pattern2, s2));
	}
}
