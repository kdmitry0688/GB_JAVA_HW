
class Task3 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode q, TreeNode p) {
        if (q == null && p == null) {
            return true;
        }
        if (q == null || p == null) {
            return false;
        }
        return q.val == p.val && dfs(q.left, p.right) && dfs(q.right, p.left);
    }
}