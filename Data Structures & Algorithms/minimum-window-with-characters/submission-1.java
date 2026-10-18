class Solution {
    
public String minWindow(String s, String t) {
    if (t.length() > s.length()) return "";

    int m = t.length(), n = s.length();
    int l = 0, r = 0;
    int minLen = Integer.MAX_VALUE, startIdx = -1, count = 0;

    Map<Character, Integer> map = new HashMap<>();

    for (char c : t.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    while (r < n) {
        char c = s.charAt(r);

        if (map.containsKey(c)) {
            if (map.get(c) > 0) count++;
            map.put(c, map.get(c) - 1);
        }

        while (count == m) {
            if (r - l + 1 < minLen) {
                minLen = r - l + 1;
                startIdx = l;
            }

            c = s.charAt(l);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                if (map.get(c) > 0) count--;
            }

            l++;
        }

        r++;
    }

    return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
}

}
