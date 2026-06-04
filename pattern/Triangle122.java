import java.util.Scanner;

public class Triangle122 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    triangle122(n);
  }

  public static void triangle122(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
