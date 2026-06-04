public class FindMissingNo {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 6, 3, 7, 8 };
    int n = 8;
    int k = missingNo(arr, n);
    System.out.println(k);
  }

  public static int missingNo(int arr[], int n) {
    int sum = (n * (n + 1)) / 2;
    int sum2 = 0;
    for (int i = 0; i < arr.length; i++) {
      sum2 += arr[i];
    }
    return sum - sum2;
  }
}
