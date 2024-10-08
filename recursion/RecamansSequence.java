import java.io.*;
import java.util.*;

public class RecamansSequence {
  // { Driver Code Starts
  // Initial Template for Java
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(in.readLine());

      Solution ob = new Solution();
      @SuppressWarnings("static-access")
      List<Integer> ans = ob.recamanSequence(n);
      for (int i = 0; i < n; i++)
        System.out.print(ans.get(i) + " ");
      System.out.println();
    }
  }
}

class Solution {
  static List<Integer> recamanSequence(int n) {
    List<Integer> list = new ArrayList<>();
    if (n == 0) {
      list.add(n);
      return list;
    }
    int a =
    return null;
  }
}

//
// recamanSequencefinder(n,list)
// return list;
// }

// private void recamanSequencefinder(int n, List<Integer> list) {
// return;
// }