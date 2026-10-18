class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n-2;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                        continue;
                    }
            for(int j = i+1;j<n-1;j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                        continue;
                    }
                for(int k = j+1;k<n;k++){
                    if(k > j+1 && nums[k] == nums[k-1]){
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ans.add(temp);
                    }

                }
            }
        }
        return ans;
    }
}