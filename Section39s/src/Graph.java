import java.util.ArrayList;
//import com.udemy.ucp.*;


public class Graph {


    static ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public enum State {
        Unvisited, Visited, Visiting;
    }

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }



    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

//  Route Between Nodes
    //TODO
    public boolean search(GraphNode start,GraphNode end){
        ArrayList<GraphNode> queue = new ArrayList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            if (currentNode == end){
                //System.out.println("route exists !");
                return true;
            }
            else {
                currentNode.isVisited = true;
                for (GraphNode neighbor : currentNode.neighbors){
                    if (!neighbor.isVisited){
                        queue.add(neighbor);
                        neighbor.isVisited = true;
                        neighbor.parent = currentNode;
                    }
                }
            }
        }
        //System.out.println("route do not exists !");
        return false;
    }



}
