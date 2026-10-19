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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeHelper(root);
        return ans;
    }
    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = diameterOfBinaryTreeHelper(root.left);
        int rightHeight = diameterOfBinaryTreeHelper(root.right);
        int currDia = leftHeight + rightHeight;
        ans = Math.max(ans, currDia);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
