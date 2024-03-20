public class ValidateBST {

    public static boolean checkBST(TreeNode root){
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean checkBST(TreeNode root, int min, int max){
        if (root==null) return true;
        //if (root.data <= min || root.data >=max) return false;
        if (!(root.data > min && root.data < max)) return false;
        return checkBST(root.left,min, root.data) && checkBST(root.right, root.data, max);
    }
}
    /*
    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if(Math.abs(checkHeight(root.left)-checkHeight(root.right)) >1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int checkHeight(TreeNode root) {
        if(root == null) return -1;
        return 1+Math.max(checkHeight(root.left),checkHeight(root.right));
    }

    */