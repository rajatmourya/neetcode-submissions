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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        preorderTraversalHelper(ans,root);

        return ans;
    }
    public void preorderTraversalHelper(List<Integer> ans, TreeNode root){
        if(root!=null){
            ans.add(root.val);
            preorderTraversalHelper(ans,root.left);
            preorderTraversalHelper(ans,root.right);
        }

    }
}