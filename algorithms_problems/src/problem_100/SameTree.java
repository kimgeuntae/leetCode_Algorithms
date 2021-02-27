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
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 36.4 MB, less than 66.96%
 *  
 */

public class SameTree {
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return (p == q);
        
        if(p.val == q.val) {
        	if(!isSameTree(p.left, q.left)) return false;
        	if(!isSameTree(p.right, q.right)) return false;
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
		
//			1
//		  2   3
		
		TreeNode p3 = new TreeNode(3, null, null);
		TreeNode p2 = new TreeNode(2, null, null);
		TreeNode p1 = new TreeNode(1, p2, p3);
		
		TreeNode q3 = new TreeNode(3, null, null);
		TreeNode q2 = new TreeNode(2, null, null);
		TreeNode q1 = new TreeNode(1, q2, q3);
		
		TreeNode w2 = new TreeNode(2, null, null);
		TreeNode w1 = new TreeNode(1, w2, null);
		
		inOrder(p1);
		System.out.println();
		inOrder(q1);
		System.out.println();
		
		System.out.println(isSameTree(p1, q1));
		System.out.println(isSameTree(p1, w1));

	}
}
