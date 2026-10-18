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
        int min = Integer.MAX_VALUE;

        for (int value : stack) {
            if (value < min) {
                min = value;
            }
        }
        return min;
        // return stack.stream().min(Integer::compare).get();
    }
}
