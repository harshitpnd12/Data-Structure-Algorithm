import java.io.*;
import java.util.*;

class Node {
  int data;
  Node next;

  Node(int a) {
    data = a;
    next = null;
  }
}

// } Driver Code Ends
/*
 * node class of the linked list
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int key)
 * {
 * data = key;
 * next = null;
 * }
 * }
 */
// complete the below function

// { Driver Code Starts.

class occurenceofk {

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
      Node head = new Node(arr.get(0));
      Node tail = head;
      for (int i = 1; i < arr.size(); ++i) {
        tail.next = new Node(arr.get(i));
        tail = tail.next;
      }
      int key = Integer.parseInt(br.readLine());
      Solution ob = new Solution();
      System.out.println(ob.count(head, key));

      System.out.println("~");
    }
  }
}

// } Driver Code Ends

class Solution {
  public static int count(Node head, int key) {
    int count = 0;
    Node current = head;
    while (current != null) {
      if (current.data == key) {
        count++;
        current = current.next;
      } else {
        current = current.next;
      }
    }
    return count;
  }
}