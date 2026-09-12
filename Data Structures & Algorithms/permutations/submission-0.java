class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       backtrack(nums, res, curr, new boolean[nums.length]);
       return res; 
    }

    public void backtrack(int[] nums, List<List<Integer>> res,
    List<Integer> curr, boolean[] pick) {

        if(curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!pick[i]){
        curr.add(nums[i]);
        pick[i]=true;
        backtrack(nums, res, curr, pick);
        curr.remove(curr.size()-1);
        pick[i]=false;
            }
        }
    }
}
