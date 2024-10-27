import java.io.*;
import java.util.*;

class tripletfamily {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
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
      boolean res = obj.findTriplet(arr);
      if (res)
        System.out.println("true");
      else
        System.out.println("false");

      System.out.println("~");
    }
  }
}

class Solution {
  public boolean findTriplet(int[] arr) {
    int n = arr.length;

    // Iterate through all possible triplets
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          // Check if the sum of any two equals the third element
          if (arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i]) {
            return true;
          }
        }
      }
    }
    return false;
  }
}