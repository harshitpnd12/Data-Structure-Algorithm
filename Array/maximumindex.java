import java.util.*;

public class maximumindex {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int t = Integer.parseInt(scanner.nextLine().trim());

    while (t-- > 0) {
      String line = scanner.nextLine().trim();
      String[] numsStr = line.split(" ");
      int[] nums = new int[numsStr.length];
      for (int i = 0; i < numsStr.length; i++) {
        nums[i] = Integer.parseInt(numsStr[i]);
      }

      Solution ob = new Solution();
      System.out.println(ob.maxIndexDiff(nums));
    }
  }
}

class Solution {
  int maxIndexDiff(int[] arr) {
    return 0;
  }
}