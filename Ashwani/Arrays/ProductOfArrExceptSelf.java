import java.util.Arrays;

public class ProductOfArrExceptSelf {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int result[] = ProductOfArray(arr);
    System.out.println(Arrays.toString(result));
  }

  public static int[] ProductOfArray(int[] arr) {
    int y = 1;
    int[] array = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          y = arr[j] * y;
        }
      }
      array[i] = y;
      y = 1;
    }
    return array;
  }
}
