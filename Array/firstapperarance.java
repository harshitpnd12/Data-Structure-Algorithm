// public class firstapperarance {

// }
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {

      String line = br.readLine();
      String[] tokens = line.split(" ");

      // Create an ArrayList to store the integers
      ArrayList<Long> array = new ArrayList<>();

      // Parse the tokens into integers and add to the array
      for (String token : tokens) {
        array.add(Long.parseLong(token));
      }

      int[] arr = new int[array.size()];
      int idx = 0;
      for (long i : array)
        arr[idx++] = (int) i;

      Solution obj = new Solution();

      // calling maxSubarraySum() function
      System.out.println(obj.firstRepeated(arr));
    }
  }
}

// Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
// Output: 2

class Solution {
  public static int firstRepeated(int[] arr) {
    return -1;
  }
}
