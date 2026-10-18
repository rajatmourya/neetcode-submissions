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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1 = ancestorOfTree(root,p,l1);
        l2 = ancestorOfTree(root,q,l2);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        l1.retainAll(l2);
        return new TreeNode(l1.getLast());
    }
        public List<Integer> ancestorOfTree(TreeNode root, TreeNode x,List<Integer> l) {
        l.add(root.val);
        if(root.val==x.val){
            return l;
        }
        if(root==null){
            return null;
        }

        if(root.val>x.val){
            ancestorOfTree(root.left,x,l);
        }else{
            ancestorOfTree(root.right,x,l);
        }
        return l;
    }
}

