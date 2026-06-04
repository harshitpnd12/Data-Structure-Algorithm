class LinkedList {

  public static void main(String args[]) {
    LinkedList list = new LinkedList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.printList();
  }

  Node head;

  // add node at last
  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  // print the linked list
  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    System.out.println("null");
  }
}

// Node Class
class Node {
  int data;
  Node next;

  // constructor
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}