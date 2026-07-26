class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num : nums) {
            store.add(num);
        }
        
        int res = 0;
        for(int num : nums) {
            int count = 0; int curr = num;

            while(store.contains(curr)) {
                count++;
                curr++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
