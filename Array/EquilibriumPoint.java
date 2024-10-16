
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class EquilibriumPoint {

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

      long[] arr = new long[array.size()];
      int idx = 0;
      for (long i : array)
        arr[idx++] = i;

      Solution obj = new Solution();
      System.out.println(obj.equilibriumPoint(arr));
    }
  }
}

class Solution {
  public static int equilibriumPoint(long arr[]) {
    if (arr.length == 1) {
      return 1;
    }
    int sr = 0;
    int sl = 0;
    for (int i = 1; i < arr.length; i++) {
      sr += arr[i];
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (sl == sr) {
        return i + 1;
      }
      sl += arr[i];
      sr -= arr[i + 1];
    }
    return -1;
  }
}
