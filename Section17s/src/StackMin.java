public class StackMin {

    Node top;

    public StackMin() {
        top = null;
    }

    public StackMin(int value) {
        top = new Node();
        top.value = value;
        top.min = value;
        top.next = null;
    }

    public int min() {
        return top.min;
    }


    public void push(int value) {
        int min;
        if (top == null) {
            top = new Node();
            top.value = value;
            top.min = value;
            top.next = null;
        } else {
            min = top.min;
            if (value < min) {
                min = value;
            }
            Node newNode = new Node();
            newNode.value = value;
            newNode.min = min;
            newNode.next = top;
            top = newNode;
        }

    }

    public int pop() {
        int popped = top.value;
        top = top.next;
        return popped;
    }
}