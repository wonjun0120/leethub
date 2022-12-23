class Solution {
    public int pivotIndex(int[] nums) {
        for(int idx = 0; idx < nums.length; idx++){
            int left = 0;
            int right = 0;

            for(int i = 0; i < idx; i++){
                left += nums[i];
            }
            for (int j = idx + 1; j < nums.length; j++){
                right += nums[j];
            }
            // System.out.println(idx + " : left : " + left + " right : " + right);
            if(left == right){
                return idx;
            }
        }
        return -1;
    }
}