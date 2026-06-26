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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            TreeNode right = null;

            for(int i=size; i>0; i--){
                TreeNode temp = q.poll();
                if(temp != null){
                    right = temp;
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
            if(right!=null){
                res.add(right.val);
            }
        }
        return res;
    }
}
