class Solution {
    public int maxProduct(int[] nums) {
        //Solution in O(n) time and space
        //Examine contiguous subarrays
        int left = 1;
        int right = 1;
        int max =  nums[0];
        //Iterate each sub-array from left and right respectively
        for(int i = 0; i < nums.length; i++){
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= nums[i];
            right *= nums[nums.length - 1 - i];

            max = Math.max(Math.max(left, right), max);
        }

        return max;
    }
}