import java.util.*;

class forest {
  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    while (t-- > 0) {
      int n = in.nextInt();

      int tree[] = new int[n];
      for (int i = 0; i < n; i++)
        tree[i] = in.nextInt();
      int k = in.nextInt();

      Solution x = new Solution();
      System.out.println(x.find_height(tree, n, k));
    }
  }
}
// } Driver Code highs

class Solution {
  static int find_height(int tree[], int n, int k) {
    Arrays.sort(tree);
    int low = 0, high = 0;
    for (int height : tree) {
      high = Math.max(high, height);
    }
    int h = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      long totalWood = getTotalWood(tree, n, mid);
      if (totalWood == k) {
        h = mid;
        low = mid + 1;
      } else if (totalWood > k) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return h;
  }

  private static long getTotalWood(int[] tree, int n, int H) {
    long total = 0;
    for (int i = 0; i < n; i++) {
      if (tree[i] > H) {
        total += (tree[i] - H);
      }
    }
    return total;
  }
}
