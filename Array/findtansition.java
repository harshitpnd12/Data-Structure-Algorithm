import java.util.*;

class findtansition {
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Solution obj = new Solution();
      System.out.println(obj.transitionPoint(arr, n));
      T--;
    }
  }
}
// } Driver Code Ends

class Solution {
  int transitionPoint(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        return i;
      }
    }
    return -1;
  }
}