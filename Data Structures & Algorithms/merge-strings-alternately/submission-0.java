class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer str = new StringBuffer();
        int i = 0;
        int j = 0;
        for(; i<word1.length() && j< word2.length();i++,j++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));

        }
        while(i<=word1.length()-1){
            str.append(word1.charAt(i));
            i++;
        }
        while(j<=word2.length()-1){
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();
    }
}