public class Main {
    public static void main(String[] args) {

        QueueLinkedList newQLL  = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        System.out.println(newQLL.peek());
        System.out.println(newQLL.peek());
    }
}