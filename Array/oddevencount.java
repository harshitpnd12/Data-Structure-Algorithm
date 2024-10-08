import java.io.*;

class oddevencount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      String[] S = br.readLine().trim().split(" ");
      int n = S.length;
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(S[i]);
      }
      Solution obj = new Solution();
      int[] result = obj.countOddEven(arr);
      for (Integer t : result) {
        System.out.print(t + " ");
      }
      System.out.println(" ");
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  public int[] countOddEven(int[] arr) {
    int[] array = new int[2];
    int oddcount = 0;
    int evencount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evencount++;
      } else {
        oddcount++;
      }
    }
    array[0] = oddcount;
    array[1] = evencount;
    return array;
  }
}