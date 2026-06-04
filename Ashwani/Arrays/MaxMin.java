public class MaxMin {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int a = Max(arr);
    int b = Min(arr);
    System.out.println("Max element in array :-" + a);
    System.out.println("Min element in array :-" + b);
  }

  public static int Max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int Min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
