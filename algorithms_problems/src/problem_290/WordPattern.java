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
 *  Runtime: 1 ms, faster than 83.28%
 *  Memory Usage: 37.3 MB, less than 22.77%
 *  
 */

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		
		char [] splitedPattern = pattern.toCharArray();
		String [] splitedStr = s.split(" ");
		int patternSize = splitedPattern.length;
		int strSize = splitedStr.length;
		int i = 0;
		
		if(patternSize != strSize) return false;
		
		while(0 < patternSize && i < patternSize) {
			
			char patternWord = splitedPattern[i];
			String strWord = splitedStr[i];
			
			int left = i;
			int right = patternSize-1;
			
			while(left < right) {
				
				char patternLeft = splitedPattern[left];
				char patternRight = splitedPattern[right];
				
				String strLeft = splitedStr[left];
				String strRight = splitedStr[right];
				
				if(patternWord == patternLeft) {
					if(strWord.equals(strLeft)) {
						splitedPattern[left] = splitedPattern[left+1];
						splitedStr[left] = splitedStr[left+1];
					} else return false;
				}
				
				if(patternWord == patternRight) {
					if(strWord.equals(strRight)) {
						splitedPattern[right] = splitedPattern[right-1];
						splitedStr[right] = splitedStr[right-1];
					} else return false;
				}
				
				if(patternWord != patternLeft) {
					if(strWord.equals(strLeft)) return false;
				} else if(patternWord != patternRight) { 
					if(strWord.equals(strRight)) return false;
				}
				
				left++;
				right--;
			}
			i++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String pattern1 = "abba", s1 = "dog cat cat dog";
		String pattern2 = "ab", s2 = "dog dog";
		String pattern3 = "apstndp", s3 = "all people seem to need data processing";	// false
		
		System.out.println(wordPattern(pattern1, s1));
		System.out.println(wordPattern(pattern2, s2));
		System.out.println(wordPattern(pattern3, s3));
		
	}
}
