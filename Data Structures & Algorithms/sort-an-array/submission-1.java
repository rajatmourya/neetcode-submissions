class Solution {
    public int[] sortArray(int[] nums) {
        boolean flag = false;
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }       
        return nums; 
    }
}