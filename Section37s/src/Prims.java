import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    ArrayList<WeightedNode> nodeList  = new ArrayList<>();

    public Prims(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }
    public void addWeightedUndirectedEdge(int i,int j, int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second,d);
        second.weightMap.put(first,d);
    }
    void prims(WeightedNode node){
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }
        node.distance = 0;
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors){
                if (queue.contains(neighbor)){
                    if (neighbor.distance > currentNode.weightMap.get(neighbor)){
                        neighbor.distance = currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node : "+nodeToCheck+", distance : "+nodeToCheck.distance+", Parent : "+nodeToCheck.parent);
            cost+=nodeToCheck.distance;
        }
        System.out.println("\n Total cost of MST: "+cost);
    }
}
