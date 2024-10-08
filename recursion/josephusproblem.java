import java.util.Scanner;

public class josephusproblem {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Solution obj = new Solution();
      int n, k;
      n = sc.nextInt();
      k = sc.nextInt();

      System.out.println(obj.josephus(n, k));
    }
  }
}

class Solution {
  public int josephus(int n, int k) {
    // base case
    if (n == 1) {
      return 0;
    }
    int x = josephus(n - 1, k);
    return ((x + k) % n) + 1;
  }

}
