import java.util.*;

public class powerofnumber {

  public static long rev(long n) {
    long rev_num = 0;
    while (n > 0) {
      rev_num = rev_num * 10 + n % 10;
      n = n / 10;
    }
    return rev_num;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Solution obj = new Solution();
      int N;
      N = sc.nextInt();
      int R = 0;
      R = (int) rev(N);
      long ans = (long) obj.power(N, R);
      System.out.println(ans);
    }
  }
}

// class Solution {

// long power(int N, int R) {
// if (R == 0) {
// return 1;
// }
// long ans = N * (power(N, R - 1));
// return (ans) % 1000000007;
// }

// }

class Solution {

  long power(int N, int R) {
    long mod = 1000000007;
    if (R == 0) {
      return 1; // Any number to the power of 0 is 1
    }
    long halfPower = power(N, R / 2);
    long result = (halfPower * halfPower) % mod;

    if (R % 2 != 0) { // If R is odd
      result = (result * N) % mod;
    }

    return result;
  }
}
