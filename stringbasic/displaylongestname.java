import java.util.*;

public class displaylongestname {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume the newline character
    while (t-- > 0) {
      List<String> names = new ArrayList<>();
      String input1 = sc.nextLine();
      @SuppressWarnings("resource")
      Scanner ss1 = new Scanner(input1);
      while (ss1.hasNext()) {
        names.add(ss1.next());
      }
      Solution obj = new Solution();
      String res = obj.longest(names);
      System.out.println(res);
    }
  }
}

// } Driver Code Ends

class Solution {
  public String longest(List<String> names) {
    String longestname = names.get(0);

    for (String string : names) {
      if (string.length() > longestname.length()) {
        longestname = string;
      }
    }
    return longestname;
  }
}
