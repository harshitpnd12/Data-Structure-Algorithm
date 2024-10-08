import java.io.*;

class factorial {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.factorial(N));
    }
  }
}
// } Driver Code Ends

class Solution {
  static long factorial(int N) {
    if (N == 0) {
      return 1;
    }
    if (N == 1) {
      return 1;
    }
    long fact = N * factorial(N - 1);
    return fact;
  }
}