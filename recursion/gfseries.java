import java.io.IOException;
import java.util.Scanner;

public class gfseries {
  @SuppressWarnings({ "static-access", "resource" })
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int N = sc.nextInt();
      Solution ob = new Solution();
      ob.gfSeries(N);
    }
  }
}

class Solution {
  static void gfSeries(int N) {

    if (N == 1) {
      System.out.print(0 + " ");
      return;
    }
    // for 6 = 0 1 -1 2 -1 5 and 0 1 -1 1 5 11
    if (N == 2) {
      gfSeries(N - 1);
      System.out.print(1 + " ");
      return;
    }
    gfSeries(N - 1);
    int T1 = (N - 2) * (N - 2);
    int T2 = N - 1;
    int T3 = T1 - T2;
    System.out.print(T3 + " ");
  }
}
