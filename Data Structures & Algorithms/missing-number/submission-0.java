class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int current_sum = 0;
        for(int num : nums){
            current_sum += num;
        }
        return sum - current_sum;
    }
}
