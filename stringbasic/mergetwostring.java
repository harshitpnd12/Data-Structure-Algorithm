import java.io.*;

class mergetwostring {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine().trim());
    while (t-- > 0) {
      String input_line[] = read.readLine().trim().split("\\s+");
      String S1 = input_line[0];
      String S2 = input_line[1];
      Solution ob = new Solution();
      System.out.println(ob.merge(S1, S2));
    }
  }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
  String merge(String S1, String S2) {
    int length1 = S1.length();
    int length2 = S2.length();
    int min = Math.min(length1, length2);
    StringBuilder string = new StringBuilder();
    for (int i = 0; i < min; i++) {
      string.append(S1.charAt(i));
      string.append(S2.charAt(i));
    }
    if (length1 > length2) {
      string.append(S1.substring(min));
    } else {
      string.append(S2.substring(min));
    }

    return string.toString();
  }
}