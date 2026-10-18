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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        postorderTraversalHelper(ans,root);

        return ans;

    }
    public void postorderTraversalHelper(List<Integer> ans, TreeNode root){
        if(root!=null){
            postorderTraversalHelper(ans,root.left);
            postorderTraversalHelper(ans,root.right);
            ans.add(root.val);
        }

    }
}