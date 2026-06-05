class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> values = new HashMap<>();
        return climbStairs(n, values);
    }

    public int climbStairs(int n, Map<Integer, Integer> values){
        int total = 0;
        if(n==0 || n==1)
            return 1;

        if(values.containsKey(n))
            total += values.get(n);
        else {
            total += climbStairs(n-1, values)+climbStairs(n-2, values);
            values.put(n,total);
        }
        return total;
    }
}
