import java.io.*;

class maxcircular {

  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());// input size of array
      int arr[] = new int[n];
      String inputLine2[] = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
      }

      Solution obj = new Solution();

      System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
    }
  }
}

class Solution {
  static int circularSubarraySum(int a[], int n) {
    int sum = 0;
    return sum;

  }
}