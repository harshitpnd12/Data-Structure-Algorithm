import java.util.Scanner;

public class RightDifferentBit {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int m, n;
    while (t-- > 0) {
      Solution obj = new Solution();
      m = sc.nextInt();
      n = sc.nextInt();
      System.out.println(obj.posOfRightMostDiffBit(m, n));
    }
  }
}

class Solution {
  // Function to find the first position with different bits.
  public int posOfRightMostDiffBit(int m, int n) {
    for (int pos = 1; pos <= 32; pos++) {
      if ((m & (1 << (pos - 1))) != (n & (1 << (pos - 1)))) {
        return pos;
      }
    }
    return 0;
  }
}