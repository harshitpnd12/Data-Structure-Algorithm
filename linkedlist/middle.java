import java.io.*;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class middle {
  static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t > 0) {
      String str[] = read.readLine().trim().split(" ");
      int n = str.length;
      Node head = new Node(Integer.parseInt(str[0]));
      Node tail = head;
      for (int i = 1; i < n; i++) {
        tail.next = new Node(Integer.parseInt(str[i]));
        tail = tail.next;
      }
      Solution g = new Solution();
      int ans = g.getMiddle(head);
      System.out.println(ans);
      // printList(head);
      t--;
    }
  }
}

class Solution {
  int getMiddle(Node head) {
    Node current = head;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    count = count / 2;
    current = head;
    for (int i = 0; i < count; i++) {
      current = current.next;
    }
    return current.data;
  }
}
