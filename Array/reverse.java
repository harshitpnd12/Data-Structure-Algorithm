
//{ Driver Code Starts
import java.io.*;

public class reverse {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());

    while (tc-- > 0) {
      String str[] = br.readLine().split(" ");
      int arr[] = new int[str.length];

      for (int i = 0; i < str.length; i++)
        arr[i] = Integer.parseInt(str[i]);
      Solution obj = new Solution();

      int ans[] = obj.reverseArray(arr);
      for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
    }
  }
}

class Solution {
  public int[] reverseArray(int arr[]) {
    int n = arr.length;
    int[] newarr = new int[n];
    for (int i = 0; i < n; i++) {
      newarr[i] = arr[n - i - 1];
    }
    return newarr;
  }
}

class Solutions {
  public void reverseArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - 1 - i];
      arr[n - 1 - i] = temp;
    }
  }
}