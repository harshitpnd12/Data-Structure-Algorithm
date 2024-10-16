import java.io.*;
import java.util.*;

class IntArray {
  public static int[] input(BufferedReader br, int n) throws IOException {
    String[] s = br.readLine().trim().split(" ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(s[i]);

    return a;
  }

  public static void print(int[] a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }

  public static void print(ArrayList<Integer> a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }
}

class findpair {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {

      int n;
      n = Integer.parseInt(br.readLine());

      int x;
      x = Integer.parseInt(br.readLine());

      int[] arr = IntArray.input(br, n);

      Solution obj = new Solution();
      int res = obj.findPair(n, x, arr);

      System.out.println(res);
    }
  }
}

// } Driver Code Ends

// class Solution {
// public int findPair(int n, int x, int[] arr) {
// Arrays.sort(arr);
// int left = 0, right = n - 1;
// while (left < right) {
// int sum = arr[left] + arr[right];
// if (sum == x) {
// return 1;
// } else if (sum < x) {
// left++;
// } else {
// right--;
// }
// }
// return -1;
// }
// }
class Solution {
  public int findPair(int n, int x, int[] arr) {
    Arrays.sort(arr);
    int left = 0, right = 1;
    while (right < n) {
      int diff = arr[right] - arr[left];
      if (diff == x) {
        return 1;
      } else if (diff < x) {
        right++;
      } else {
        left++;
        if (left == right) {
          right++;
        }
      }
    }
    return -1;
  }
}