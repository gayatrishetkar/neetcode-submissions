/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        int total = left + right;

        int d = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(total, d);
    }

    public int maxHeight(TreeNode temp) {
        if(temp == null) 
            return 0;
        
        return Math.max(maxHeight(temp.left), maxHeight(temp.right))+1;
    }
}
