class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int temp = 0;
            if(heights[l]>heights[r]){
                temp = heights[r]*(r-l);
                r--;
            }else{
                temp = heights[l]*(r-l);
                l++;
            }
            maxArea = (maxArea>temp)?maxArea:temp;
        }
        return maxArea;
    }
}
