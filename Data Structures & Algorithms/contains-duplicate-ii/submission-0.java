class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    result = true;
                }
            }
        }
        return result;
    }
}