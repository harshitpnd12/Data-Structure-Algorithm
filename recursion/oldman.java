import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class oldman {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    while (t-- > 0) {
      String a[] = in.readLine().trim().split("\\s+");
      int N = Integer.parseInt(a[0]);
      int n = Integer.parseInt(a[1]);
      Solution ob = new Solution();
      List<Integer> ans = new ArrayList<Integer>();
      ans = ob.shiftPile(N, n);
      System.out.println(ans.get(0) + " " + ans.get(1));
    }
  }
}

class Solution {
  static List<Integer> shiftPile(int N, int n) {
    return null;

  }
}