import java.io.*;

class floorinsortedarray {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String a[] = read.readLine().trim().split("\\s+");
      int n = Integer.parseInt(a[0]);
      long x = Long.parseLong(a[(int) 1]);
      String st[] = read.readLine().trim().split("\\s+");

      long arr[] = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Long.parseLong(st[i]);
      }

      out.println(new Solution().findFloor(arr, n, x));
    }
    out.close();
  }
}

class Solution {
  static int findFloor(long arr[], int n, long x) {
    int left = 0, right = arr.length - 1;
    int res = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == x) {
        return mid;
      } else if (arr[mid] < x) {
        res = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return res;
  }
}
