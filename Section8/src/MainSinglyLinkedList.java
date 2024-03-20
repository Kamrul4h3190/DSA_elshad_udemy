class Main {
  public static void main(String[] args) {
    /*SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    // System.out.println(sLL.head.value);
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();*/
    //ce-19 calling
    /*SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.push(5);  // Success
    singlyLinkedList.push(10);
    singlyLinkedList.traverseSinglyLinkedList();
    System.out.println(singlyLinkedList.pop().value);
    singlyLinkedList.traverseSinglyLinkedList();*/
    //ce-21 calling
    /*SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.push(5);  // Success
    singlyLinkedList.push(10);  // Success
    singlyLinkedList.push(15);  // Success
    singlyLinkedList.push(20);  // Success

    System.out.println(singlyLinkedList.insert(12, 2));  // True
    System.out.println(singlyLinkedList.insert(13, 100)); // False
    singlyLinkedList.traverseSinglyLinkedList();*/
    //ce-24 calling
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.push(1);  // Success
    singlyLinkedList.push(2);  // Success
    singlyLinkedList.push(3);  // Success
    singlyLinkedList.push(4);  // Success
    singlyLinkedList.push(5);  // Success

    singlyLinkedList.traverseSinglyLinkedList();
    System.out.println(singlyLinkedList.remove(2).value);
    singlyLinkedList.traverseSinglyLinkedList();
  }
}
