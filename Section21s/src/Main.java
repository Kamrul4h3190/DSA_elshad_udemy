public class Main {
    public static void main(String[] args) {
        /*TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffe = new TreeNode("coffe");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffe);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));*/
        /*BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.value="N1";
        BinaryNode N2 = new BinaryNode();
        N2.value="N2";
        BinaryNode N3 = new BinaryNode();
        N3.value="N3";
        BinaryNode N4 = new BinaryNode();
        N4.value="N4";
        BinaryNode N5 = new BinaryNode();
        N5.value="N5";
        BinaryNode N6 = new BinaryNode();
        N6.value="N6";
        BinaryNode N7 = new BinaryNode();
        N7.value="N7";
        BinaryNode N8 = new BinaryNode();
        N8.value="N8";
        BinaryNode N9 = new BinaryNode();
        N9.value="N9";

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;
        binaryTree.root=N1;

        //binaryTree.preOrder(binaryTree.root);
        //binaryTree.inOrder(binaryTree.root);
        //binaryTree.postOder(binaryTree.root);
        //binaryTree.levelOrder();
        //binaryTree.search("N0");
        //binaryTree.insert("N10");
        binaryTree.levelOrder();
        binaryTree.deleteBT();
        binaryTree.levelOrder();*/
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");
        //newBinaryTree.preOrder(1);
        //newBinaryTree.inOrder(1);
        //newBinaryTree.postOrder(1);
        //newBinaryTree.levelOrder();
        //newBinaryTree.search("N5");
        //newBinaryTree.delete("N5");
        //newBinaryTree.levelOrder();
        newBinaryTree.deleteBT();
    }
}