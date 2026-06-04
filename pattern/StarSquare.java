import java.util.Scanner;

class StarSquare {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number n");
    int n = sc.nextInt();
    Square(n);
  }

  public static void Square(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
