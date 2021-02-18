package problem_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ThreeSum.java
 *
 * 	in:	[1,0,1,2,-1,-4]	out: [[-1, -1, 2], [-1, 0, 1]]
 * 	in:	[] out: []
 * 	in:	[0] out: []
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class ThreeSum {
	public static List<List<Integer>> threeSum(int [] nums) {

		Arrays.sort(nums);
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums.length >= 3) {
			for(int i=0; i<nums.length; i++) {
				for(int j=i+1; j<nums.length; j++) {
					for(int k=j+1; k<nums.length; k++) {
						int tempNum = nums[i] + nums[j] + nums[k];
						List<Integer> tempList = Arrays.asList(nums[i], nums[j], nums[k]);
						
						if(tempNum == 0 && !result.contains(tempList)) {
							result.add(tempList);
						}
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int [] nums1 = {-1,0,1,2,-1,-4};
		int [] nums2 = {};
		int [] nums3 = {0};
		int [] nums4 = {100000, -100000, 1, 0};
		int [] nums5 = {0, 0, 0, 1, -1};
		
		System.out.println(threeSum(nums1));
		System.out.println(threeSum(nums2));
		System.out.println(threeSum(nums3));
		System.out.println(threeSum(nums4));
		System.out.println(threeSum(nums5));
		
	}
}
