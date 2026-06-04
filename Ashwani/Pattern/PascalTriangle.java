public class PascalTriangle {
  public static void main(String[] args) {
    int k = 5;
    Pascal(k);
  }

  public static void Pascal(int k) {
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < k - i; j++) {
        System.out.print(" ");
      }
      int num = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num = num * (i - j) / (j + 1);
      }
      System.out.println();
    }
  }
}
