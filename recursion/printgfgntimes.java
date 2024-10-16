import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printgfgntimes {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      Solution obj = new Solution();
      obj.printGfg(n);
      System.out.println();
    }
  }
}

class Solution {

  void printGfg(int N) {
    if (N > 0) {
      printGfg(N - 1);
      System.out.print("GFG" + " ");
    }
  }
}
