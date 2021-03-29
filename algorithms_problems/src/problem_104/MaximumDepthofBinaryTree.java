package problem_104;

/*	
 * 	Name: Kim Geuntae
 * 	Github: https://github.com/kimgeuntae/leetCode_Algorithms
 * 	FileName : MaximumDepthofBinaryTree.java
 *
 * 	in:	root = [3,9,20,null,null,15,7]
 * 	out: 3
 *  
 *  [solved]
 *  Runtime: 0 ms, faster than 100.00%
 *  Memory Usage: 39.4 MB, less than 17.31%
 *  
 */

public class MaximumDepthofBinaryTree {
	public static int maxDepth(TreeNode root) {
        int dep, depL, depR;
        
        if(root == null) {
        	dep = 0;
        } else {
        	depL = maxDepth(root.left);
        	depR = maxDepth(root.right);
        	if(depL >= depR) dep = depL+1;
        	else dep = depR+1;
        }
        
        return dep;
    }
	
	public static int depthNum(TreeNode root) {
		int num;
		
		if(root == null) {
			return 0;
		} else {
			num = depthNum(root.left) + depthNum(root.right);
		}
		
		return num+1;
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
		
		System.out.println(maxDepth(n1));
		
	}
}
