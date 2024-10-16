import java.util.*;

// { Driver Code Starts.
public class first1insortedarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume the newline character
    while (t-- > 0) {
      String input = sc.nextLine();
      String[] parts = input.split(" ");
      int[] arr = new int[parts.length];
      for (int i = 0; i < parts.length; i++) {
        arr[i] = Integer.parseInt(parts[i]);
      }
      Solution ob = new Solution();
      System.out.println(ob.firstIndex(arr));
    }
    sc.close();
  }
}

class Solution {
  public long firstIndex(int arr[]) {
    int n = arr.length;
    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == 1) {
        if (mid == 0 || arr[mid - 1] == 0) {
          return mid;
        }
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
