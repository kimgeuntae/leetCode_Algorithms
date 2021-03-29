package problem_111;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : MinimumDepthofBinaryTree.java
 *
 * 	in:	root = [3,9,20,null,null,15,7]
 * 	out: 2
 *  
 *  [solved]
 *  Runtime:
 *  Memory Usage:
 *  
 */

public class MinimumDepthofBinaryTree {
	public static int minDepth(TreeNode root) {
        int dep, depL, depR;
        
        if(root.left == null && root.right == null) {
        	dep = 1;
        } else {
        	depL = minDepth(root.left);
        	depR = minDepth(root.right);
        	if(depL >= depR) dep = depR+1;
        	else dep = depL+1;
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
		
	}
}
