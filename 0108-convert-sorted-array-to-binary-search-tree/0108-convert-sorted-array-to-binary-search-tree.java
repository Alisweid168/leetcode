/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode helper(int left,int right,int[] nums){
        if(left>right)
            return null;
        int mid=(left+right)/2;
        TreeNode d=new TreeNode(nums[mid]);
        d.left=helper(left,mid-1,nums);
        d.right=helper(mid+1,right,nums);
        return d;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0,nums.length-1,nums);
    }
}