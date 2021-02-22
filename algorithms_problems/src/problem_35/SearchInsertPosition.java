package problem_35;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : SearchInsertPosition.java
 *
 * 	in:	[1,3,5,6] , target: 5
 * 	out: 2
 * 
 * 	in:	[1,3,5,6] , target: 7
 *  out: 4
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        
		int head = 0;
		int tail = nums.length-1;
		int mid = 0;
		
		if(nums[head] > target) {
			return head;
		} else if(nums[tail] < target) {
			return tail+1;
		}
		
		while(head <= tail) {
			mid = (head+tail) / 2;
			
			if(nums[mid] == target) return mid;
			else {
				if(nums[mid] > target) {
					if(nums[mid-1] < target) return mid;
					tail = mid-1;
				} else {
					if(nums[mid+1] > target) return mid+1;
					head = mid+1;
				}
			}
		}
		
		return mid;
    }
	
	public static void main(String[] args) {
		
		int [] nums1 = {1,3,5,6};
		int target1 = 5;
		
		int [] nums2 = {1,3,5,6};
		int target2 = 2;
		
		int [] nums3 = {1,3,5,6};
		int target3 = 7;
		
		int [] nums4 = {1,3,5,6};
		int target4 = 0;
		
		int [] nums5 = {1};
		int target5 = 0;
		
		System.out.println(searchInsert(nums1, target1));
		System.out.println(searchInsert(nums2, target2));
		System.out.println(searchInsert(nums3, target3));
		System.out.println(searchInsert(nums4, target4));
		System.out.println(searchInsert(nums5, target5));
		
	}
}
