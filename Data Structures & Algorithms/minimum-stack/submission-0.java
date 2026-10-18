class MinStack {
    private Deque<Integer> stack;
    public MinStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.stream().min(Integer::compare).get();
    }
}
