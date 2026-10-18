class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder temp = new StringBuilder();
        temp.append(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            int len=Math.min(temp.length(),strs[i].length());
            if(len==0){
                return "";
            }
            for (int j = 0; j < len; j++) {
                if(temp.charAt(j)!=strs[i].charAt(j)){
                    if(j==0){
                        return "";
                    }
                    String str = temp.substring(0,j);
                    temp.setLength(0);
                    temp.append(str);
                    break;
                }
                if(j==len-1 && temp.length()>len){
                    String str = temp.substring(0,j+1);
                    temp.setLength(0);
                    temp.append(str);
                }
            }
        }
        return temp.toString();
    }
}