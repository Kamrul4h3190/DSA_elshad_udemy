import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<GraphNodeList> nodeList = new ArrayList<>();
        nodeList.add(new GraphNodeList("A",0));
        nodeList.add(new GraphNodeList("B",1));
        nodeList.add(new GraphNodeList("C",2));
        nodeList.add(new GraphNodeList("D",3));
        nodeList.add(new GraphNodeList("E",4));
        nodeList.add(new GraphNodeList("F",5));
        nodeList.add(new GraphNodeList("G",6));

        GraphList g  = new GraphList(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(1,3);
        g.addUndirectedEdge(1,6);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(2,4);
        g.addUndirectedEdge(3,5);
        g.addUndirectedEdge(4,5);
        g.addUndirectedEdge(5,6);

        g.BFSForSSSPP(nodeList.get(0));*/
        ArrayList<GraphNodeMatrix> nodeList = new ArrayList<>();
        nodeList.add(new GraphNodeMatrix("A",0));
        nodeList.add(new GraphNodeMatrix("B",1));
        nodeList.add(new GraphNodeMatrix("C",2));
        nodeList.add(new GraphNodeMatrix("D",3));
        nodeList.add(new GraphNodeMatrix("E",4));
        nodeList.add(new GraphNodeMatrix("F",5));
        nodeList.add(new GraphNodeMatrix("G",6));

        GraphMatrix g  = new GraphMatrix(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(1,3);
        g.addUndirectedEdge(1,6);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(2,4);
        g.addUndirectedEdge(3,5);
        g.addUndirectedEdge(4,5);
        g.addUndirectedEdge(5,6);

        g.BFSForSSSPP(nodeList.get(0));
        /*ArrayList<GraphNodeMatrix> nodeList = new ArrayList<>();
        nodeList.add(new GraphNodeMatrix("A",0));
        nodeList.add(new GraphNodeMatrix("B",1));
        nodeList.add(new GraphNodeMatrix("C",2));
        nodeList.add(new GraphNodeMatrix("D",3));
        nodeList.add(new GraphNodeMatrix("E",4));
        nodeList.add(new GraphNodeMatrix("F",5));
        nodeList.add(new GraphNodeMatrix("G",6));
        nodeList.add(new GraphNodeMatrix("H",7));

        GraphMatrix g  = new GraphMatrix(nodeList);
        g.addDirectedEdge(0,2);
        g.addDirectedEdge(2,4);
        g.addDirectedEdge(4,7);
        g.addDirectedEdge(4,5);
        g.addDirectedEdge(5,6);
        g.addDirectedEdge(1,2);
        g.addDirectedEdge(1,3);
        g.addDirectedEdge(3,5);
        System.out.println(g.toString());


        g.topologicalSort();*/
    }
}
