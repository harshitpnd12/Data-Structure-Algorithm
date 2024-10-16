import java.util.Scanner;

public class printnwithoutloop {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Solution obj = new Solution();
      int n;
      n = sc.nextInt();

      obj.printNos(n);
      System.out.println();
    }
  }
}

class Solution {

  public void printNos(int n) {
    if (n > 0) {
      printNos(n - 1);
      System.out.print(n + " ");
    }
    return;
  }
}
