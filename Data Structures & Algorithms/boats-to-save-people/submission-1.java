class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int l = 0;
        int r = people.length-1;
        while(l<=r){
            if(people[l] + people[r] <= limit){
               r--;
               l++;
            }
            else {
               r--;
            }
            count++;
       }
    return count;
    }      
}