import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphList {

    ArrayList<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();

    public GraphList(ArrayList<GraphNodeList> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNodeList first = nodeList.get(i);
        GraphNodeList second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }
    public void addDirectedEdge(int i, int j) {
        GraphNodeList first = nodeList.get(i);
        GraphNodeList second = nodeList.get(j);
        first.neighbors.add(second);
    }


// For printing Graph to the console

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    s.append((nodeList.get(i).neighbors.get(j).name));
                } else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }


    // BFS internall
    void bfsVisit(GraphNodeList node){
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode+" ");
            for (GraphNodeList neighbor : currentNode.neighbors){
                if (!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }
    void bfs(){
        for (GraphNodeList node : nodeList){
            if (!node.isVisited)
                bfsVisit(node);
        }
    }

    void dfsVisit(GraphNodeList node){
        Stack<GraphNodeList> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNodeList currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            for (GraphNodeList neighbor : currentNode.neighbors){
                if (!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }
    void dfs(){
        for (GraphNodeList node : nodeList){
            if (!node.isVisited)
                dfsVisit(node);
        }
    }
    void topologicalVisit(GraphNodeList node,Stack<GraphNodeList> stack){
        for (GraphNodeList neighbor :
                node.neighbors) {
            if (!neighbor.isVisited){
                topologicalVisit(neighbor,stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }
    void topologicalSort(){
        Stack<GraphNodeList> stack = new Stack<>();
        for (GraphNodeList node :
                nodeList) {
            if (!node.isVisited){
                topologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
    }
    public static void pathPrint(GraphNodeList node){
        if (node.parent!=null)
            pathPrint(node.parent);
        System.out.print(node.name+" ");
    }
    public void BFSForSSSPP(GraphNodeList node){
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNodeList currentNode  = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" : ");
            pathPrint(currentNode);
            System.out.println();
            for (GraphNodeList neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }


}
