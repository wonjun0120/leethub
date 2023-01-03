// 다시 풀기
class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> result = new ArrayList();
        
//         if(s == p){
//             result.add(0);
//             return result;
//         }
        
//         Map<String, Long> pCharCount = p.chars().mapToObj(c -> Character.toString((char) c))
//             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
//         for(int i = 0; i < s.length() - p.length() + 1; i++){
//             String subStr = s.substring(i, i + p.length());
            
//             Map<String, Long> sCharCount = subStr.chars().mapToObj(c -> Character.toString((char) c))
//                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            
//             if(sCharCount.equals(pCharCount)) result.add(i);
//         }
        
//         return result;
        
//     }
    public List<Integer> findAnagrams(String s, String p) {
        //1. sliding window
        List<Integer> result = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        int[] map = new int[26];
        for (int i = 0; i < len2; i++) {
            map[p.charAt(i)-'a']++;
        }
        int start = 0;
        for (int i = 0; i < len1; i++) {
            map[s.charAt(i)-'a']--;
            if(i-start >= len2){
                map[s.charAt(start++)-'a']++;
            }
            if(isAllZero(map)){
                result.add(start);
            }
        }
        return result;
    }

    private boolean isAllZero(int[] map){
        for (int i = 0; i <map.length ; i++) {
            if(map[i] != 0) return false;
        }
        return true;
    }
}