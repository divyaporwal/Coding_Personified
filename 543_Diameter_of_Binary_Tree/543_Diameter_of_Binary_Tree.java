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
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        maxHeight(root);
        return max;
        
    }
    
    
    public int maxHeight(TreeNode root) {
        
        if(root == null ) {
            return 0;
        }
        
        int lHeight = maxHeight(root.left);
        int rHeight = maxHeight(root.right);
        
        max = Math.max(max,lHeight+rHeight);
        
        return Math.max(lHeight,rHeight) + 1;
        
        
    }
    
}
