import java.io.*;

public class noofoccurence {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine().trim());
    while (tc-- > 0) {
      String[] inputLine;
      inputLine = br.readLine().trim().split(" ");
      int n = Integer.parseInt(inputLine[0]);
      int x = Integer.parseInt(inputLine[1]);
      int[] arr = new int[n];
      inputLine = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }

      int ans = new Solution().count(arr, n, x);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  int count(int[] arr, int n, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    return count;
  }
}