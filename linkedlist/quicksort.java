
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
  int data;
  Node next;

  Node(int key) {
    data = key;
    next = null;
  }
}

class SortLL {
  static Node head;

  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String str[] = read.readLine().trim().split(" ");
      int n = str.length;
      Node head = new Node(Integer.parseInt(str[0]));
      addToTheLast(head);

      for (int i = 1; i < n; i++) {
        int a = Integer.parseInt(str[i]);
        addToTheLast(new Node(a));
      }

      GfG gfg = new GfG();
      Node node = gfg.quickSort(head);

      printList(node);
      System.out.println();

      System.out.println("~");
    }
  }

  public static void printList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void addToTheLast(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node temp = head;
      while (temp.next != null)
        temp = temp.next;
      temp.next = node;
    }
  }
}
// } Driver Code Ends

class GfG {
  public static Node quickSort(Node head) {
    return quickSortRec(head, getTail(head));
  }

  private static Node getTail(Node node) {
    while (node != null && node.next != null) {
      node = node.next;
    }
    return node;
  }

  private static Node quickSortRec(Node head, Node end) {
    if (head == null || head == end) {
      return head;
    }

    Node[] partitioned = partition(head, end);
    Node newHead = partitioned[0];
    Node pivot = partitioned[1];
    Node newEnd = partitioned[2];

    if (newHead != pivot) {
      Node temp = newHead;
      while (temp.next != pivot) {
        temp = temp.next;
      }
      temp.next = null;

      newHead = quickSortRec(newHead, temp);

      temp = getTail(newHead);
      temp.next = pivot;
    }

    pivot.next = quickSortRec(pivot.next, newEnd);

    return newHead;
  }

  private static Node[] partition(Node head, Node end) {
    Node pivot = end;
    Node prev = null, curr = head, tail = pivot;
    Node newHead = head, lastSmaller = null;

    while (curr != pivot) {
      if (curr.data < pivot.data) {
        lastSmaller = curr;
        prev = curr;
        curr = curr.next;
      } else {
        if (prev != null) {
          prev.next = curr.next;
        } else {
          newHead = curr.next;
        }
        Node temp = curr.next;
        curr.next = null;
        tail.next = curr;
        tail = curr;
        curr = temp;
      }
    }

    if (lastSmaller != null && lastSmaller.next != pivot) {
      lastSmaller.next = pivot;
    }

    return new Node[] { newHead, pivot, tail };
  }
}
