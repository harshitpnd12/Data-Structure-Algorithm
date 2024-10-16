import java.io.*;

class convertlowercase {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String s = read.readLine();
      Solution ob = new Solution();

      System.out.println(ob.toLower(s));
    }
  }
}

class Solution {
  static String toLower(String s) {
    return s.toLowerCase();
  }
}