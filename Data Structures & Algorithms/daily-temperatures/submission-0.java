class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Deque<Integer> stack = new ArrayDeque<>();
       int[] res = new int[temperatures.length];

       for(int i=0; i<temperatures.length; i++) {
        int t = temperatures[i];
        while(!stack.isEmpty() && t>temperatures[stack.peek()]) {
            res[stack.peek()] = i-stack.peek();
            stack.pop();
        }
        stack.push(i);
       }
       return res; 
    }
}
