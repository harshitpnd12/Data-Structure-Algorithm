import java.io.*;
import java.util.*;

class highestno {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      String s = br.readLine().trim();
      int n = Integer.parseInt(s);
      String S = br.readLine();
      String[] s1 = S.split(" ");
      List<Integer> a = new ArrayList<Integer>();
      for (int i = 0; i < n; i++) {
        a.add(Integer.parseInt(s1[i]));
      }
      Solution ob = new Solution();
      int ans = ob.findPeakElement(a);
      System.out.println(ans);
    }
  }
}

class Solution {
  public int findPeakElement(List<Integer> a) {
    int n = 0;
    return n;
  }
}