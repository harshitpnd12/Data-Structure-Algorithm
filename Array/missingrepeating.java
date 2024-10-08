import java.io.*;

class missingrepeating {
  // Driver code
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      String[] str = br.readLine().split(" ");

      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(str[i]);
      }

      int[] ans = new Solve().findTwoElement(a);
      System.out.println(ans[0] + " " + ans[1]);
    }
  }
}
// } Driver Code Ends

// User function Template for Java

class Solve {
  int[] findTwoElement(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int[] result = new int[2];
    int n = arr.length;
    int A = sum - (n * (n + 1) / 2);
    int B = 0;

    result[0] = A;
    result[1] = B;
    return result;
  }
}