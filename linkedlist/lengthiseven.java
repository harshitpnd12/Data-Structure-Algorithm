import java.io.*;

class lengthiseven {
  static Node insert(Node head, int data) {
    Node temp = new Node(data);
    if (head == null) {
      head = temp;
      return head;
    } else {
      Node t = head;
      while (t.next != null) {
        t = t.next;
      }
      t.next = temp;
    }
    return head;
  }

  static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {

      Node head = null;

      String str[] = read.readLine().trim().split(" ");
      int listSize = str.length;
      for (int i = 0; i < listSize; i++) {
        head = insert(head, Integer.parseInt(str[i]));
      }
      boolean f = new Solution().isLengthEven(head);

      System.out.println(f ? "true" : "false");
    }
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Solution {
  public boolean isLengthEven(Node head) {
    int count = 0;
    Node current = head;
    while (current != null) {
      count++;
      current = current.next;
    }

    return count % 2 == 0;
  }
}
