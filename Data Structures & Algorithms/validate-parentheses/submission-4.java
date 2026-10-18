class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        if(n == 0) return true;
        if(n == 1) return false;

        Deque<Character> stack = new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{' ){
                stack.push(c);
            } else if(!stack.isEmpty()){
                if(c == ')'){
                    if(stack.peek()=='(')
                        stack.pop();
                    else
                        return false;
                }else if(c == '}'){
                    if(stack.peek()=='{')
                        stack.pop();
                    else
                        return false;
                }else if(c == ']'){
                    if(stack.peek()=='[')
                        stack.pop();
                    else
                        return false;
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
