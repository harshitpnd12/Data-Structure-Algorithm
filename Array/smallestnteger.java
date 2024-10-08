import java.io.*;

// { Driver Code Starts.

class smallestnteger {
  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    // taking testcases
    int t = Integer.parseInt(in.readLine().trim());
    while (t-- > 0) {

      // input number n
      int n = Integer.parseInt(in.readLine().trim());
      int[] arr = new int[n];
      String s[] = in.readLine().trim().split(" ");

      // adding elements to the array
      for (int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(s[i]);

      Solution obj = new Solution();

      // calling missingNumber()
      @SuppressWarnings("static-access")
      int missing = obj.missingNumber(arr, n);
      out.println(missing);
    }
    out.close();
  }
}

class Solution {
  static int missingNumber(int arr[], int size) {
    int missing = 1;
    java.util.Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= 0) {
        continue;
      }
      if (arr[i] == missing) {
        missing++;
      }
    }
    return missing;
  }
}