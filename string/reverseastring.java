//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class reverseastring {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String str = read.readLine();
      System.out.println(new Reverse().reverseWord(str));
    }
  }
}

class Reverse {
  public static String reverseWord(String str) {
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      result += str.charAt(i);
    }
    return result;
  }
}