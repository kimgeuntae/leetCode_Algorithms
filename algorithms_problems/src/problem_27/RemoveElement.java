package problem_27;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : RemoveElement.java
 *
 * 	in:	nums = [3,2,2,3] , val = 3
 * 	out: 2, numse = [2,2]
 * 
 * 	in:	nums = [0,1,2,2,3,0,4,2] , val = 2
 *  out: 5, nums = [0,1,4,0,3]
 *
 */

public class RemoveElement {
	public static int removeElement(int [] nums, int val) {
		int removedCount=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == val) {
				removedCount++;
			} else {
				nums[i-removedCount] = nums[i];
			}
		}
		
		return nums.length-removedCount;
	}
	
	public static void printNums(int [] nums, int length) {
		for(int i=0; i<length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] nums1 = {3,2,2,3};
		int val1 = 3;

		int [] nums2 = {0,1,2,2,3,0,4,2};
		int val2 = 2;
		
		int newArrLength1 = removeElement(nums1, val1);
		int newArrLength2 = removeElement(nums2, val2);
		
		printNums(nums1, newArrLength1);
		printNums(nums2, newArrLength2);
		
	}
}
