import java.util.*;

public class majorityvote {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume the newline character

    while (t-- > 0) {
      String s = sc.nextLine();
      String[] parts = s.split(" ");
      List<Integer> nums = new ArrayList<>();
      for (String part : parts) {
        nums.add(Integer.parseInt(part));
      }
      Solution ob = new Solution();
      List<Integer> ans = ob.findMajority(nums);
      for (int num : ans) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
// } Driver Code Ends

class Solution {
  public List<Integer> findMajority(List<Integer> nums) {
    int n = nums.size();
    if (n == 0) {
      return new ArrayList<>();
    }
    int a = -1, b = -1, c1 = 0, c2 = 0;
    for (Integer num : nums) {
      if (num == a) {
        c1++;
      } else if (num == b) {
        c2++;
      } else if (c1 == 0) {
        a = num;
        c1 = 1;
      } else if (c2 == 0) {
        b = num;
        c2 = 1;
      } else {
        c1--;
        c2--;
      }
    }
    c1 = 0;
    c2 = 0;
    for (int i = 0; i < n; i++) {
      if (nums.get(i) == a) {
        c1++;
      } else if (nums.get(i) == b) {
        c2++;
      }
    }
    List<Integer> list = new ArrayList<>();
    if (c1 > n / 3) {
      list.add(a);
    }
    if (c2 > n / 3) {
      list.add(b);
    }
    return list.isEmpty() ? List.of(-1) : list;
  }
}
