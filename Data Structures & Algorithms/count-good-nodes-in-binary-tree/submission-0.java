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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        goodNodesHelper(root, Integer.MIN_VALUE);
        return count;
    }
    private void goodNodesHelper(TreeNode root, int max) {
        if (root == null) return;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        if(root.left != null) goodNodesHelper(root.left,max);
        if(root.right != null) goodNodesHelper(root.right,max);
    }
}
