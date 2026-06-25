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
    public int goodNodes(TreeNode root) {
        int res = 0;
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, Integer.MIN_VALUE));
        while(!q.isEmpty()){
            Pair<TreeNode, Integer> pair = q.poll();
            TreeNode temp = pair.getKey();
            int x = pair.getValue();
            if(temp.val>=x){
                res++;
            }
            if(temp.left!=null){
                q.add(new Pair<>(temp.left, Math.max(x, temp.val)));
            }
            if(temp.right!=null){
                q.add(new Pair<>(temp.right, Math.max(x, temp.val)));
            }
        }
        return res;
    }
}
