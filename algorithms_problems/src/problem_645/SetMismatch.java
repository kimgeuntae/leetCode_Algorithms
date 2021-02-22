package problem_645;

import java.util.Arrays;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : SetMismatch.java
 *
 * 	in:	[1,2,2,4]	out: [2,3]
 * 	in:	[1,1]		out: [1,2]
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class SetMismatch {
	public static int[] findErrorNums(int[] nums) {
		
		int [] result = new int[2];
		
		if(nums.length < 3) {
			if(nums[0] == 1) {
				result[0] = nums[0];
				result[1] = nums[0]+1;
			} else {
				result[0] = nums[0];
				result[1] = nums[0]-1;
			}
		} else {
			
			for(int i=1; i<nums.length-1; i+=2) {
				int now = nums[i];
				int before = nums[i-1];
				int next = nums[i+1];
				
				if(before == now) {
					result[0] = before;

					if(now < next) result[1] = now+1;
					else result[1] = now-1;
					break;
					
				} else if(now == next){
					result[0] = now;
					
					if(before < now) result[1] = now+1;
					else result[1] = next-1;
					break;
				}
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		
		int [] nums1 = {1,2,2,4};
		int [] nums2 = {1,1};
		int [] nums3 = {1,2,3,4,5,6,6,8,9};
		int [] nums4 = {2,2};	// 2, 1
		int [] nums5 = {3,3,2};	// 3, 2
		
		System.out.println(Arrays.toString(findErrorNums(nums1)));
		System.out.println(Arrays.toString(findErrorNums(nums2)));
		System.out.println(Arrays.toString(findErrorNums(nums3)));
		System.out.println(Arrays.toString(findErrorNums(nums4)));
		System.out.println(Arrays.toString(findErrorNums(nums5)));
		
	}
}
