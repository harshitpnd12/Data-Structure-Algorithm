import java.util.Scanner;

// { Driver Code Starts.
public class maxdisbw2occ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String input = sc.nextLine();
      String[] parts = input.split(" ");
      int[] arr = new int[parts.length];
      for (int i = 0; i < parts.length; i++) {
        arr[i] = Integer.parseInt(parts[i]);
      }
      Solution ob = new Solution();
      System.out.println(ob.maxDistance(arr));
    }
    sc.close();
  }
}
// } Driver Code Ends

class Solution {
  public int maxDistance(int[] arr) {
    int left = 0, right = arr.length - 1;
    int max = 0;
    while (left < right) {
      if (arr[left] == arr[right]) {
        max = Math.max(max, right - left);
        right--;
      } else if (arr[left] != arr[right]) {
        right--;
      }
      if (left == right) {
        left++;
        right = arr.length - 1;
      }
    }
    return max;
  }
}

class Secondmethod {
  public int maxDistance(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[i] == arr[j]) {
          max = Math.max(max, j - i);
          break;
        }
      }
    }
    return max;
  }
}