import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class klargestelement {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine().trim());
    while (tc-- > 0) {
      String[] inputLine;
      inputLine = br.readLine().trim().split(" ");
      int n = Integer.parseInt(inputLine[0]);
      int k = Integer.parseInt(inputLine[1]);
      int[] arr = new int[n];
      inputLine = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }

      int[] ans = new Solution().kLargest(arr, n, k);
      for (int x : ans) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
  }
}

class Solution {
  int[] kLargest(int[] arr, int n, int k) {
    Arrays.sort(arr);
    int[] largest = new int[k];
    for (int i = 0; i < k; i++) {
      largest[i] = arr[n - 1 - i];
    }
    return largest;
  }
}