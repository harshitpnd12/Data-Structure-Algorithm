import java.io.*;
import java.util.*;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

// { Driver Code Starts.

public class modularnode {
  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      ArrayList<Integer> arr = new ArrayList<>();
      String input = br.readLine();
      StringTokenizer st = new StringTokenizer(input);
      while (st.hasMoreTokens()) {
        arr.add(Integer.parseInt(st.nextToken()));
      }
      int k = Integer.parseInt(br.readLine());
      Node head = new Node(arr.get(0));
      Node tail = head;
      for (int i = 1; i < arr.size(); ++i) {
        tail.next = new Node(arr.get(i));
        tail = tail.next;
      }
      Solution ob = new Solution();
      int res = ob.modularNode(head, k);
      System.out.println(res);
    }
  }
}

class Solution {
  public int modularNode(Node head, int k) {
    if (k <= 0)
      return -1;
    int count = 1;
    Node current = head;
    Node mod = null;
    while (current != null) {
      if (count % k == 0) {
        mod = current;
      }
      count++;
      current = current.next;
    }

    return mod != null ? mod.data : -1;

  }
}