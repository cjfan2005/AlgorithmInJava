package kent.alg.leetcode;
/**
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.
 * @author kentfan
 *
 */
public class MaximumDepthOfBinaryTree {

	/**
	 * Definition for a binary tree node. */
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int depest = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return depest;
    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
