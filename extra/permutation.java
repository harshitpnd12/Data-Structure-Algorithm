import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class permutation {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String S = br.readLine().trim();
      Solution obj = new Solution();
      List<String> ans = obj.find_permutation(S);
      for (int i = 0; i < ans.size(); i++) {
        out.print(ans.get(i) + " ");
      }
      out.println();
    }
    out.close();
  }
}
// permutation n!;

class Solution {
  public List<String> find_permutation(String S) {
    return null;
  }
}