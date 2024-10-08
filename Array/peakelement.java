import java.io.*;

class peakelement {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(in.readLine().trim());
    while (t-- > 0) {
      int n = Integer.parseInt(in.readLine().trim());
      int[] a = new int[n];
      int[] tmp = new int[n];
      String s[] = in.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(s[i]);
        tmp[i] = a[i];
      }

      int f = 0;
      int A = (new Solution()).peakElement(tmp, n);

      if (A < 0 && A >= n)
        out.println(0);
      else {
        if (n == 1 && A == 0)
          f = 1;
        else if (A == 0 && a[0] >= a[1])
          f = 1;
        else if (A == n - 1 && a[n - 1] >= a[n - 2])
          f = 1;
        else if (A >= 0 && A < n && a[A] >= a[A + 1] && a[A] >= a[A - 1])
          f = 1;
        else
          f = 0;
        out.println(f);
      }
    }
    out.close();
  }
}

class Solution {

  public int peakElement(int[] arr, int n) {
    if (n == 1) {
      return 0;
    }
    for (int i = 0; i < arr.length; i++) {
      if ((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1])) {
        return i;
      }
    }
    return -1;
  }
}