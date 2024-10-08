import java.util.*;

public class Secondlargest {

  @SuppressWarnings("resource")
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0) {
      String[] arr1Str = sc.nextLine().split(" ");
      int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
      Solution ob = new Solution();
      int ans = ob.print2largest(arr);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  public int print2largest(int[] arr) {
    int max1 = arr[0];
    int max2 = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max1) {
        max1 = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max2 && arr[i] != max1) {
        max2 = arr[i];
      }
    }
    return max2;
  }
}
