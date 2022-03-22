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
    
    int res=0;
    
    int value(TreeNode root) {
        return (root != null)? root.val: 0;
    }
    
    int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.val%2==0){
            if(root.left!=null){
                res+=value(root.left.left)+value(root.left.right);
            }
            if(root.right!=null){
                res+=value(root.right.left)+value(root.right.right);
            }
        }
        sum(root.right);
        sum(root.left);
        return res;
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        sum(root);
        return res;
        
    }
}