class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0], b[0])
        );
        int[][] res = new int[k][2];

        for(int[] pair : points) {
            minHeap.offer(new int[]{pair[0]*pair[0]+pair[1]*pair[1],
            pair[0], pair[1]});
        }

        for(int i=0; i<k; i++) {
            int[] x = minHeap.poll();
            res[i][0] = x[1];
            res[i][1] = x[2];
        }

        return res;


    }
}
