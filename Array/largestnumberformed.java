import java.io.*;
import java.util.Arrays;

public class largestnumberformed {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine().trim());
    while (tc-- > 0) {
      @SuppressWarnings("unused")
      String[] inputLine;
      int n = Integer.parseInt(br.readLine().trim());
      String[] arr = br.readLine().trim().split(" ");

      String ans = new Solution().printLargest(n, arr);
      System.out.println(ans);
    }
  }
}

class Solution {
  String printLargest(int n, String[] arr) {
    Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
    if (arr[0].equals("0")) {
      return "0";
    }
    StringBuilder largestnumber = new StringBuilder();
    for (String num : arr) {
      largestnumber.append(num);
    }
    return largestnumber.toString();
  }
}