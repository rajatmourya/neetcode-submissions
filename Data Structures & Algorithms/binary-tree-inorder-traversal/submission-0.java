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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        inorderTraversalHelper(ans,root);

        return ans;
        
    }
    public void inorderTraversalHelper(List<Integer> ans, TreeNode root){
        if(root!=null){
            inorderTraversalHelper(ans,root.left);
            ans.add(root.val);
            inorderTraversalHelper(ans,root.right);
        }
       
    }
}