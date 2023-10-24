package leetcode;

import java.util.*;

class TreeNode {
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

public class FindTheLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = q.size();

            for (int i = 0; i < size; ++i) {
                TreeNode current = q.poll();
                max = Math.max(max, current.val);
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }
            result.add(max);
        }
        return result;
    }

}
