package problem_88;

import java.util.Arrays;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : MergeSortedArray.java
 *
 * 	in:	nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 	out: [1,2,2,3,5,6]
 * 	in:	nums1 = [1], m = 1, nums2 = [], n = 0
 * 	out: [1]
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
    }
	
	public static void main(String[] args) {
		
		int [] nums1_1 = {1,2,3,0,0,0}, nums1_2 = {2,5,6};
		int m1 = 3, n1 = 3;
		
		int [] nums2_1 = {1}, nums2_2 = {};
		int m2 = 1, n2 = 0;
		
		merge(nums1_1, m1, nums1_2, n1);
		System.out.println(Arrays.toString(nums1_1));

		merge(nums2_1, m2, nums2_2, n2);
		System.out.println(Arrays.toString(nums2_1));
		
	}
}
