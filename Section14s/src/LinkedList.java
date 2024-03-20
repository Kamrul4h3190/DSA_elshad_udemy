
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    //ce-19 self
  /*public void push(int nodeValue){
    if (head == null) {
      createLL(nodeValue);
      return;
    }
    Node newNode = new Node();
    newNode.value = nodeValue;
    newNode.next = null;
    tail.next = newNode;
    tail = newNode;
    size++;
  }*/
    public void push(int nodeValue) {
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    //ce-19 self
    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }

        Node tempNode = head;
        for (int i = 0; i < size - 1; i++) {
            tempNode = tempNode.next;
        }
        Node popped = tempNode;
        if (tempNode == head) {
            tail = head = null;
            size--;
        }
        tempNode.next = null;
        tail = tempNode;
        size--;
        //System.out.println("removed node : "+popped.value);
        return popped;

    }

    /*public Node pop() {
      if (head == null) {
        System.out.println("The SLL does not exist");
        return null;
      }
      Node removeNode;
      Node currentNode = null;
      if (head == tail) {
        removeNode = head;
        head = tail = null;
      } else {
        currentNode = head;
        while (currentNode.next != tail) {
          currentNode = currentNode.next;
        }
        removeNode = currentNode.next;
        currentNode.next = null;
        tail = currentNode;
      }
      size--;

      return currentNode;

    }*/
    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //ce-21 self
    public boolean insert(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (location > size) {
            return false;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location == size - 1) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
        return true;
    }

    // SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node

    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found! ");
        return false;
    }

    //ce-22 self
    public Node get(int index) {
        if (index >= size)
            return null;
        int n = 0;
        Node head2 = head;
        while (n < index) {
            head2 = head2.next;
            n++;
        }
        return head2;
    }


    //Deleting a node from SinglyLinkedList
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    //ce-25 self
    public Node remove(int index) {
        if (index<0 || index>= size)
            return null;
        Node deletedNode = new Node();
        Node currNode = head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        deletedNode = currNode;
        deletionOfNode(index);
        return deletedNode;
    }
    //ce-23 self
    public String rotate(int number) {
        if (number == 0 || number >= size-1) {
            return "No rotation";
        }
        //Node nextHead;
        Node currNode = head;
        for (int i = 0; i < number; i++) {
            Node newNode = new Node();
            newNode.value = currNode.value;
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
            size++;
            deletionOfNode(0);


            currNode = currNode.next;
        }
        return "Success";
    }
    //ce-24 self
    public boolean set(int index, int value) {
        if (index<0 || index>= size)
            return false;
        Node currNode = head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        currNode.value = value;
        return true;
    }
    //  Delete Entire SinglyLinkedList
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");

    }

}
