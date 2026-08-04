class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] idx = new int[n][2];
        for(int i=0; i<n; i++) {
            idx[i][0] = position[i];
            idx[i][1] = speed[i];
        }
        Arrays.sort(idx, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> st = new Stack<>();
        for(int[] pair : idx) {
            st.push((double) (target-pair[0])/pair[1]);
            if(st.size() >=2 && st.peek() <= st.get(st.size()-2))
                st.pop();
        }
        return st.size();
    }
}
