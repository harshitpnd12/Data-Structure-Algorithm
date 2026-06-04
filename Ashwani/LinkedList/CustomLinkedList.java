import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class CustomLinkedList {
  public static void main(String[] args) {
    Node head = new Node(10);
    addNodeAfter(head);
    addNodeAfter(head);
    addNodeAfter(head);
    addNodeAfter(head);
    // Node newHead = addNodeBefore(head);
    // addNodeInMiddle(newHead);
    printList(head);
    // head = deleteHeadNode(head);
    head = deleteRandomNode(head, 30);
    System.out.println("Linked List after deletion");
    printList(head);
  }

  public static Node deleteHeadNode(Node head) {
    if (head == null) {
      System.out.println("Linked List is Empty");
    }
    head = head.next;
    return head;
  }

  public static Node deleteRandomNode(Node head, int k) {
    // int length = countLinkedList(head);
    if (head == null) {
      System.out.println("The linked list is empty.");
      return null;
    }

    if (head.data == k) {
      System.out.println("Deleting the head node with value: " + k);
      return head.next;
    }

    Node temp = head;
    Node prev = null;
    while (temp != null && temp.data != k) {
      prev = temp;
      temp = temp.next;
    }
    if (temp == null) {
      return head;
    }
    prev.next = temp.next;
    return head;
  }

  public static void addNodeAfter(Node head) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    System.out.println("Enter the data for node");
    int data = sc.nextInt();
    Node newNode = new Node(data);
    temp.next = newNode;

  }

  public static Node addNodeBefore(Node newHead) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data for node Before");
    int data = sc.nextInt();
    Node newNode = new Node(data);
    newNode.next = newHead;
    newHead = newNode;
    return newHead;
  }

  private static int countLinkedList(Node head) {
    Node temp = head;
    int length = 0;
    while (temp != null) {
      length++;
      temp = temp.next;
    }
    return length;
  }

  public static void addNodeInMiddle(Node head) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data to add in middle");
    int data = sc.nextInt();
    Node newNode = new Node(data);

    int length = countLinkedList(head);

    Node temp = head;

    int middle = length / 2;
    for (int i = 1; i < middle; i++) {
      temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  private static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}
