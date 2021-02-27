package problem_100;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : SameTree.java
 *
 * 	in:	p = [1,2,3], q = [1,2,3] out: true
 * 	in:	p = [1,2], q = [1,null,2] out: false
 * 	in:	p = [1,2,1], q = [1,1,2] out: false
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class SameTree {
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        
		return true;
    }
	
	private static void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.val + " ");
			inOrder(node.right);
		}
	}
	
	private static void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.val + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	private static void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.val + " ");
		}
	}
	
	public static void main(String[] args) {
		
//				1
//			3      2
//		 5     4
		
		TreeNode n5 = new TreeNode(5, null, null);
		TreeNode n4 = new TreeNode(4, null, null);
		TreeNode n3 = new TreeNode(3, n5, n4);
		TreeNode n2 = new TreeNode(2, null, null);
		TreeNode n1 = new TreeNode(1, n3, n2);
		
		postOrder(n1);
		System.out.println();
		preOrder(n1);
		System.out.println();
		inOrder(n1);
		
	}
}
