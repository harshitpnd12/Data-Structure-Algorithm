import java.io.*;

class minimumno {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(read.readLine());
      String st[] = read.readLine().trim().split("\\s+");

      int arr[] = new int[n];

      for (int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(st[i]);

      System.out.println(new Solution().minNumber(arr, 0, n - 1));
    }
  }

}
// } Driver Code Ends

class Solution {
  static int minNumber(int arr[], int low, int high) {
    if (low == high) {
      return arr[low];
    }

    while (low <= high) {
      if (arr[low] <= arr[high]) {
        return arr[low];
      }

      int mid = low + (high - low) / 2;

      if (mid > 0 && arr[mid] < arr[mid - 1]) {
        return arr[mid];
      }

      if (mid < high && arr[mid] > arr[mid + 1]) {
        return arr[mid + 1];
      }

      if (arr[mid] >= arr[low]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
