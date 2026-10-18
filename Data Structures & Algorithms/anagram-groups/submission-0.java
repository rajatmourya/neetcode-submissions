class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            if(!temp.contains(strs[i])){
                temp.add(strs[i]);
            }
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    if(isAnagramOptimized(strs[i],strs[j])){
                        temp.add(strs[j]);
                    }
                }
            }
            Collections.sort(temp);
            if(!result.contains(temp)){
                result.add(temp);
            }
        }
        return result;
    }
    public boolean isAnagramOptimized(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
