package problem_19;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : RemoveNthNodeFromEndofList.java
 *
 * 	in:	head = [1,2,3,4,5], n = 2 	out: [1,2,3,5]
 * 	in:	head = [1], n = 1 			out: []
 * 	in:	head = [1,2], n = 1		 	out: [1]
 *  
 *  [solved]
 *  Runtime: 1 ms, faster than 17.95%
 *  Memory Usage: 39.3 MB, less than 5.53%
 *  
 */

public class RemoveNthNodeFromEndofList {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		
		slow.next = head;
		
		for(int i=1; i<=n+1; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		return start.next;
    }
	
	private static void printListNode(ListNode head) {
		if(head != null) {
			System.out.print(head.val + " ");
			printListNode(head.next);
		}
	}
	
	public static void main(String[] args) {
		
		ListNode tail = new ListNode(5);
		ListNode node4 = new ListNode(4, tail);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode head = new ListNode(1, node2);
		
		printListNode(head);
		System.out.println();
		
		printListNode(removeNthFromEnd(head, 2));
		
	}
}
