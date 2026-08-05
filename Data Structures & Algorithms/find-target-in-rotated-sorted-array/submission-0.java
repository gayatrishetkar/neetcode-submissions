class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        
        while(l<r) {
            int m = (l+r)/2;
            if(nums[m] > nums[r])
                l = m+1;
            else
                r = m;
        }

        int pivot = l;
        int res = binarySearch(nums, target, 0, pivot-1);
        if(res != -1)
            return res;
        
        return binarySearch(nums, target, pivot, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        while(l<=r) {
            int m = (l+r)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m] > target)
                r = m-1;
            else
                l = m+1;
        }
        return -1;
    }
}
