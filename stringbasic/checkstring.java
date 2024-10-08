import java.util.*;

class checkstring {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      String s = sc.next();
      if (new Sol().check(s))
        System.out.println("YES");
      else
        System.out.println("NO");
    }

  }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends

// User function Template for Java
class Sol {
  Boolean check(String s) {
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(i - 1)) {
        return false;
      }
    }
    return true;
  }
}