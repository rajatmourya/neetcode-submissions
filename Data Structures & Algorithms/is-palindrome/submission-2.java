class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        String newStr = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i==j || i<j){
            while (!Character.isLetterOrDigit(newStr.charAt(i))){
                i++;
                if(i>j || i==j){
                    return true;
                }
            }
            while(!Character.isLetterOrDigit(newStr.charAt(j))){
                j--;
            }

            if(newStr.charAt(i)==newStr.charAt(j)){
                i++;
                j--;
                continue;
            }
            return false;

        }
        return true;
    }
}
