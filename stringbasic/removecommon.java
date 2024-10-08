
// { Driver Code Starts
import java.util.*;

class removecommon {
  @SuppressWarnings("static-access")
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while (t-- != 0) {
      String s1 = in.next(),
          s2 = in.next();

      Solution obj = new Solution();

      System.out.println(obj.concatenatedString(s1, s2));
    }
  }
}

class Solution {
  public static String concatenatedString(String s1, String s2) {
    StringBuilder S = new StringBuilder();

    return S.toString();
  }
}
