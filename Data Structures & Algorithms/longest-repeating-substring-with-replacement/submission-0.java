class Solution {
    public int characterReplacement(String s, int k) {
        
        int res = 0;
        for(int i=0; i<s.length(); i++) {
            int freq = 0;
            HashMap<Character, Integer> map = new HashMap<>();

            for(int j=i; j<s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);

                freq = Math.max(freq, map.get(s.charAt(j)));
                if((j-i+1)-freq <= k) {
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
}
