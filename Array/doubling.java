import java.util.*;

public class doubling {
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long b = sc.nextLong();
      long A[] = new long[n];

      for (int i = 0; i < n; i++) {
        A[i] = sc.nextLong();
      }

      Solution sol = new Solution();
      System.out.println(sol.solve(n, A, b));
    }
  }
}

class Solution {
  long solve(int n, long A[], long b) {
    for (int i = 0; i < A.length; i++) {
      if (b == A[i]) {
        b = 2 * b;
      }
    }
    return b;
  }
}
