class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length;
        
        while(left < right){
            int mid = (left + right) / 2;
            // System.out.println(left + " : " + right + " : " + mid);
            
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
