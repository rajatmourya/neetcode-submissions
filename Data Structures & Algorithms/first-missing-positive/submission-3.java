class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int x: nums){
            ts.add(x);
        }
        int i = 1;
        for(int x:ts){
            if(x>0){
                if(x!=i){
                    break;
                }
                i++;
            }
        }
        return i;
    }
}