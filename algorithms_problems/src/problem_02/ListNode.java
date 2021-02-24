package problem_02;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : ListNode.java
 *
 *	Problem Name : 02_AddTwoNumbers
 *  Definition : Singly-linked list.
 *  
 *  Explanation :
 *  The digits are stored in reverse order, and each of their nodes contains a single digit.
 *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *  
 */

public class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
