import java.util.HashSet;

public class Questions {
    public void deleteDups(LinkedList inputList) {

        Node currentNode = inputList.head;
        Node prevNode = currentNode;
        HashSet<Integer> set = new HashSet<>();
        while (currentNode != null) {
            if (!set.contains(currentNode.value)) {
                set.add(currentNode.value);
                prevNode = currentNode;
            } else if (set.contains(currentNode.value)) {
                prevNode.next = currentNode.next;
                inputList.size--;
            }
            currentNode = currentNode.next;
        }

    }

    public Node nthToLat(LinkedList inputList, int nlast) {
        if (inputList.head != null) {
            Node headNode = inputList.head;
            Node nthLastNode = inputList.head;
            for (int i = 0; i < nlast; i++) {
                headNode = headNode.next;
            }
            while (headNode != null) {
                nthLastNode = nthLastNode.next;
                headNode = headNode.next;
            }
            return nthLastNode;
        }
        return null;
    }

    //ce-16 provided
    /*LinkedList partition(LinkedList ll, int x) {

    }*/
    //ce-16 self
    LinkedList partition(LinkedList ll, int x) {

        Node currNode = ll.head;
        Node tailNode = currNode;
        ll.tail = tailNode;
        while (currNode != null) {
            tailNode.next = currNode.next;
            if (currNode.value < x) {
                ll.tail = tailNode.next;
                currNode.next = ll.head;
                ll.head = currNode;
            } else {
                ll.tail.next = currNode;
                ll.tail = currNode;
            }
            currNode = tailNode.next;
        }
        ll.tail.next = null;
        return ll;
    }

    //ce-17 self
    LinkedList sumLists(LinkedList largeList, LinkedList smallList) {
        LinkedList realSmallList = smallList;
        LinkedList realLargeList = largeList;
        if (smallList.size > largeList.size) {
            realSmallList = largeList;
            realLargeList = smallList;
        }
        Node small = realSmallList.head;
        Node large = realLargeList.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        int result;
        while (small != null) {
            result = carry;
            result = small.value + large.value + result;
            resultLL.insertNode(result % 10);
            carry = result / 10;
            small = small.next;
            large = large.next;
        }
        while (large != null) {
            result = carry;
            result = large.value + result;
            resultLL.insertNode(result % 10);
            carry = result / 10;
            large = large.next;
        }
        if ( carry > 0) {
            resultLL.insertNode(carry);
        }
        return resultLL;
    }

}
