class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;

        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for(String token : tokens){
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(token.equals("-")){
                int e1 = stack.pop();
                int e2 = stack.pop();
                stack.push(e2-e1);
            }else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int e1 = stack.pop();
                int e2 = stack.pop();
                stack.push(e2/e1);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
