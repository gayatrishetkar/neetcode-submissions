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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            TreeNode tmp = nodes.poll();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;

            if(tmp.left != null)
                nodes.add(tmp.left);
            
            if(tmp.right != null)
                nodes.add(tmp.right);
        }
        return root;
    }
}
