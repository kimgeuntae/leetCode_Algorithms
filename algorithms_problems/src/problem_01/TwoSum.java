package problem_01;

import java.util.ArrayList;
import java.util.Arrays;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : TwoSum.java
 * 
 * 	in: nums = [2,7,11,15], target = 9	out: [0,1]
 * 	in: nums = [3,2,4], target = 6		out: [1,2]
 *	in:	nums = [3,3], target = 6		out: [0,1]
 *
 */

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        
        int [] result = new int[2];
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
        	if(tempList.contains(target-nums[i])) {
        		result[0] = tempList.indexOf(target-nums[i]);
        		result[1] = i;
        		break;
        	}
        	
        	tempList.add(nums[i]);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		
		int [] nums1 = {2, 7, 11, 15};
		int [] nums2 = {3, 2, 4};
		int [] nums3 = {3, 3};
		
		int target1 = 9;
		int target2 = 6;
		int target3 = 6;
		
		System.out.println(Arrays.toString(twoSum(nums1, target1)));
		System.out.println(Arrays.toString(twoSum(nums2, target2)));
		System.out.println(Arrays.toString(twoSum(nums3, target3)));
		
	}
}
