class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, curr, res, 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> curr,
    List<List<Integer>> res, int i) {

        if(i >= nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        backtrack(nums, curr, res, i+1);
        curr.remove(curr.size() - 1);
        backtrack(nums, curr, res, i+1);
    }
}
