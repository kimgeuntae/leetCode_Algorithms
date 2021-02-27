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
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 37.3 MB, less than 40.16%
 *  
 */

public class SymmetricTree {
	
	public static boolean isSymmetric(TreeNode root) {
		return isSymmetric(root.left, root.right);
    }
	
	private static boolean isSymmetric(TreeNode l1, TreeNode r1) {
		
		if(l1 == null || r1 == null) return (l1 == r1);
		
		if(l1.val == r1.val) {
			if(!isSymmetric(l1.left, r1.right)) return false;
			if(!isSymmetric(l1.right, r1.left)) return false;
		} else return false;
		
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
		
		System.out.println(isSymmetric(n1));
		
//				1
//			2		2
//		  0   3   0   3
		
		TreeNode t7 = new TreeNode(3, null, null);
		TreeNode t6 = new TreeNode(0, null, null);
		TreeNode t5 = new TreeNode(2, t6, t7);
		TreeNode t4 = new TreeNode(3, null, null);
		TreeNode t3 = new TreeNode(0, null, null);
		TreeNode t2 = new TreeNode(2, t3, t4);
		TreeNode t1 = new TreeNode(1, t2, t5);
		
		System.out.println(isSymmetric(t1));
		
	}
}
