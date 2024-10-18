import java.io.*;
import java.util.*;

class singlenumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      // int k = Integer.parseInt(br.readLine());
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
      int res = obj.getSingle(arr);

      System.out.println(res);
    }
  }
}

// } Driver Code Ends
class Solution {
  int getSingle(int arr[]) {
    int result = 0;
    for (int num : arr) {
      result ^= num; // XOR each element with result
    }
    return result;
  }
}