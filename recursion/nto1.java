import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nto1 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int N = Integer.parseInt(br.readLine().trim());
      Solution obj = new Solution();
      obj.printNos(N);
      System.out.println();
    }
  }
}

class Solution {

  void printNos(int N) {
    if (N > 0) {
      System.out.println(N + " ");
      printNos(N - 1);
    }
  }
}