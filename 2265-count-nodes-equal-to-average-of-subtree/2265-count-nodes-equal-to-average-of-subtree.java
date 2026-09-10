class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        sumSubtree(root);
        return count;
    }

    private int[] sumSubtree(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = sumSubtree(root.left);
        int[] right = sumSubtree(root.right);

        int sum = root.val + left[0] + right[0];
        int nodes = 1 + left[1] + right[1];

        int average = sum / nodes;

        if (root.val == average) {
            count++;
        }

        return new int[]{sum, nodes};
    }
}