import java.util.ArrayList;

public class GraphNodeList {
  public String name;
  public int index;
  public boolean isVisited = false;
  public GraphNodeList parent;

  public ArrayList<GraphNodeList> neighbors = new ArrayList<GraphNodeList>();

  public GraphNodeList(String name, int index) {
    this.name = name;
    this.index = index;
  }
}
