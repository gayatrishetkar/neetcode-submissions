class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty())
            stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        Stack<Integer> min = new Stack<>();

        int val = stack.peek();
        while(!stack.isEmpty()) {
            val = Math.min(val, stack.peek());
            min.push(stack.pop());
        }

        while(!min.isEmpty()) {
            stack.push(min.pop());
        }

        return val;
    }
}
