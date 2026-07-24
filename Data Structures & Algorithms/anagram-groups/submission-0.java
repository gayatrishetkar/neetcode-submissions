class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String str : strs) {
            char[] arr = new char[26];
            for(char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
