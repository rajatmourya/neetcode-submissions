class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));
    
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
