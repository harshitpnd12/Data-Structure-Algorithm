import java.io.*;

class commonprefix {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String arr[] = read.readLine().trim().split(" ");

      Solution ob = new Solution();
      System.out.println(ob.longestCommonPrefix(arr));
    }
  }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
  public String longestCommonPrefix(String arr[]) {
    for (String string : arr) {
      String store = string;
    }
    for (int i = 0; i < arr.length; i++) {

    }
    return null;
  }
}