class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prod = 1;
        int zero = 0;
        for(int x: nums){
            if(x == 0){
                zero++;
            }else{
                prod *= x;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (zero == 0) {
                result[i] = prod / nums[i];
            }else{
                if(nums[i] == 0){
                    if(zero > 1){
                        result[i] = 0;
                    }else{
                        result[i] = prod;
                    }
                }else {
                    result[i] = 0;
                }
            }
        }
        return result;
    }
}  
