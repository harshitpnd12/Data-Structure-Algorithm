import java.io.*;
import java.util.*;

public class kthfromtheend {
  static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());

    while (t-- > 0) {
      List<Integer> arr = new ArrayList<>();
      String input = br.readLine().trim();
      if (!input.isEmpty()) {
        String[] numbers = input.split("\\s+");
        for (String num : numbers) {
          if (!num.isEmpty()) {
            arr.add(Integer.parseInt(num));
          }
        }
      }

      int x = Integer.parseInt(br.readLine().trim());

      Node head = null;
      if (!arr.isEmpty()) {
        head = new Node(arr.get(0));
        Node tail = head;
        for (int i = 1; i < arr.size(); ++i) {
          tail.next = new Node(arr.get(i));
          tail = tail.next;
        }
      }

      Solution g = new Solution();
      // System.out.println(k);
      System.out.println(g.getKthFromLast(head, x));
    }
  }
}

// } Driver Code Ends

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  int getKthFromLast(Node head, int k) {
    Node current = head;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }

    if (count < k) {
      return -1;
    }
    current = head;
    for (int i = 0; i < count - k; i++) {
      current = current.next;
    }
    return current.data;
  }
}