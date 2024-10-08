//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class ksmallest {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int t = Integer.parseInt(in.readLine().trim());
    while (t-- > 0) {
      String line = in.readLine();
      String[] tokens = line.split(" ");

      // Create an ArrayList to store the integers
      ArrayList<Integer> array = new ArrayList<>();

      // Parse the tokens into integers and add to the array
      for (String token : tokens) {
        array.add(Integer.parseInt(token));
      }

      int[] arr = new int[array.size()];
      int idx = 0;
      for (int i : array)
        arr[idx++] = i;

      int key = Integer.parseInt(in.readLine().trim());
      Solution ob = new Solution();
      out.println(ob.kthSmallest(arr, key));
    }
    out.flush();
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  public static int kthSmallest(int[] arr, int k) {

    Arrays.sort(arr);
    int z = arr[k - 1];
    return z;
  }
}

// k th largest
class Solutions {
  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length;
    int largest = nums[n - 1 - k];
    return largest;
  }
}