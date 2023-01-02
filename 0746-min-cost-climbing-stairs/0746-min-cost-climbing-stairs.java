class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] steps = new int[cost.length];
        steps[0] = cost[0];
        steps[1] = cost[1];
        
        for(int i = 2; i < steps.length; i++){
            if(steps[i - 2] < steps[i - 1]){
                steps[i] = cost[i] + steps[i - 2];
            } else {
                steps[i] = cost[i] + steps[i - 1];
            }
        }
        
        if(steps[cost.length - 2] < steps[cost.length - 1]) return steps[cost.length - 2];
        else return steps[cost.length - 1];
    }
}