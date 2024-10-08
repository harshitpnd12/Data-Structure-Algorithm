import java.io.*;
import java.util.ArrayList;

public class uniquepartition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      int N = Integer.parseInt(br.readLine().trim());
      Solution ob = new Solution();
      ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(N);
      for (ArrayList<Integer> i : ans)
        for (int j : i)
          System.out.print(j + " ");
      System.out.println();
    }
  }
}

class Solution {
  public ArrayList<ArrayList<Integer>> UniquePartitions(int n) {
    // Input: n = 3
    // Output: 3 2 1 1 1 1
    // Explanation: For n = 3,
    // {3}, {2, 1} and {1, 1, 1}.

    return null;
  }
}
