package problem_104;

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
