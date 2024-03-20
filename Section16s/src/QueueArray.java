public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue= -1;
        System.out.println("Queue created with size : "+size);
    }
    public boolean isFull(){
        if (topOfQueue==arr.length-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (beginningOfQueue == -1 || beginningOfQueue==arr.length){
            return true;
        }else {
            return false;
        }

    }
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = value;
            System.out.println("Inserted value : "+value);
        }else {
            arr[++topOfQueue] = value;
            System.out.println("Inserted value : "+value);
        }
    }
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue>topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }
    public void deleteQueue(){
        arr = null;
        System.out.println("The queue is deleted");
    }
}
