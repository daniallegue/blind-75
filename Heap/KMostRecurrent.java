class Solution {
    //Solution in O(n log k) time
    public int[] topKFrequent(int[] nums, int k) {
        //Use a hash map to store ocurrences
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(var n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        //Set up heap and sort by ocurrences
        var heap = new PriorityQueue<Integer>((a, b) -> Integer.compare(map.get(a), map.get(b)));
        for(var key : map.keySet()){
            heap.offer(key);
            if(heap.size() > k) heap.poll();
        }

        int i = 0;
        while(!heap.isEmpty()){
            ans[i++] = heap.poll();
        }

        return ans;
    }
}