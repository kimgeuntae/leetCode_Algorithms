package problem_26;

import java.util.Arrays;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : RemoveDuplicatesfromSortedArray.java
 *
 * 	in:	nums = [1,1,2]	out: 2, nums = [1,2]
 * 	in:	nums = [0,0,1,1,1,2,2,3,3,4]	out: 5, nums = [0,1,2,3,4]
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums) {
        
		return nums.length;
    }
	
	public static void main(String[] args) {
		
		int [] nums1 = {1,1,2};
		int [] nums2 = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums1) + " " + Arrays.toString(nums1));
		System.out.println(removeDuplicates(nums2) + " " + Arrays.toString(nums2));
	}
}
