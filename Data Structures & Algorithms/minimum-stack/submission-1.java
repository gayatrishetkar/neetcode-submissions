class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val<=minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int top = stack.peek();
        if(top == minStack.peek())
            minStack.pop();

            stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
