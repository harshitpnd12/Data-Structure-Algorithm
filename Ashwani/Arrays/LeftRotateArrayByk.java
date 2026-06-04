import java.util.Arrays;

public class LeftRotateArrayByk {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int k = 5;
    RotateArray(arr, k);
    System.out.println("Arrays is" + Arrays.toString(arr));
  }

  public static void RotateArray(int[] arr, int k) {
    k = k % arr.length;
    int[] temp = new int[k];
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }
    for (int i = k; i < arr.length; i++) {
      arr[i - k] = arr[i];
    }
    for (int i = 0; i < temp.length; i++) {
      arr[arr.length - k + i] = temp[i];
    }
  }
}
