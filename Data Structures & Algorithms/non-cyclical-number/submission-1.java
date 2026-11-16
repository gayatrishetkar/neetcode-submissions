class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hashset = new HashSet<>();

        while(!hashset.contains(n)) {
            hashset.add(n);
            int sq = cal(n);
            if(sq == 1)
                return true;
            
            n = sq;
        }
        return false;
    }

    public int cal(int n) {
        int output = 0;
        
        while(n > 0) {
            int a = n%10;
            output += a*a;
            n /= 10;
        }
        return output;
    }
}
