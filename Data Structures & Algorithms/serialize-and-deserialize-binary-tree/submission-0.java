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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "*";
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("#");
        sb.append(serialize(root.left));
        sb.append("#");
        sb.append(serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    int index;
    public TreeNode deserialize(String data) {
                if (data == null || data.isEmpty()) {
            return null;
        }
        String[] str = data.split("#");
        index = 0;
        return dfs(str);
    }
    
    private TreeNode dfs(String[] str) {
        if (index >= str.length || str[index].equals("*")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(str[index++]));

        root.left = dfs(str);
        root.right = dfs(str);

        return root;
    }
}
