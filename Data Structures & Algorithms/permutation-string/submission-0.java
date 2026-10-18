class Solution {
    public boolean checkInclusion(String s1, String s2) {
          
        if (s1.length() > s2.length()) return false;
        
        int[] count = new int[26];
        
        // Count characters of s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        
        int left = 0;
        
        for (int right = 0; right < s2.length(); right++) {
            
            // Add right character
            count[s2.charAt(right) - 'a']--;
            
            // If window size exceeds s1 length, remove left char
            if (right - left + 1 > s1.length()) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }
            
            // If all counts are zero → permutation found
            if (allZero(count)) return true;
        }
        
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }
}
