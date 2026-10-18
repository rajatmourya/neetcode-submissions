class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-count;i++){
            if(nums[i]==val){
                count++;
                int j=i;
                while(j<n-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                i--;
            }
        }
        return n-count;
    }
}