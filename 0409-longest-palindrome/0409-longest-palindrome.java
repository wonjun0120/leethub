import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        if(s.length() <= 1) return 1;
        
        Map<Character,Long> hm = s.chars().mapToObj(c-> 
            (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        int result = 0;
        boolean flag = false;
        for (Character key : hm.keySet()) {
            if(hm.get(key) % 2 == 1) flag = true;
            result += (hm.get(key) / 2 * 2);
        }
        if(flag) return result + 1;
        else return result;
    }
}