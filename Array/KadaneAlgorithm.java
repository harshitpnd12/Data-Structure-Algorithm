
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class KadaneAlgorithm {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {

      String line = br.readLine();
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

      Solution obj = new Solution();

      // calling maxSubarraySum() function
      System.out.println(obj.maxSubarraySum(arr));
    }
  }
}

class Solution {
  long maxSubarraySum(int[] arr) {
    int maxEndingHere = arr[0];
    int maxSoFar = arr[0];

    for (int i = 1; i < arr.length; i++) {

      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

      maxSoFar = Math.max(maxSoFar, maxEndingHere);

    }

    return maxSoFar;
  }
}

class Solutions {
  public int findMin(int[] nums) {
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}
