/* 
102. Binary Tree Level Order Traversal

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
*/
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
//using queue...as every root node will be pushed to queue and it left and right child will be added on end...
//and then first element of queue is added to inner list
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        if (root!=null){
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> inlist = new ArrayList<>();
                int count = queue.size();
                for(int i=0;i<count;i++){
                    TreeNode temp= queue.poll();
                    inlist.add(temp.val);
                    if(temp.left!=null)
                        queue.add(temp.left);
                    
                    if(temp.right!=null)
                        queue.add(temp.right);
                    
                }
                list.add(inlist);
            }
        }
        return list;
    }
}