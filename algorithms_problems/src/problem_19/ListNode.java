package problem_19;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ListNode.java
 *
 *	Problem Name : 19_RemoveNthNodeFromEndofList
 *  Definition : Singly-linked list.
 *  
 *  Explanation :
 *  Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *  
 */

public class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
