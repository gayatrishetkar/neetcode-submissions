class Solution {
    public int search(int[] nums, int target) {
        return search(0, nums.length-1, nums, target);
    }

    public int search(int l, int r, int[] nums, int target){
        if(l>r)
            return -1;
        int m = l+(r-l)/2;

        if(nums[m]==target)
            return m;
        else{
            return nums[m]>target?search(0, m-1, nums, target):
                            search(m+1, r, nums, target);
        }
    }
}
