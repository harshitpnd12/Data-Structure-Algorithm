import java.io.*;
import java.io.InputStreamReader;

public class removeadjacentstring {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String S = br.readLine();
      Solution ob = new Solution();
      String ans = ob.rremove(S).trim();
      System.out.println(ans);
    }
  }
}

class Solution {
  String rremove(String s) {
    if (s.length() <= 1)
      return s;

    StringBuilder sb = new StringBuilder();
    int i = 0;

    while (i < s.length()) {
      if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        char duplicate = s.charAt(i);
        while (i < s.length() && s.charAt(i) == duplicate) {
          i++;
        }
      } else {
        sb.append(s.charAt(i));
        i++;
      }
    }

    String newString = sb.toString();
    if (newString.equals(s)) {
      return newString;
    } else {
      return rremove(newString);
    }
  }
}
