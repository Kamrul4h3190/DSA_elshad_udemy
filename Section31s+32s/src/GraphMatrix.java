import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphMatrix {
    ArrayList<GraphNodeMatrix> nodeList = new ArrayList<GraphNodeMatrix>();
    int[][] adjacencyMatrix;

    public GraphMatrix(ArrayList<GraphNodeMatrix> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get Neighbors
    public ArrayList<GraphNodeMatrix> getNeighbors(GraphNodeMatrix node) {
        ArrayList<GraphNodeMatrix> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }


    void bfsVisit(GraphNodeMatrix node) {
        LinkedList<GraphNodeMatrix> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeMatrix currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNodeMatrix> neighbors = getNeighbors(currentNode);
            for (GraphNodeMatrix neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNodeMatrix node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNodeMatrix node) {
        Stack<GraphNodeMatrix> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNodeMatrix currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNodeMatrix> neighbors = getNeighbors(currentNode);
            for (GraphNodeMatrix neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }

        }
    }

    void dfs() {
        for (GraphNodeMatrix node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

    void topologicalVisit(GraphNodeMatrix node, Stack<GraphNodeMatrix> stack) {
        ArrayList<GraphNodeMatrix> neighbors = getNeighbors(node);
        for (GraphNodeMatrix neighbor :
                neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort() {
        Stack<GraphNodeMatrix> stack = new Stack<>();
        for (GraphNodeMatrix node :
                nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }

    public static void pathPrint(GraphNodeMatrix node) {
        if (node.parent != null)
            pathPrint(node.parent);
        System.out.print(node.name + " ");
    }

    public void BFSForSSSPP(GraphNodeMatrix node) {
        LinkedList<GraphNodeMatrix> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeMatrix currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " : ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<GraphNodeMatrix> neighbors = getNeighbors(currentNode);
            for (GraphNodeMatrix neighbor :
                    neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }
}
