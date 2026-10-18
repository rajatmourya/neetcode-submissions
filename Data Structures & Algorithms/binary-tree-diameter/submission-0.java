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
    private int maxDep = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       diameterOfBinaryTreeHelpper(root);
       return maxDep - 2;
    }
    private int diameterOfBinaryTreeHelpper(TreeNode root){
         if(root==null){
            return 0;
        }
        int l = 1 + diameterOfBinaryTreeHelpper(root.left);
        int r = 1 + diameterOfBinaryTreeHelpper(root.right);

        if((l+r)>maxDep){
            maxDep = l+r;
        }
        return l>r?l:r;
    }
}
