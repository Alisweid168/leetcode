class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) ->map.get(b)- map.get(a));
        
       for(int key: map.keySet()){
           pq.offer(key);
       } 
        
       int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
        
    }
}