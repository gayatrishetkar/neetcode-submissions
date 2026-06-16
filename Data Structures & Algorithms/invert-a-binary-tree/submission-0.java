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
        while(!nodes.isEmpty()){
            TreeNode temp = nodes.poll();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;

            if(temp.left != null){
               nodes.add(temp.left); 
            }
            if(temp.right != null){
               nodes.add(temp.right); 
            }
        }
        return root;
    }
}
