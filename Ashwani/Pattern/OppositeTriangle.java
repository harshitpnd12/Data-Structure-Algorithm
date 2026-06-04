public class OppositeTriangle {
  public static void main(String[] args) {
    int k = 5;
    ReverseTriangle(k);
  }

  public static void ReverseTriangle(int k) {
    for (int i = k; i >= 1; i--) {
      for (int j = 0; j < k - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
