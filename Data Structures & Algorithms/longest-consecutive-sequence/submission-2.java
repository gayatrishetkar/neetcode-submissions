class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for(int num : nums) {
            h.add(num);
        }

        int res = 0;
        for(int i = 0; i<nums.length; i++) {
            if(!h.contains(nums[i]-1)) {
                int count = 0;
                int curr = nums[i];
                while(h.contains(curr)){
                    count++;
                    curr++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
