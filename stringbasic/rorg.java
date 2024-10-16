import java.io.*;

class rorg {
  // Position this line where user code will be pasted.
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      String S = read.readLine();
      Solution ob = new Solution();
      System.out.println(ob.RedOrGreen(N, S));
    }
  }
}

class Solution {
  static int RedOrGreen(int N, String S) {
    int totalr = 0;
    int totalg = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'G') {
        totalg++;
      } else {
        totalr++;
      }
    }
    int min = Math.min(totalr, totalg);
    return min;
  }
}