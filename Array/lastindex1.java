import java.io.*;

class lastindex1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String s = br.readLine();

      Solution obj = new Solution();
      System.out.println(obj.lastIndex(s));
    }
  }
}

class Solution {
  public int lastIndex(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == '1') {
        return i;
      }
    }
    return -1;
  }
}