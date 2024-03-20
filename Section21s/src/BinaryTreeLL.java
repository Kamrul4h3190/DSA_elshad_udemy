import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void postOder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOder(node.left);
        postOder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        if (root == null) {
            System.out.println("BT is empty");
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        System.out.println();
    }

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value-" + value + " found in tree");
            } else {
                if (presentNode.left != null)
                    queue.add(presentNode.left);
                if (presentNode.right != null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println("The value-" + value + " not found in tree");
    }

    void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted newNode at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            }
            if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
        return presentNode;
    }
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode,presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left== null){
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value==value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            }else {
                if (presentNode.left!=null) queue.add(presentNode.left);
                if (presentNode.right!=null) queue.add(presentNode.right);
            }
        }
        System.out.println("node does not exist int BT");
    }
    void deleteBT(){
        root.value = null;
        root.left = null;
        root.right = null;
        System.out.println("BT deleted successfully");
    }
}
