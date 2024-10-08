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

class closestnumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {

      int n;
      n = Integer.parseInt(br.readLine());

      int k;
      k = Integer.parseInt(br.readLine());

      int[] arr = IntArray.input(br, n);

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      int res = obj.findClosest(n, k, arr);

      System.out.println(res);

    }
  }
}

// } Driver Code Ends

class Solution {
  public static int findClosest(int n, int k, int[] arr) {
    int left = 0, right = n - 1;

    if (k <= arr[left]) {
      return arr[left];
    }

    if (k >= arr[right]) {
      return arr[right];
    }

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == 0) {
        return arr[mid];
      } else if (arr[mid] < k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    int difflow = Math.abs(arr[left] - k);
    int diffhigh = Math.abs(arr[right] - k);
    if (difflow < diffhigh) {
      return arr[left];
    } else if (diffhigh < difflow) {
      return arr[right];
    } else {
      return Math.max(arr[left], arr[right]);
    }
  }
}
