import java.util.Scanner;

class sqrootofnumber {
  public static void main(String args[]) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      long a = sc.nextInt();
      Solution obj = new Solution();
      System.out.println(obj.floorSqrt(a));
      t--;
    }
  }
}

class Solution {
  long floorSqrt(long n) {
    if (n == 0 || n == 1) {
      return n;
    }
    long start = 1, end = n, result = 0;
    while (start <= end) {
      long mid = (start + end) / 2;
      if (mid * mid == n) {
        return mid;
      }
      if (mid * mid < n) {
        start = mid + 1;
        result = mid;
      } else {
        end = mid - 1;
      }
    }
    return result;
  }
}
