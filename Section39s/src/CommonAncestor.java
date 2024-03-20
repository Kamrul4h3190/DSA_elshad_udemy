import java.util.ArrayList;

public class CommonAncestor {
    public static TreeNode commonAncestor(TreeNode root,TreeNode left, TreeNode right){
        /*boolean rihgtToAncestor = false;
        TreeNode ancestor;
        while (!rihgtToAncestor){
            while (left.right==null){
                left = left.parent;
            }
            ancestor = left;
            while (true){
                if (left==right) return ancestor;
                left = left.right;
                if (left == right){
                    rihgtToAncestor = true;
                    break;
                }
                if (left == null){
                    left = ancestor;
                    left = left.parent;
                    //ancestor = ancestor.parent;
                }
            }
        }
        return left;*/
        //System.out.println("root.height : "+root.height());

        ArrayList<TreeNode> leftPath = CommonAncestor.pathTracking(left);
        ArrayList<TreeNode> rightPath = CommonAncestor.pathTracking(right);
        for (int i = 0; i < Math.max(leftPath.size(),rightPath.size()); i++) {
            if (leftPath.get(i) != rightPath.get(i))
                return leftPath.get(i-1);
        }
        return null;
    }

    public static ArrayList<TreeNode> pathTracking(TreeNode node){
        ArrayList<TreeNode> path = new ArrayList<>();
        while (node!=null){
            path.addFirst(node);
            node = node.parent;
        }
        return path;
    }
}
