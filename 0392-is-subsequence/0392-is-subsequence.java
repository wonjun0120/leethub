class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        
        int sIdx = 0;
        for(int i = 0; i < t.length(); i ++){
            if(sIdx >= s.length()){
                return true;
            }
            if(s.charAt(sIdx) == t.charAt(i)){
                if(s.length() == 1){
                    return true;
                }
                sIdx++;
            }
        }
        if(sIdx == s.length()){
            return true;
        }

        return false;
    }
}