import java.io.*;

class closestnumber {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String S[] = read.readLine().split(" ");

      int N = Integer.parseInt(S[0]);
      int M = Integer.parseInt(S[1]);

      Solution ob = new Solution();
      System.out.println(ob.closestNumber(N, M));
    }
  }
}

class Solution {
  static int closestNumber(int N, int M) {
    N--;
    if (N % M == 0) {
      return N;
    } else {
      N--;
    }
    return M;
  }
}