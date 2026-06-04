public class Print122333 {
  public static void main(String[] args) {
    int k = 5;
    Printno(k);
  }

  public static void Printno(int k) {
    for (int i = 1; i <= k; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
