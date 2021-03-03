package problem_67;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : AddBinary.java
 *
 * 	in:	a = "11", b = "1"		out: "100"
 * 	in:	a = "1010", b = "1011"	out: "10101"
 *  
 *  [solved]
 *  Runtime: 8 ms, faster than 8.01%
 *  Memory Usage: 39.1 MB, less than 39.50%
 *  
 */

public class AddBinary {
	public static String addBinary(String a, String b) {
        
		char [] binaryAChr = a.toCharArray();
		char [] binaryBChr = b.toCharArray();
		
		int aIndex = a.length()-1;
		int bIndex = b.length()-1;
		String resultBinary = "";
		int sum = 0;
		char carry = '0';
		
		while(aIndex >= 0 || bIndex >= 0 || carry != '0') {
			if(aIndex < 0 && bIndex < 0) {
				sum = carry - '0';
			} else if(aIndex < 0) {
				sum = (binaryBChr[bIndex] - '0') + (carry - '0');
			} else if(bIndex < 0) {
				sum = (binaryAChr[aIndex] - '0') + (carry - '0');
			} else {
				sum = (binaryAChr[aIndex] - '0') + (binaryBChr[bIndex] - '0') + (carry - '0');
			}
			
			resultBinary += sum % 2;
			carry = Character.forDigit(sum/2, 10);
			
			aIndex--;
			bIndex--;
		}
		
		String temp = "";
		
		for(int i=resultBinary.length()-1; i>=0; i--) {
			temp += resultBinary.charAt(i);
		}
		
		resultBinary = temp;
		
		return resultBinary;
    }
	
	public static void main(String[] args) {
		
		String a1 = "11", b1 = "1";			// 100
		String a2 = "1010", b2 = "1011";	// 10101
		
		System.out.println(addBinary(a1, b1));
		System.out.println(addBinary(a2, b2));
		
	}
}
