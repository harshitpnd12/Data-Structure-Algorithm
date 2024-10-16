import java.io.*;
import java.util.*;

class palindromicarray {
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
      System.out.println(obj.palinArray(arr) ? "true" : "false");
    }
  }
}

class Solution {
  public static boolean palinArray(int[] arr) {
    for (int num : arr) {
      String number = String.valueOf(num);
      int n = number.length();
      for (int i = 0; i < n / 2; i++) {
        if (number.charAt(i) != number.charAt(n - i - 1)) {
          return false;
        }
      }
    }
    return true;
  }
}