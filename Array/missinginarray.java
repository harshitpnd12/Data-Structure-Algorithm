import java.io.*;

class missinginarray {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      String[] str = br.readLine().trim().split(" ");
      int[] arr = new int[n - 1];
      for (int i = 0; i < n - 1; i++) {
        arr[i] = Integer.parseInt(str[i]);
      }
      Solution sln = new Solution();
      System.out.println(sln.missingNumber(n, arr));
    }
  }
}

// } Driver Code Ends
// n*((n+1))/2
// User function Template for Java
class Solution {
  int missingNumber(int n, int arr[]) {
    int b = n * (n + 1) / 2;
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      sum += arr[i];
    }
    int num = b - sum;
    return num;
  }
}
