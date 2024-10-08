
//{ Driver Code Starts
import java.io.*;

class sumofseries {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {

      int n;
      n = Integer.parseInt(br.readLine());

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      long res = obj.seriesSum(n);

      System.out.println(res);
    }
  }
}

// } Driver Code Ends

class Solution {
  public static long seriesSum(int n) {
    long sum = (long) n * (n + 1) / 2;
    return sum;
  }
}
