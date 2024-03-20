public class CheckBalanced {
    //   TODO
    public static int checkHeight(TreeNode root) {
        if(root == null) return -1;
        return 1+Math.max(checkHeight(root.left),checkHeight(root.right));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if(Math.abs(checkHeight(root.left)-checkHeight(root.right)) >1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //provided
    /*public static int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE; // Found error -> pass it back
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }*/
}