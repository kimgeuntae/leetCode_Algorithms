package problem_66;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : PlusOne.java
 *
 * 	in:	[1,2,3] 	out: [1,2,4]
 * 	in:	[4,3,2,1] 	out: [4,3,2,2]
 * 	in:	[0] 		out: [1]
 * 	in:	[1,9,0,9] 	out: [1,9,1,0]
 * 	in:	[2,9,9,9] 	out: [3,0,0,0]
 * 	in:	[9,8,7,6,5,4,3,2,1,0] 	out: [3,0,0,0]
 *
 */
public class PlusOne {
	public static int[] plusOne(int[] digits) {
		
		String tempNumStr = "";
		
		for(int num : digits) {
			tempNumStr += num;
		}
		
		int numPlusOne = Integer.parseInt(tempNumStr)+1;
		String temp = Integer.toString(numPlusOne);
		digits = new int [temp.length()];
		
		for (int i = 0; i < digits.length; i++) {
			digits[i] = temp.charAt(i) - '0';
		}
		
        return digits;
    }
	
	public static void main(String[] args) {
		// TODO Have to Solve case6
		
		int [] digits1 = {1,2,3};
		int [] digits2 = {4,3,2,1};
		int [] digits3 = {0};
		int [] digits4 = {1,9,0,9};
		int [] digits5 = {2,9,9,9};
		int [] digits6 = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println(plusOne(digits1));
		System.out.println(plusOne(digits2));
		System.out.println(plusOne(digits3));
		System.out.println(plusOne(digits4));
		System.out.println(plusOne(digits5));
		System.out.println(plusOne(digits6));
		
	}
}
