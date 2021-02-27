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
		
		printListNode(listNodeNums1_1);
		printListNode(listNodeNums1_2);
		printListNode(listNodeNums2_1);
		printListNode(listNodeNums2_2);
		
		
	}
}
