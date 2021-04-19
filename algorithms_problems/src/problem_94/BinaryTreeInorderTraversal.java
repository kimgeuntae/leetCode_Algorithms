package problem_94;

import java.util.ArrayList;
import java.util.List;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : BinaryTreeInorderTraversal.java
 *
 * 	in:	[1,null,2,3] out: [1,3,2]
 *  
 *  [solved]
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 37.4 MB, less than 30.27%
 *  
 */

public class BinaryTreeInorderTraversal {
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> temp = new ArrayList<Integer>();
		
		if(root != null) {
			temp.addAll(inorderTraversal(root.left));
			temp.add(root.val);
			temp.addAll(inorderTraversal(root.right));
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		TreeNode n3 = new TreeNode(3, null, null);
		TreeNode n2 = new TreeNode(2,  n3, null);
		TreeNode n1 = new TreeNode(1, null, n2);
		
		System.out.println(inorderTraversal(n1));
	}
}
