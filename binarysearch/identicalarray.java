import java.util.*;

// { Driver Code Starts.
public class identicalarray {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0) {
      String line = sc.nextLine();
      List<Integer> arr1 = new ArrayList<>();
      Scanner lineScanner = new Scanner(line);
      while (lineScanner.hasNextInt()) {
        arr1.add(lineScanner.nextInt());
      }
      line = sc.nextLine();
      List<Integer> arr2 = new ArrayList<>();
      lineScanner = new Scanner(line);
      while (lineScanner.hasNextInt()) {
        arr2.add(lineScanner.nextInt());
      }
      Solution ob = new Solution();
      boolean ans = ob.isIdentical(arr1, arr2);
      if (ans) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
      lineScanner.close();
    }
    sc.close();
  }
}

class Solution {
  public boolean isIdentical(List<Integer> arr1, List<Integer> arr2) {
    if (arr1.size() != arr2.size()) {
      return false;
    }
    Collections.sort(arr1);
    Collections.sort(arr2);
    return arr1.equals(arr2);
  }
}