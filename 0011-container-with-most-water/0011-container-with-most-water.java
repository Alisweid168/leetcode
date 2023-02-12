class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,area=0;
        while(start<end){
            int a=height[start];
            int b=height[end];
            int height2=Math.min(a,b);
            area=Math.max(area,height2*(end-start));
            if(a<b) start++;
            else end--;
        }
        return area;
        
    }
}