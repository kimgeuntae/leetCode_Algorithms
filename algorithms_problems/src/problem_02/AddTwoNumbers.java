package problem_02;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : AddTwoNumbers.java
 *
 * 	in:	l1 = [2,4,3], l2 = [5,6,4]				out: [7,0,8]
 * 	in:	l1 = [0], l2 = [0] 						out: [0]
 *  in:	l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] 	out: [8,9,9,9,0,0,0,1]
 *
 *	[solved]
 *  Runtime: 2 ms, faster than 77.52%
 *  Memory Usage: 39 MB, less than 94.91%
 */

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode result = new ListNode();
		ListNode temp = result;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry == 1) {
			
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
			ListNode curNode = new ListNode(sum%10);
			carry = sum / 10;
			
			temp.next = curNode;
			temp = curNode;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			
		}
		
        return result.next;
    }
	
	private static void printListNode(ListNode head) {
		
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		
		System.out.println();
	}
	
	private static ListNode genListNode(int [] nums) {
		
		ListNode head = new ListNode();
		
		for(int num : nums) {
			ListNode newNode = new ListNode(num);
			
			newNode.next = head;
			head = newNode;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		
		int [] nums1_1 = {3,4,2} , nums1_2 = {4,6,5};
		int [] nums2_1 = {9, 9, 9, 9, 9, 9, 9} , nums2_2 = {9, 9, 9, 9};
		
		ListNode listNodeNums1_1 = genListNode(nums1_1);
		ListNode listNodeNums1_2 = genListNode(nums1_2);
		ListNode listNodeNums2_1 = genListNode(nums2_1);
		ListNode listNodeNums2_2 = genListNode(nums2_2);
		
//		printListNode(listNodeNums1_1);
//		printListNode(listNodeNums1_2);
//		printListNode(listNodeNums2_1);
//		printListNode(listNodeNums2_2);
		
		printListNode(addTwoNumbers(listNodeNums1_1, listNodeNums1_2));
		printListNode(addTwoNumbers(listNodeNums2_1, listNodeNums2_2));
		
	}
}
