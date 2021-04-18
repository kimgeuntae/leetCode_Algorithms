package problem_199;

import java.util.ArrayList;
import java.util.List;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : BinaryTreeRightSideView.java
 *
 * 	in:	[1,2,3,null,5,null,4] out: [1,3,4]
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class BinaryTreeRightSideView {
	public static List<Integer> rightSideView(TreeNode root) {
		
		List<Integer> temp = new ArrayList<Integer>();
		
		if(root != null) {
			temp.add(root.val);
			if(root.right != null) {
				temp.addAll(rightSideView(root.right));
			} else if(root.left != null) {
				temp.addAll(rightSideView(root.left));
			}
			
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
//				1
//			2		3
//			   5	   4
		
		TreeNode n5 = new TreeNode(5, null, null);
		TreeNode n4 = new TreeNode(4, null, null);
		TreeNode n3 = new TreeNode(3, null, n4);
		TreeNode n2 = new TreeNode(2, null, n5);
		TreeNode n1 = new TreeNode(1, n2, n3);
		System.out.println(rightSideView(n1));
		
		TreeNode r2 = new TreeNode(2, null, null);
		TreeNode r1 = new TreeNode(1, r2, null);
		System.out.println(rightSideView(r1));
		
//			1
//		  2	  3
//	  	4	
		// TODO error_case answer 1,3,4
		TreeNode t4 = new TreeNode(4, null, null);
		TreeNode t3 = new TreeNode(3, null, null);
		TreeNode t2 = new TreeNode(2, null, t4);
		TreeNode t1 = new TreeNode(1, t2, t3);
		System.out.println(rightSideView(t1));
		
	}
}
