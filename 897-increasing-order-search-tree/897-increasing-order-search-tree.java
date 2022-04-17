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
    TreeNode res = null;
    TreeNode head = null;
    public TreeNode increasingBST(TreeNode root) {
       if(root==null)
           return null;
        increasingBST(root.left);
        if(res==null){
            res = new TreeNode(root.val);
            head = res;
        }
        else{
         res.right = new TreeNode(root.val);
            res = res.right;
        }
        increasingBST(root.right);
        return head;
        
    }
}