class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            ts.add(nums[i]);
        }
        int i = 0;
        for (int x : ts) {
            nums[i++]  = x;
        }
        return ts.size();
    }
}