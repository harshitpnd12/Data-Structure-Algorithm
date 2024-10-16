import java.util.*;

class printllelement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine(); // Consume newline character after t

    while (t-- > 0) {
      String input = scanner.nextLine(); // Read the entire line for the array elements
      Scanner lineScanner = new Scanner(input);
      Node head = null, tail = null;
      int x;

      // Building the linked list from input
      while (lineScanner.hasNextInt()) {
        x = lineScanner.nextInt();
        if (head == null) {
          head = new Node(x);
          tail = head;
        } else {
          tail.next = new Node(x);
          tail = tail.next;
        }
      }
      lineScanner.close();

      Solution ob = new Solution();
      ob.display(head);
      System.out.println();
    }
    scanner.close();
  }
}

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  void display(Node head) {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}
