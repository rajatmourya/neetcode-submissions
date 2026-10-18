class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return searchHelper(nums, target, 0,n-1);
    }
    public int searchHelper(int[] nums, int target,int l, int r) {
        if(l>r) return -1;

        int mid = l + (r - l) / 2;

        if(nums[mid]==target){
            return mid;
        }
        
        if(nums[mid]>target){
            return searchHelper(nums,target,l,mid-1);
        }else{
            return searchHelper(nums,target,mid+1,r);
        }
    }
}
