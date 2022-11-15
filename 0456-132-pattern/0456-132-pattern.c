

bool find132pattern(int* nums, int numsSize){
 
  int index=numsSize,m=INT_MIN;
    for(int i=numsSize-1;i>-1;i--){
    if(nums[i]<m)
        return true;
        while(index<numsSize && nums[i]>nums[index])
        {
            m=nums[index];
            index++;
        }
        index--;
        nums[index]=nums[i];
        
        
        }
    return false;
   
}