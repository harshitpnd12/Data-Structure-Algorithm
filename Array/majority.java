//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class majority {
  @SuppressWarnings("static-access")
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      System.out.println(new Solution().majorityElement(arr, n));
    }
  }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
  static int majorityElement(int a[], int size) {
    int cand = 0;
    int count = 0;
    int maj = size / 2;
    for (int i = 0; i < a.length; i++) {
      if (count == 0) {
        cand = a[i];
        count = 1;
      } else if (a[i] == cand) {
        count++;
      } else {
        count--;
      }
    }
    count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == cand) {
        count++;
      }
    }
    if (count > maj) {
      return cand;
    } else {
      return -1;
    }

  }
}
