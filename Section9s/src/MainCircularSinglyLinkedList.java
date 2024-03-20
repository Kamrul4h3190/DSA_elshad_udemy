class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCSSL(5);
    csll.inserCSLL(4,0);
    csll.inserCSLL(6,1);
    csll.inserCSLL(7,8);
    csll.traversCSLL();
    csll.deleteCSLL();
    csll.traversCSLL();
  }
}
