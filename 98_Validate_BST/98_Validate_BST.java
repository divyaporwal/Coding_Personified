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
    public boolean isValidBST(TreeNode root) {
        // base condition
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        
        // set up a limit for the max and min
        return helper(root,Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean helper(TreeNode root, double min, double max) {
        
        // base condition
        if(root == null) {
            return true;
        }
        
        // if the roo value is < min or root value > max, return false
        if(root.val <= min || root.val >= max) {
            return false;
        }
        
        // isLeftBST will check for the left subtree
        // isRightBST will check for the right subtree
        // here we keep a check on the min and max values that the
        // root.left and root.right can take.
        
        // for left bst, the max limit on the value is root.val and the min limit would be nothing, so just min
        boolean isLeftBST = helper(root.left, min, root.val);
        // for the right BST, the min limit on the value is root.val and the max limit would be nothing,
        // the max limit would be just the max.
        
        
        boolean isRightBST = helper(root.right, root.val,max);
        
        //  case when the leftBST check would return false
        //  case check when the rightBST check would return false.
        if(!isLeftBST || !isRightBST) {
            return false;
        }
        
        // otherwise return true.
        return true;
    }
}
