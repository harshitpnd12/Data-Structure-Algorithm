import java.io.*;
import java.util.*;

class multiplicationtable {
  public static void main(String args[]) throws IOException {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int N = sc.nextInt();
      Solution ob = new Solution();
      @SuppressWarnings("static-access")
      ArrayList<Integer> ans = ob.getTable(N);
      for (Integer val : ans)
        System.out.print(val + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

// User function Template for Java
class Solution {
  static ArrayList<Integer> getTable(int N) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      list.add(N * i);
    }
    return list;
  }
}