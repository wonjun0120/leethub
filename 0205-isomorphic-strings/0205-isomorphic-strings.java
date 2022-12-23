import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Character> dict1 = new HashMap();
        HashMap<Character, Character> dict2 = new HashMap();
        
        for(int i = 0; i < s.length(); i ++){
            if(dict1.containsKey(s.charAt(i))){
                if(dict1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            } else {
                dict1.put(s.charAt(i), t.charAt(i));
            }
        }
        
        for(int i = 0; i < t.length(); i ++){
            if(dict2.containsKey(t.charAt(i))){
                if(dict2.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            } else {
                dict2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}