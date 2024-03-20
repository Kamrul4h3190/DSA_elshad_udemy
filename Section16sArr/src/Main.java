public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        int result = newQueue.deQueue();
        System.out.println(result);
        int result1 = newQueue.deQueue();
        System.out.println(result1);

    }
}