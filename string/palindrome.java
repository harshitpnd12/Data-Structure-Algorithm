import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class palindrome {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String S = read.readLine();

      Solution ob = new Solution();
      System.out.println(ob.isPalindrome(S));
    }
  }
}

// take more time;
// class Solution {
// int isPalindrome(String S) {
// String R = "";
// for (int i = S.length() - 1; i >= 0; i--) {
// R += S.charAt(i);
// }
// if (S.equals(R)) {
// return 1;
// } else {
// return 0;
// }
// }
// };

class Solution {
  int isPalindrome(String S) {
    int n = S.length();
    for (int i = 0; i < n / 2; i++) {
      if (S.charAt(i) != S.charAt(n - i - 1)) {
        return 0;
      }
    }
    return 1;
  }
}