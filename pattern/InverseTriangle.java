import java.util.Scanner;

public class InverseTriangle {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    inverseTriangle(n);
  }

  public static void inverseTriangle(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print(" * ");
      }
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
