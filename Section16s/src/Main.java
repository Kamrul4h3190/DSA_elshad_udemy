public class Main {
    public static void main(String[] args) {

        //Array
        /*QueueArray newQueue = new QueueArray(5);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        int result = newQueue.deQueue();
        System.out.println(result);
        int result1 = newQueue.deQueue();
        System.out.println(result1);*/

        //Array circular Queue
        /*CircularQueue newCQ = new CircularQueue(3);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        System.out.println(newCQ.deQueue());*/

        //Linked list
        QueueLinkedList newQLL  = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        System.out.println(newQLL.peek());
        System.out.println(newQLL.peek());
    }
}