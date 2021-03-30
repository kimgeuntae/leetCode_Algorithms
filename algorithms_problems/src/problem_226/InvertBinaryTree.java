package problem_226;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : InvertBinaryTree.java
 *
 * 	in:	[4,2,7,1,3,6,9] 
 * 	out: [4,7,2,9,6,3,1]
 *  
 *  [solved]
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 36.2 MB, less than 74.57%
 *  
 */

public class InvertBinaryTree {
	
	public static TreeNode invertTree(TreeNode root) {
		
		if(root == null) return null;
		return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
		
	}
	
	private static void inOrder(TreeNode node) {
		
		if(node != null) {
			System.out.print(node.val + " ");
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	
	
	public static void main(String[] args) {
		
		//			4
		//		2		7
		//	  1   3	  6   9
		
		TreeNode n7 = new TreeNode(9, null, null);
		TreeNode n6 = new TreeNode(6, null, null);
		TreeNode n5 = new TreeNode(3, null, null);
		TreeNode n4 = new TreeNode(1, null, null);
		TreeNode n3 = new TreeNode(7, n6, n7);
		TreeNode n2 = new TreeNode(2, n4, n5);
		TreeNode n1 = new TreeNode(4, n2, n3);
		
		inOrder(invertTree(n1));
		
	}
}
