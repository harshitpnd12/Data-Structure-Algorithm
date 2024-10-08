import java.io.*;

class wildcard {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    while (t-- > 0) {
      String wild = in.readLine();
      String pattern = in.readLine();

      Solution ob = new Solution();
      boolean flag = ob.match(wild, pattern);
      if (flag)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
  static boolean match(String wild, String pattern) {
    return false;
  }
}