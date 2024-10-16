
//{ Driver Code Starts
import java.io.*;
import java.util.Collection;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class reverseall {
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

      Solution ob = new Solution();
      head = ob.reverseList(head);
      printList(head);
      t--;
    }
  }
}

// } Driver Code Ends

// function Template for Java

/*
 * linked list node class:
 * 
 * class Node {
 * int data;
 * Node next;
 * Node(int value) {
 * this.value = value;
 * }
 * }
 * 
 */

class Solution {
  Node reverseList(Node head) {
    Node current = head;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    current=head;
    for (int i = 0; i < count; i++) {
      int temp = current.data;
      current.data=head;
    }
    return head;
  }
}
