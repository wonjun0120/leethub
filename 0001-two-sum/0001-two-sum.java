class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();
        int[] result = new int[2];
            
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                result[0] = hm.get(nums[i]);
                result[1] = i;
                return result;
            }
            int key = target - nums[i];
            hm.put(key, i);
        }
        return result;
    }
}