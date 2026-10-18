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

        ancestorOfTree(root,p,l1);
        ancestorOfTree(root,q,l2);
        
        return findNode(root,findLCAValue(l1,l2));
    }
    public TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) return root;

        if (val < root.val) {
            return findNode(root.left, val);
        } else {
            return findNode(root.right, val);
        }
    }

    public int findLCAValue(List<Integer> l1, List<Integer> l2) {
        int i = 0;
        int lca = -1;

        while (i < l1.size() && i < l2.size()) {
            if (l1.get(i).equals(l2.get(i))) {
                lca = l1.get(i);
            } else {
                break;
            }
            i++;
        }
        return lca;
    }


    public boolean ancestorOfTree(TreeNode root, TreeNode x, List<Integer> l) {
        if (root == null) {
            return false;
        }

        l.add(root.val);

        if (root.val == x.val) {
            return true;
        }

        boolean found;
        if (root.val > x.val) {
            found = ancestorOfTree(root.left, x, l);
        } else {
            found = ancestorOfTree(root.right, x, l);
        }

        if (!found) {
            l.remove(l.size() - 1); 
        }

        return found;
    }

}

