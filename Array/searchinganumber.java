import java.util.*;

public class searchinganumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume newline character after reading t

    Solution obj = new Solution(); // Instantiate the Solution object outside the loop

    while (t-- > 0) {
      int k = sc.nextInt();
      sc.nextLine(); // Consume newline character after reading k

      String line = sc.nextLine();
      @SuppressWarnings("resource")
      Scanner ss = new Scanner(line);
      ArrayList<Integer> arr = new ArrayList<>();
      while (ss.hasNextInt()) {
        arr.add(ss.nextInt());
      }

      int res = obj.search(k, arr);
      System.out.println(res);
    }

    sc.close(); // Close the scanner
  }
}

class Solution {
  public int search(int k, ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == k) {
        return i + 1;
      }
    }
    return -1;
  }
}

class Solutions {
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}