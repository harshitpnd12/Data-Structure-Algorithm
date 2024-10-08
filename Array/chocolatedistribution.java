import java.util.*;

class chocolatedistribution {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        arr.add(x);
      }
      int m = sc.nextInt();

      Solution ob = new Solution();

      System.out.println(ob.findMinDiff(arr, n, m));
    }

  }
}

class Solution {
  public long findMinDiff(ArrayList<Integer> a, int n, int m) {
    Collections.sort(a);
    long res = Long.MAX_VALUE;
    for (int i = 0; i < n - m + 1; i++) {
      int min = a.get(i);
      int max = a.get(i + m - 1);
      res = Math.min(res, max - min);
    }
    return res;
  }
}
