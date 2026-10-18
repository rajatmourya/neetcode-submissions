class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty()
                    && heights[stack.peek()] >= currentHeight) {

                int top = stack.pop();
                int height = heights[top];

                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }
            if (i < heights.length) {
                stack.push(i);
            }
        }
        return maxArea;
    }
}
