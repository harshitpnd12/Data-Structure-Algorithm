import java.io.*;
import java.util.*;

class productarraypuzzle {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = sc.nextInt();
      }
      Solution ob = new Solution();
      long[] ans = new long[n];
      ans = ob.productExceptSelf(array);

      for (int i = 0; i < n; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
      t--;
    }
  }
}

class Solution {
  public static long[] productExceptSelf(int nums[]) {
    long[] num = new long[nums.length];
    num[0] = 1;
    int n = nums.length;
    for (int i = 1; i < n; i++) {
      num[i] = num[i - 1] * nums[i - 1];
    }

    long suffixProduct = 1;

    for (int i = n - 1; i >= 0; i--) {
      num[i] = num[i] * suffixProduct;
      suffixProduct *= nums[i];
    }
    return num;
  }
}
