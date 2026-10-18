class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                return x;
            }
            map.put(x,1);
        }
        return -1;
    }
}
