class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length-1; i++){
            int j = i+1;
           while(temperatures[i] >= temperatures[j] && j < temperatures.length-1){
               j++;
           }
           if(temperatures[i] < temperatures[j]){
               result[i] = j-i;
           }else{
               result[i] = 0;
           }
        }
        return result;
    }
}
