import java.io.*;
import java.util.*;

public class combinationsum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter ot = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String s[] = br.readLine().trim().split(" ");
      int n = Integer.parseInt(s[0]);
      int k = Integer.parseInt(s[1]);
      int a[] = new int[n];
      s = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(s[i]);
      List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
      for (List<Integer> list : ans) {
        for (int x : list)
          ot.print(x + " ");
        ot.println();
      }
      if (ans.size() == 0)
        ot.println();
    }
    ot.close();
  }
}

class Solution {
  public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
    return null;

  }
}
