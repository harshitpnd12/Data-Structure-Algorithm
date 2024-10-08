import java.io.*;
import java.util.ArrayList;

public class countsmallerelement {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine().trim());
    while (tc-- > 0) {
      String[] s = br.readLine().trim().split(" ");
      int arr[] = new int[s.length];
      for (int i = 0; i < s.length; i++) {
        arr[i] = Integer.parseInt(s[i]);
      }

      int[] ans = new Solution().constructLowerArray(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  int[] constructLowerArray(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];
    ans[n - 1] = 0;
    ArrayList<Integer> list = new ArrayList<>();
    list.add(arr[n - 1]);
    for (int i = n - 2; i >= 0; i--) {
      int idx = getidx(list, arr[i], 0, list.size() - 1);
      ans[i] = idx;
      list.add(idx, arr[i]);
    }
    return ans;
  }

  private int getidx(ArrayList<Integer> list, int key, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (key <= list.get(mid)) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }
}
