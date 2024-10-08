import java.io.*;

class rotateanarray {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine().trim());

    while (t-- > 0) {
      String line = read.readLine().trim();
      String[] numsStr = line.split(" ");
      int[] nums = new int[numsStr.length];
      for (int i = 0; i < numsStr.length; i++) {
        nums[i] = Integer.parseInt(numsStr[i]);
      }

      int d = Integer.parseInt(read.readLine().trim());

      new Solution().leftRotate(nums, d);
      for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
      }
      System.out.println();
    }
  }
}

class Solution {
  void leftRotate(int arr[], int d) {
    int n = arr.length;
    if (n == 0) {
      return;
    }
    for (int i = d; i < arr.length; i++) {
      arr[i] = arr[i - 2];
    }
    for (int i = n - 1; i < n - d - 1; i--) {
      arr[i] = arr[i - d];
    }
  }
}
