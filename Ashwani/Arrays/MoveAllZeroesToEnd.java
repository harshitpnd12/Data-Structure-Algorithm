import java.util.Arrays;

public class MoveAllZeroesToEnd {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 0, 4, 3, 0, 8, 0, 4, 0, 5, 0, 0, 9 };
    MoveZero(arr);
    System.out.println("Arrays is:- " + Arrays.toString(arr));
  }

  public static void MoveZero(int arr[]) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0 && arr[j] == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j++;
      }
    }
  }
}

class Solution {
  void pushZerosToEnd(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j++] = arr[i];
      }
    }
    while (j < arr.length) {
      arr[j++] = 0;
    }
  }
}
