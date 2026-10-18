

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int count = 1;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                continue;
            }
            if (nums[i] == nums[i - 1] + 1 ) {
                temp++;
            }else{
                count = Math.max(count,temp);
                temp = 1;
            }
        }
        count = Math.max(count,temp);
        return count;

    }
}
