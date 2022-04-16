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
    // Take int sum as global
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        // If null then skip
        if(root != null){
            convertBST(root.right);   // Traverse the tree to the right
            sum += root.val;          // Update the sum
            root.val = sum;           // Update the value of the current node
            convertBST(root.left);    // Traverse the tree to the left
        }
        
        return root;
    }
}