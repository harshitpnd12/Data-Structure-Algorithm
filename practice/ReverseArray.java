import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Total the Array Element");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the " + i + "Element");
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    reverse(arr);
    for (int i = 0; i < n; i++) {
      System.out.println("Reverse");
      System.out.print(arr[i]);
    }
    sc.close();
  }

  private static void reverse(int arr[]) {
    int a = arr.length;
    for (int i = 0; i < a / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[a - 1 - i];
      arr[a - 1 - i] = temp;
    }
  }
}
