import java.util.*;

public class twoswaps {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = Integer.parseInt(scanner.nextLine()); // Read number of test cases

    // Loop through each test case
    while (t-- > 0) {
      String input = scanner.nextLine();
      String[] inputArr = input.split(" ");
      List<Integer> arr = new ArrayList<>();

      // Convert input to list of integers
      for (String str : inputArr) {
        arr.add(Integer.parseInt(str));
      }

      Solution ob = new Solution();
      boolean ans = ob.checkSorted(arr);

      // Output result
      if (ans)
        System.out.println("true");
      else
        System.out.println("false");
    }

    scanner.close();
  }
}

// } Driver Code Ends

class Solution {

  public boolean checkSorted(List<Integer> arr) {
    List<Integer> sortedList = new ArrayList<>(arr);
    Collections.sort(sortedList);

    List<Integer> mismatchIndices = new ArrayList<>();

    for (int i = 0; i < arr.size(); i++) {
      if (!arr.get(i).equals(sortedList.get(i))) {
        mismatchIndices.add(i);
      }
    }

    if (mismatchIndices.size() == 0) {
      return true;
    }

    if (mismatchIndices.size() == 2) {
      int i = mismatchIndices.get(0);
      int j = mismatchIndices.get(1);
      Collections.swap(arr, i, j);
      return arr.equals(sortedList);
    }

    int first = mismatchIndices.get(0);
    int last = mismatchIndices.get(mismatchIndices.size() - 1);
    List<Integer> subList = arr.subList(first, last + 1);
    Collections.reverse(subList);

    return arr.equals(sortedList);
  }
}
