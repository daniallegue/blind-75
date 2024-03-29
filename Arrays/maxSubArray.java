class Solution {
    public int maxSubArray(int[] nums) {
        //Solution in O(1) space and O(n) time
        //Kadane's Algorithm
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            //If sum is negative, set to 0
            sum = Math.max(0, sum);
        }

        return max;
    }
}