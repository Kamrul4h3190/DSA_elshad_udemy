public class Successor {
    // TODO

    public static TreeNode inorderSucc(TreeNode node){
        if (node==null) return null;
        if (node.right == null) return null;
        return findLeftMost(node.right);
    }

    private static TreeNode findLeftMost(TreeNode node) {
        if (node == null) return null;
        if (node.left !=null){
            while (node.left!=null)
                node= node.left;
        }
        //This part is for max val node grater than provided node
        /*else {
            findLeftMost(node.right);
        }*/
        return node;
    }
}