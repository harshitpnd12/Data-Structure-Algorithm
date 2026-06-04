public class Triangle {
  public static void main(String[] args) {
    int k = 5;
    triangle(k);
  }

  public static void triangle(int k) {
    for (int i = 1; i <= k; i++) {
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
