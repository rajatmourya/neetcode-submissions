class Solution {
    public int characterReplacement(String s, int k) {
         int maxLen = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
