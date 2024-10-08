import java.io.*;
import java.util.*;

class firstlastoccurence {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {
      int x = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

      String inputLine1[] = br.readLine().trim().split(" ");
      int n = inputLine1.length;
      int arr[] = new int[(int) (n)];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine1[i]);
      }

      Solution obj = new Solution();
      ArrayList<Integer> ans = obj.firstAndLast(x, arr);

      for (Integer val : ans)
        System.out.print(val + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

// User function Template for Java
class Solution {
  public ArrayList<Integer> firstAndLast(int x, int arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int n = arr.length;
    int left = 0, right = n - 1;
    int first = -1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == x) {
        first = mid;
        right = mid - 1;
      } else if (arr[mid] < x) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    list.add(first);
    if (first == -1) {
      return list;
    }
    int low = 0, high = arr.length - 1;
    int last = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == x) {
        last = mid;
        low = mid + 1;
      } else if (arr[mid] < x) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    list.add(last);

    return list;
  }
}
