class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int x = nums[0];
        int maxX = 0;
        for(int i = 0; i<n;i++){
            int count = 0;
            for(int j = 0; j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count > maxX){
                x = nums[i];
                maxX = count;
            }
        }
        if(maxX==0){
            return -1;
        }
        return x;
    }
}