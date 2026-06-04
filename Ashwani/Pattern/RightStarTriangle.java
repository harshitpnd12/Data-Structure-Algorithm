public class RightStarTriangle {
  public static void main(String[] args) {
    int k = 5;
    RightTriangle(k);
  }

  public static void RightTriangle(int k) {
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= k - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
