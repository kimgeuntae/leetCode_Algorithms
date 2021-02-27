package problem_101;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : SymmetricTree.java
 *
 * 	in:	root = [1,2,2,3,4,4,3] out: true
 * 	in:	root = [1,2,2,null,3,null,3] out: false
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class SymmetricTree {
	
	public static boolean isSymmetric(TreeNode root) {
        
		return true;
    }
	
	private static void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.val + " ");
			inOrder(node.right);
		}
	}
	
	private static void reverseOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.right);
			System.out.print(node.val + " ");
			inOrder(node.left);
		}
	}

	public static void main(String[] args) {
		
//			    1
//			2       2
//		  3   4   4   3
		
		TreeNode r4 = new TreeNode(4, null, null);
		TreeNode r3 = new TreeNode(3, null, null);
		TreeNode r2 = new TreeNode(2, r4, r3);
		TreeNode l4 = new TreeNode(4, null, null);
		TreeNode l3 = new TreeNode(3, null, null);
		TreeNode l2 = new TreeNode(2, l3, l4);
		TreeNode n1 = new TreeNode(1, l2, r2);
		
		inOrder(n1);
		
	}
}
