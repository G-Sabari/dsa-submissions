class Solution {
    public boolean isSubsequence(String s, String t) {

        int left = 0;
        for(int right = 0;right<t.length();right++){
            if(left<s.length()){
                if(s.charAt(left) == t.charAt(right)){
                    left++;
                }
            }
        } 

        if(left == s.length()){
            return true;
        } else{
            return false;
        }
    }
}