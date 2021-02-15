package problem_02;

import java.util.ArrayList;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : AddTwoNumbers.java
 *
 * 	in:	l1 = [2,4,3], l2 = [5,6,4]				out: [7,0,8]
 * 	in:	l1 = [0], l2 = [0] 						out: [0]
 *  in:	l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] 	out: [8,9,9,9,0,0,0,1]
 *
 */

public class AddTwoNumbers {

	// TODO Change array to listNode
	
	private static int listToInt(int [] tempList) {
		int num = 0;
		
		for(int i=tempList.length; i>0; i--) {
			num += tempList[i-1] * Math.pow(10,  tempList.length-i);
		}
		
		return (int)num;
	}
	
	public static void main(String[] args) {
		int [] inPutNums1 = {9, 9, 9, 9, 9, 9, 9};
		int [] inPutNums2 = {9, 9, 9, 9};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = listToInt(inPutNums1) + listToInt(inPutNums2);
		
		while (true) {
			
			if(num/10 == 0) {
				list.add(num);
				break;
			}
			
			list.add(num%10);
			num = num/10;
		}
		
		System.out.println(list);
	}
}
