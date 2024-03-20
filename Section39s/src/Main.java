public class Main {
    public static void main(String[] args) {
        //ce-43
        /*ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));
        nodeList.add(new GraphNode("H",7));
        nodeList.add(new GraphNode("I",8));
        nodeList.add(new GraphNode("J",9));

        Graph graph = new Graph(nodeList);
        graph.addDirectedEdge(4,5);
        graph.addDirectedEdge(5,8);
        graph.addDirectedEdge(4,0);
        graph.addDirectedEdge(0,2);
        graph.addDirectedEdge(0,3);
        graph.addDirectedEdge(0,1);
        graph.addDirectedEdge(2,6);
        graph.addDirectedEdge(6,7);
        graph.addDirectedEdge(6,3);
        graph.addDirectedEdge(1,9);

        GraphNode first = nodeList.get(2);
        GraphNode second = nodeList.get(3);
        System.out.println("route exists : "+graph.search(first,second));*/
        //ce-44,45
        //int[]  array = {-10,-3,0,5,9};
        /*int[]  array = {4,5,7,8,11,12,16}; // BST
        //int[]  array = {4,5,6,8,7,12,16};// not BST
        //int[]  array = {4,5,9,8,7,12,16};// not BST
        //int[]  array = {4,5,3};// Dummy testing
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("root : "+root.data);
        TreeNode node = root.find(array[5]);
        System.out.println("node : "+node.data);
        System.out.println("Successor : "+Successor.inorderSucc(node).data);
        //System.out.println("isValidBSTNode : "+ValidateBST.checkValidBSTNode(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        //System.out.println("isBalanced : "+CheckBalanced.isBalanced(new TreeNode(2)));
        //System.out.println("isValidBST : "+ValidateBST.checkBST(new TreeNode(3)));
        //System.out.println("isValidBST : "+ValidateBST.checkBST(root));*/
        //ce-50
        int[] array = {5, 3, 6, 1, 9, 11};
        TreeNode root = new TreeNode(20);
        for (int a : array) {
            root.insertInOrder(a);
        }
        TreeNode n1 = root.find(1);
        TreeNode n9 = root.find(9);
        TreeNode ancestor = CommonAncestor.commonAncestor(root, n1, n9);
        System.out.println(ancestor.data);
    }
}