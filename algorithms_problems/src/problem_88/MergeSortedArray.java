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
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 38.7 MB, less than 98.02%
 *  
 */

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int nums1Index = m-1, nums2Index = n-1, resultIndex = m+n;
		int tempNum = 0;
		
		while(0 <= nums1Index || 0 <= nums2Index || 0 < resultIndex) {
			if(nums2Index < 0) {
				tempNum = nums1[nums1Index--];
			} else if(nums1Index < 0) {
				tempNum = nums2[nums2Index--];
			} else {
				if(nums2[nums2Index] < nums1[nums1Index]) {
					tempNum = nums1[nums1Index--];
				} else {
					tempNum = nums2[nums2Index--];
				}
			}
			
			nums1[--resultIndex] = tempNum;
		}
    }
	
	public static void main(String[] args) {
		
		int [] nums1_1 = {1,2,3,0,0,0}, nums1_2 = {2,5,6};
		int m1 = 3, n1 = 3;
		
		int [] nums2_1 = {1}, nums2_2 = {};
		int m2 = 1, n2 = 0;
		
		int [] nums3_1 = {0}, nums3_2 = {1};
		int m3 = 0, n3 = 1;
		
		merge(nums1_1, m1, nums1_2, n1);
		System.out.println(Arrays.toString(nums1_1));

		merge(nums2_1, m2, nums2_2, n2);
		System.out.println(Arrays.toString(nums2_1));
		
		merge(nums3_1, m3, nums3_2, n3);
		System.out.println(Arrays.toString(nums3_1));
		
	}
}
