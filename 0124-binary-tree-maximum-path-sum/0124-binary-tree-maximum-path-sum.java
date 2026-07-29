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
    int maxsum=Integer.MIN_VALUE;
    
    public int dfs(TreeNode root){
      if(root==null){
        return 0;
      }
      int leftheight=Math.max(0,dfs(root.left));
      int rightheight=Math.max(0,dfs(root.right));

      maxsum=Math.max(maxsum,root.val+leftheight+rightheight);

      return root.val+Math.max(leftheight,rightheight);
    }

    public int maxPathSum(TreeNode root) {
       dfs(root);
       return maxsum; 
    }
}