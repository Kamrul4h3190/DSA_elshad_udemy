public class Main {
    public static void main(String[] args) {
        /*LinkedList lla = new LinkedList();
        lla.insertNode(4);
        lla.insertNode(1);
        lla.insertNode(2);
        LinkedList llb = new LinkedList();
        llb.insertNode(6);
        llb.insertNode(1);
        llb.insertNode(9);
        Questions q = new Questions();
        LinkedList result = q.sumLists(lla,llb);
        result.traversalLL();*/
        //ce-18 calling
        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        Exercise ex = new Exercise();
        ex.addSameNode(llA, llB, 7);
        ex.addSameNode(llA, llB, 2);
        ex.addSameNode(llA, llB, 1);
        llA.traversalLL();
        llB.traversalLL();
        Node inter = ex.findIntersection(llA, llB);
        System.out.println(inter.value);
    }
}
