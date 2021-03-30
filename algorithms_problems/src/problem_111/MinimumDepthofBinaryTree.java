package problem_111;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : MinimumDepthofBinaryTree.java
 *
 * 	in:	root = [3,9,20,null,null,15,7]
 * 	out: 2
 * 	
 * 	in:	root = [2,null,3,null,4,null,5,null,6]
 * 	out: 5
 *  
 *  [solved]
 *  Runtime: 5 ms, faster than 59.91%
 *  Memory Usage: 59.9 MB, less than 59.46%
 *  
 */

public class MinimumDepthofBinaryTree {
	
	public static int minDepth(TreeNode root) {
		
        int dep, depL, depR;
        
        if(root == null) {
        	return 0;
        } else {
	    	depL = minDepth(root.left);
	    	depR = minDepth(root.right);
	    	if(depL == 0 || depR == 0) dep = depL + depR + 1;
	    	else dep = Math.min(depL, depR) + 1;
        }
        
        return dep;
    }
	
	public static void main(String[] args) {
		
		//		3
		//	9		20
		//		  15   7
		
		TreeNode n5 = new TreeNode(7, null, null);
		TreeNode n4 = new TreeNode(15, null, null);
		TreeNode n3 = new TreeNode(20, n4, n5);
		TreeNode n2 = new TreeNode(9, null, null);
		TreeNode n1 = new TreeNode(3, n2, n3);
		
		System.out.println(minDepth(n1));
		
		//		2
		//			3
		//				4
		//					5
		//						6
		
		TreeNode a5 = new TreeNode(6, null, null);
		TreeNode a4 = new TreeNode(5, null, a5);
		TreeNode a3 = new TreeNode(4, null, a4);
		TreeNode a2 = new TreeNode(3, null, a3);
		TreeNode a1 = new TreeNode(2, null, a2);
		
		System.out.println(minDepth(a1));	// 5
		
	}
}
