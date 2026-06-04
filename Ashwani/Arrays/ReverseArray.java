public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    reverseArray(arr, n);
    System.out.println();
    System.out.println("-----");
    printreversearray(arr);
  }

  // reverse array print
  public static void printreversearray(int[] arr1) {
    for (int i = arr1.length - 1; i >= 0; i--) {
      System.out.print(arr1[i] + " ");
    }
  }

  // reverse arr
  public static void reverseArray(int[] arr, int n) {
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = arr[n - 1 - i];
    }
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
}
