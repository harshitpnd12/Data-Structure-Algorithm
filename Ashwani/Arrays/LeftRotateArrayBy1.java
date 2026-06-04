import java.util.Arrays;

public class LeftRotateArrayBy1 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    RotateArray(arr);
    System.out.println("Arrays is" + Arrays.toString(arr));
  }

  public static void RotateArray(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = temp;
  }
}
