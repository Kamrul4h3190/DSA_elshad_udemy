
public class Stack {

    //array implementation
    /*int[] arr;
    int topOfStack;
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: "+size);
    }

    public  boolean isEmpty(){
        if (topOfStack==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("The stack is full");
            return true;
        }else {
            return false;
        }
    }
    public void push(int value){
        if (isFull()){
            System.out.println("The stack is full");
        }else{
            arr[++topOfStack] = value;
            //topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            return arr[topOfStack];
        }
    }
    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }*/
    //Linked list implementation
    ;
    LinkedList linkedList;
    public Stack(){
        linkedList = new LinkedList();
    }
    public void push(int value){
        linkedList.insertInLinkedList(value,0);
        System.out.println("Inserted "+value+" in stack");
    }
    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }else {
            return false;
        }
    }
    public int pop(){
        int result =-1;
        if (isEmpty()){
            System.out.println("The stack is Empty");
        }else {
            result  = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is Empty");
            return -1;
        }else {
            return linkedList.head.value;
        }
    }
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }
}
