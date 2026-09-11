class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(nums, cur, target, 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> cur, int target, int i) {
        if(target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(target < 0 || i >= nums.length) {
            return;
        }

        cur.add(nums[i]);
        backtrack(nums, cur, target-nums[i], i);
        cur.remove(cur.size()-1);
        backtrack(nums, cur, target, i+1);
    }
}
