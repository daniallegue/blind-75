class Solution {

    public int[] twoSumInON2(int[] nums, int target){
        //Solution in O(n^2)
        int[] output = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] +  nums[j] == target && i != j){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }

    public int[] twoSum(int[] nums, int target){
        //Solution in O(n)
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            //Two Sum found
            if(map.containsKey(diff)){
                output[0] = i;
                output[1] = map.get(diff);
            }
            //Sum not found
            else{
                map.put(nums[i], i);
            }
        }

        return output;
    }
}