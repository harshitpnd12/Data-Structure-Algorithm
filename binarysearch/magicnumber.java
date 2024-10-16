import java.util.*;

public class magicnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());

    while (t-- > 0) {
      String line = sc.nextLine();
      String[] tokens = line.split(" ");
      int[] nums = new int[tokens.length];
      for (int i = 0; i < tokens.length; i++) {
        nums[i] = Integer.parseInt(tokens[i]);
      }
      Solution ob = new Solution();
      int res = ob.findMagicalNumber(nums);

      System.out.println(res);
    }
    sc.close();
  }
}

class Solution {
  public int findMagicalNumber(int[] arr) {
    int n = arr.length;
    int start = 0, end = n - 1;
    int mno = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == mid) {
        mno = mid;
        end = mid - 1;
      } else if (arr[mid] < mid) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return mno;
  }
}
