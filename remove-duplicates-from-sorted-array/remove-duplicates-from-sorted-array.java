class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=Integer.MAX_VALUE;
                c++;
            }
        }
        Arrays.sort(nums);
        return nums.length-c;
    }
}