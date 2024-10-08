import java.util.Scanner;

public class BitisSetorNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n, k;
    while (t-- > 0) {
      Solution obj = new Solution();
      n = sc.nextInt();
      k = sc.nextInt();
      System.out.println(obj.checkKthBit(n, k));
    }
  }
}

class Solution {
  // Function to find the first position with different bits.
  public static int checkKthBit(int n, int k) {
    for (int pos = 1; pos <= 32; pos++) {
      if ((k & (1 << (pos - 1))) != (n & (1 << (pos - 1)))) {
        return pos;
      }
    }
    return 0;
  }
}