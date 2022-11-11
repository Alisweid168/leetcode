class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1])
                nums[i-1]=INT_MAX;
            // cout << nums[i-1];
        }
        
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++){
            if(nums[i]==INT_MAX) c++;
            // cout << nums[i]<<endl;
        }
        
            return nums.size()-c;
    }
};