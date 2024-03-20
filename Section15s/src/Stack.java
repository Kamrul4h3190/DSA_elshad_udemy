public class Stack {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node top;
    private int height;

    public Stack(int initialValue) {
        this.top = new Node(initialValue);
        this.height = 1;
    }

    // ... Other stack methods (push, pop, etc.) can be implemented later ...
    public void push(int value){
        Node newNode = new Node(value);
        top.next = newNode;
        top = newNode;
        this.height++;
        System.out.println("pushed : "+value);
    }
    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is Empty!");
        }
        else{
            result = top.value;
            top = null;
            height--;
        }
        return result;
    }
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is Empty!");
            return -1;
        }else {
            return top.value;
        }
    }
}

