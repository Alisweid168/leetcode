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
    public List<Integer> inorder(List<Integer> r,TreeNode root){
        if(root==null) return r;
        inorder(r,root.left);
        r.add(root.val);
        inorder(r,root.right); 
        return r;
    }   
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r=new ArrayList<>();
        inorder(r,root);   
        return r;
    }
}