public class Exercise {
    public void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
    }
    //ce-18 self
    public Node findIntersection(LinkedList largeList,LinkedList smallList){
        LinkedList realSmallList = smallList;
        LinkedList realLargeList = largeList;
        if (smallList.size > largeList.size) {
            realSmallList = largeList;
            realLargeList = smallList;
        }
        Node small = realSmallList.head;
        Node large = realLargeList.head;
        int skip = realLargeList.size-realSmallList.size;
        for (int i = 0; i < skip; i++) {
            large = large.next;
        }
        /*while (large!=null){
            if (large == small)
                return large;
            large = large.next;
            small = small.next;
        }*/
        //return null;
        while (large!=small){
            large = large.next;
            small = small.next;
        }
        return large;
    }
}
