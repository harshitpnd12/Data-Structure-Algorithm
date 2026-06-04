import java.util.Scanner;

public class LeftTriangle {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    lefttriangle(n);
    righttriangle(n);
  }

  public static void lefttriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void righttriangle(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
