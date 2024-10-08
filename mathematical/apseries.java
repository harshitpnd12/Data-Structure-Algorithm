import java.io.*;

class apseries {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {

      int a1;
      a1 = Integer.parseInt(br.readLine());

      int a2;
      a2 = Integer.parseInt(br.readLine());

      int n;
      n = Integer.parseInt(br.readLine());

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      int res = obj.nthTermOfAP(a1, a2, n);

      System.out.println(res);

    }
  }
}

// } Driver Code Ends

class Solution {
  public static int nthTermOfAP(int a1, int a2, int n) {
    int a3 = a1 + (n - 1) * (a2 - a1);
    return a3;
  }
}
