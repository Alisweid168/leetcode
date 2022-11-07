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
    
    public int helper(TreeNode root,int f){
        if(root==null && f==0) return 0;
        if(root==null)
            return Integer.MAX_VALUE;
        else if(root.left==null && root.right==null)
            return 1;
        return 1+Math.min(helper(root.left,f+1),helper(root.right,f+1));
        
    }
    
    public int minDepth(TreeNode root) {
    return helper(root,0);
        
    }
}