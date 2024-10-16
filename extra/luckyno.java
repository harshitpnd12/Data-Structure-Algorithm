import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luckyno {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(reader.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(reader.readLine());
      Solution s = new Solution();
      System.out.println(s.isLucky(n) ? "1" : "0");
    }
  }
}

class Solution {
  // n: Input n
  // Return True if the given number is a lucky number else return False
  public static boolean isLucky(int n) {
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
      n = n - (n / i);
    }
    return true;
  }
}

// another solution

// class Solution {
// // n: Input n
// // i: Current iteration number, start with 2
// // Return True if the given number is a lucky number else return False
// public static boolean isLucky(int n) {
// return isLuckyHelper(n, 2);
// }

// private static boolean isLuckyHelper(int n, int i) {
// if (i > n) {
// return true;
// }
// if (n % i == 0) {
// return false;
// }
// // Reduce n by the count of numbers less than or equal to n that have been
// // removed
// n = n - (n / i);
// return isLuckyHelper(n, i + 1);
// }
// }
