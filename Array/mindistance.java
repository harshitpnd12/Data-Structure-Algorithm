import java.io.*;

class mindistance {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      String[] str = br.readLine().trim().split(" ");
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(str[i]);
      String[] xy = br.readLine().trim().split(" ");
      int x = Integer.parseInt(xy[0]);
      int y = Integer.parseInt(xy[1]);
      Solution g = new Solution();
      System.out.println(g.minDist(a, n, x, y));
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  int minDist(int a[], int n, int x, int y) {
    int disind = Integer.MAX_VALUE;
    int indx = -1;
    int indy = -1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == x) {
        indx = i;
      }

      if (a[i] == y) {
        indy = i;
      }

      if (indx != -1 && indy != -1) {
        disind = Math.min(disind, Math.abs(indx - indy));
      }
    }
    return (indx == -1 || indy == -1) ? -1 : disind;
  }
}