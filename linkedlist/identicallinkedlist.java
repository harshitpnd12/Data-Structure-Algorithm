import java.io.*;

class identicallinkedlist {

  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(read.readLine());
    while (T-- > 0) {

      String str[] = read.readLine().trim().split(" ");
      int n = str.length;

      Node num1 = new Node(Integer.parseInt(str[0]));
      Node tail = num1;
      for (int i = 1; i < n; i++) {
        int val = Integer.parseInt(str[i]);
        tail.next = new Node(val);
        tail = tail.next;
      }

      String str2[] = read.readLine().trim().split(" ");
      int m = str2.length;

      Node num2 = new Node(Integer.parseInt(str2[0]));
      tail = num2;
      for (int i = 1; i < m; i++) {

        tail.next = new Node(Integer.parseInt(str2[i]));
        tail = tail.next;
      }

      Solution obj = new Solution();
      if (obj.areIdentical(num1, num2))
        System.out.println("true");
      else
        System.out.println("false");
    }
  }

  public static void po(Object o) {
    System.out.println(o);
  }

  public static void show(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }
}

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Solution {
  public boolean areIdentical(Node head1, Node head2) {
    Node currentone = head1;
    Node currenttwo = head2;

    while (currentone.next != null && currenttwo.next != null) {
      if (currentone.data != currenttwo.data) {
        return false;
      } else {
        currentone = currentone.next;
        currenttwo = currenttwo.next;
      }
    }
    return true;
  }
}