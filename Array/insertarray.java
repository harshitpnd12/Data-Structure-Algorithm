import java.util.Scanner;

public class insertarray {
  public static int Insert(int arr[], int n, int x, int cap, int pos) {
    if (n >= cap) {
      return n;
    }

    int index = pos - 1;

    for (int i = n - 1; i >= index; i--) {
      arr[i + 1] = arr[i];
    }

    arr[index] = x;

    return n + 1;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5]; // capacity of 5
    arr[0] = 5;
    arr[1] = 2;
    arr[2] = 7;
    arr[3] = 12;

    int n = 4; // current number of elements in the array
    System.out.println("Enter element to insert:");
    int x = sc.nextInt();
    System.out.println("Enter capacity of array:");
    int cap = sc.nextInt();
    System.out.println("Enter position to insert (1-based):");
    int pos = sc.nextInt();

    int newSize = Insert(arr, n, x, cap, pos);

    System.out.println("Your new array is: ");
    for (int i = 0; i < newSize; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
