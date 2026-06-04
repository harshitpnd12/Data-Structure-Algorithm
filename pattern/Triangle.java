import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    triangle(n);
  }

  public static void triangle(int n) {
    // System.out.println(" * ");
    // System.out.println(" * * ");
    // System.out.println(" * * * ");
    // System.out.println(" * * * * ");
    // System.out.println("* * * * *");
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
