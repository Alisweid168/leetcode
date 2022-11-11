class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> h=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        helper(h,d,nums);
        return h;
    }
    
    
    
    
    public void helper(List<List<Integer>> h,List<Integer> d,int[] nums){
        if(d.size()==nums.length)
            h.add(new ArrayList<>(d));
    
    else 
    {
        for(int i=0;i<=d.size();i++){
            d.add(i,nums[d.size()]);
            helper(h,d,nums);
            d.remove(i);
        }
     }
    }
}