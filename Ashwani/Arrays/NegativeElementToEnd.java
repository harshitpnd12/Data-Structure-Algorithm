import java.util.Arrays;

public class NegativeElementToEnd {
  public static void main(String[] args) {
    int[] arr = { 1, 5, -3, 9, -4, 45, -77, 46, 79, };
    RemoveNegativeToEnd(arr);
    System.out.println("Arrays is:- " + Arrays.toString(arr));
  }

  public static void RemoveNegativeToEnd(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0 && arr[j] < 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] >= 0) {
        j++;
      }
    }
  }
}
