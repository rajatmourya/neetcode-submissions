class Solution {
    public boolean isPalindrome(String s) {
if(s.length()==1){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while(i==j || i<j){
            while (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                if(i>j || i==j){
                    return true;
                }
            }
            while(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
                continue;
            }
            return false;

        }
        return true;
    }
}
