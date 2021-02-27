package problem_21;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : MergeTwoSortedLists.java
 *
 * 	in:	l1 = [1,2,4], l2 = [1,3,4] out: [1,1,2,3,4,4]
 * 	in:	l1 = [], l2 = [] out: []
 * 	in:	l1 = [], l2 = [0] out: [0]
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode result = new ListNode();
		ListNode temp = result;
		
		while(l1 != null || l2 != null) {
			if(l2 == null) {
				temp.next = l1;
				temp = l1;
				if(l1 != null) l1 = l1.next;
			} else if(l1 == null) {
				temp.next = l2;
				temp = l2;
				if(l2 != null) l2 = l2.next;
			} else if(l1.val <= l2.val) {
				temp.next = l1;
				temp = l1;
				if(l1 != null) l1 = l1.next;
			} else if(l1.val >= l2.val) {
				temp.next = l2;
				temp = l2;
				if(l2 != null) l2 = l2.next;
			}
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
		ListNode temp = head;
		
		for(int num : nums) {
			ListNode newNode = new ListNode(num);
			
			temp.next = newNode;
			temp = newNode;
		}
		
		return head.next;
	}
	
	public static void main(String[] args) {
		
		int [] l1_1 = {1,2,4}, l1_2 = {1,3,4};
		int [] l2_1 = {}, l2_2 = {};
		int [] l3_1 = {}, l3_2 = {0};
		
		ListNode listNode1_1 = genListNode(l1_1);
		ListNode listNode1_2 = genListNode(l1_2);
		ListNode listNode2_1 = genListNode(l2_1);
		ListNode listNode2_2 = genListNode(l2_2);
		ListNode listNode3_1 = genListNode(l3_1);
		ListNode listNode3_2 = genListNode(l3_2);
		
		printListNode(mergeTwoLists(listNode1_1, listNode1_2));
		printListNode(mergeTwoLists(listNode2_1, listNode2_2));
		printListNode(mergeTwoLists(listNode3_1, listNode3_2));
		
	}
}
