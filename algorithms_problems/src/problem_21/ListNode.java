package problem_21;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ListNode.java
 *
 *	Problem Name : 02_MergeTwoSortedLists
 *  Definition : Singly-linked list.
 *  
 *  Explanation :
 *  Merge two sorted linked lists and return it as a sorted list.
 *  The list should be made by splicing together the nodes of the first two lists.
 *  
 */

public class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
