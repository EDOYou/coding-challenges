package leetcode;

public class ConstructStringFromBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        dfs(t, res);
        return res.toString();
    }

    public static void dfs(TreeNode t, StringBuilder res) {
        if (t == null) return;
        res.append(t.val);
        if (t.left == null && t.right == null) return;
        res.append('(');
        dfs(t.left, res);
        res.append(')');
        if (t.right != null) {
            res.append('(');
            dfs(t.right, res);
            res.append(')');
        }
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        String out = "1(2(4))(3)";

        System.out.println(tree2str(t).equals(out)); // true
    }
}