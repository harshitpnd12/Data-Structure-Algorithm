import java.util.Scanner;

class zerotofive {
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T > 0) {
      int N = sc.nextInt();
      System.out.println(new Solution().convertfive(N));
      T--;
    }
  }
}
// } Driver Code Ends

class Solution {
  int convertfive(int num) {
    if (num == 0) {
      return 5;
    }
    String numStr = Integer.toString(num);

    numStr = numStr.replace('0', '5');

    return Integer.parseInt(numStr);
  }
}