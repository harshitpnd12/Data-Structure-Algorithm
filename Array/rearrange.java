import java.io.*;

class rearrange {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    // testcases
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      // size of array
      int n = Integer.parseInt(read.readLine());
      String st[] = read.readLine().trim().split("\\s+");
      long arr[] = new long[(int) n];

      // adding elements to the array
      for (int i = 0; i < n; i++)
        arr[(int) i] = Integer.parseInt(st[(int) i]);

      // calling arrange() function
      new Solution().arrange(arr, n);

      // printing the elements
      for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
  static void arrange(long arr[], int n) {
    long[] result = new long[n];
    for (int i = 0; i < result.length; i++) {
      result[i] = arr[(int) arr[i]];
    }

    for (int i = 0; i < result.length; i++) {
      arr[i] = result[i];
    }
  }
}