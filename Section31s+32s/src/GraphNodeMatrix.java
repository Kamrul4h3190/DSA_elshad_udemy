public class GraphNodeMatrix {
    public String name;
    public int index;
    public boolean isVisited = false;
    public GraphNodeMatrix parent;
    public GraphNodeMatrix(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
