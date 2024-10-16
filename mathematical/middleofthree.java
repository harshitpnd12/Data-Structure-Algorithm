import java.io.*;

class middleofthree {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String[] S = read.readLine().split(" ");
      int A = Integer.parseInt(S[0]);
      int B = Integer.parseInt(S[1]);
      int C = Integer.parseInt(S[2]);
      Solution ob = new Solution();
      System.out.println(ob.middle(A, B, C));
    }
  }
}

class Solution {
  int middle(int A, int B, int C) {
    if (A > B && A < C || A > C && A < B) {
      return A;
    } else if (B > C && B < A || B > A && B < C) {
      return B;
    } else {
      return C;
    }
  }
}