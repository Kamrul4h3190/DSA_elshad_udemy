public class Main {
    public static void main(String[] args) {
        DoublyLInkedList dll = new DoublyLInkedList();
        dll.createDLL(1);
        dll.insertDLL(2,0);
        dll.insertDLL(3,1);
        dll.insertDLL(4,7);
        dll.traversDLL();
        dll.deleteDLL();
        dll.traversDLL();
    }

}