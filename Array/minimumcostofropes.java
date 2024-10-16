import java.io.*;

public class minimumcostofropes {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine()); // Number of test cases

    while (t-- > 0) {
      String[] input = br.readLine().split(" ");
      long[] a = new long[input.length];

      for (int i = 0; i < input.length; i++) {
        a[i] = Long.parseLong(input[i]);
      }

      Solution ob = new Solution();
      System.out.println(ob.minCost(a));
    }
  }
}

// } Driver Code Ends

// Back-end complete function Template for Java
class Solution {
  public long minCost(long[] arr) {
    return 0;

  }
}