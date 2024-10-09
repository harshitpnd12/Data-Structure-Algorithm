import java.io.*;

class splitaarray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] s = br.readLine().trim().split(" ");

      int[] arr = new int[s.length];
      for (int i = 0; i < arr.length; i++)
        arr[i] = Integer.parseInt(s[i]);

      Solution obj = new Solution();
      boolean res = obj.canSplit(arr);
      System.out.println(res);
    }
  }
}

class Solution {
  public boolean canSplit(int arr[]) {
    int left = 0, total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    if (total % 2 == 1) {
      return false;
    }
    for (int i = 0; i < arr.length; i++) {
      left += arr[i];
      if (left == total / 2) {
        return true;
      }
    }
    return false;
  }
}