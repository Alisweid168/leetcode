    class Solution {
        public int singleNumber(int[] nums) {
           Map<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int count = mp.getOrDefault(nums[i], 0);
                mp.put(nums[i], count + 1);
            }
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if(count==1) return element;
        }
        return 0;
        }
    }