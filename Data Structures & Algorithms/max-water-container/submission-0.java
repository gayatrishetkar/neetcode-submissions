class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n-1;

        int maxArea = Integer.MIN_VALUE;
        while(l<r) {
            int a = r-l;
            int b = Math.min(heights[l], heights[r]);

            int area = a*b;
            maxArea = Math.max(maxArea, area);

            if(heights[l]>heights[r]) r--;
            else l++;
        }
        return maxArea;
    }
}
