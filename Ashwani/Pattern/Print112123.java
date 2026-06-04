public class Print112123 {
  public static void main(String[] args) {
    int k = 5;
    PrintNo(k);
  }

  public static void PrintNo(int k) {
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
