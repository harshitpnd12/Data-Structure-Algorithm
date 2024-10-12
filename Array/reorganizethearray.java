
//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// } Driver Code Ends

// { Driver Code Starts.
public class reorganizethearray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine();

    Solution solution = new Solution();

    while (t-- > 0) {
      String input = scanner.nextLine();
      String[] inputArr = input.split("\\s+");
      List<Integer> arr = new ArrayList<>();
      for (String s : inputArr) {
        arr.add(Integer.parseInt(s));
      }

      List<Integer> ans = solution.rearrange(arr);

      for (int num : ans) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
// } Driver Code Ends

class Solution {
  public List<Integer> rearrange(List<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      while (arr.get(i) != i && arr.get(i) != -1) {
        int correctidx = arr.get(i);
        if (arr.get(correctidx) == correctidx) {
          break;
        }
        int temp = arr.get(correctidx);
        arr.set(correctidx, arr.get(i));
        arr.set(i, temp);
      }
    }
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) != i) {
        arr.set(i, -1);
      }
    }
    return arr;
  }
}