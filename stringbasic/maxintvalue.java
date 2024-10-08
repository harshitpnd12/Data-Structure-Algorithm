import java.io.*;

class maxintvalue {
  // Position this line where user code will be pasted.
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String S = read.readLine();
      Solution ob = new Solution();
      System.out.println(ob.MaximumIntegerValue(S));
    }
  }
}

class Solution {
  long MaximumIntegerValue(String S) {

    long result = S.charAt(0) - '0';

    for (int i = 1; i < S.length(); i++) {

      int digit = S.charAt(i) - '0';

      if (result <= 1 || digit <= 1) {
        result += digit;
      } else {
        result *= digit;
      }
    }

    return result;
  }
}