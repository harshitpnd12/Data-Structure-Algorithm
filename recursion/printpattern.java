import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class printpattern {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(in.readLine().trim());
      Solution ob = new Solution();
      List<Integer> ans = new ArrayList<Integer>();
      ans = ob.pattern(N);
      for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
        System.out.println();
      }
    }
  }
}

class Solution {
  public List<Integer> pattern(int N) {
    List<Integer> list = new ArrayList<>();
    patternHelper(N, N, list, true);
    return list;
  }

  private void patternHelper(int originalN, int currentN, List<Integer> list, boolean decreasing) {
    if (decreasing && currentN <= 0) {
      list.add(currentN);
      patternHelper(originalN, currentN + 5, list, false);
    } else if (!decreasing && currentN > originalN) {
      return;
    } else {
      list.add(currentN);

      if (decreasing) {
        patternHelper(originalN, currentN - 5, list, decreasing);
      } else {
        patternHelper(originalN, currentN + 5, list, decreasing);
      }
    }
  }
}