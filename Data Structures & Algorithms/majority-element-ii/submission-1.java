class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int x = 0;
        int y = 0;
        int countX = 0;
        int countY = 0;
        for(int num: nums){
            if(num == x && countX > 0){
                countX++;
            }else if(num == y && countY > 0){
                countY++;
            }else if(countX == 0){
                x = num;
                countX = 1;
            }else if(countY == 0){
                y = num;
                countY = 1;
            }else{
                countX--;
                countY--;
            }

        }

        int ac1 = 0;
        int ac2 = 0;

        for(int num:nums){
            if(countX > 0 && num == x) ac1++;
            if(countY > 0 && num == y) ac2++;
        }
            if(ac1>n/3) ans.add(x);
            if(ac2>n/3) ans.add(y);
        return ans;
    }
}