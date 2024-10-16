import java.io.*;
import java.util.*;

class IntArray {
  public static int[] input(BufferedReader br, int n) throws IOException {
    String[] s = br.readLine().trim().split(" ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(s[i]);

    return a;
  }

  public static void print(int[] a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }

  public static void print(ArrayList<Integer> a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }
}

class arrayduplicate {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {

      int n;
      n = Integer.parseInt(br.readLine());

      int[] arr = IntArray.input(br, n);

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      ArrayList<Integer> res = obj.duplicates(arr);

      IntArray.print(res);
    }
  }
}

// } Driver Code Ends

class Solution {
  public static ArrayList<Integer> duplicates(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    int[] a = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      a[arr[i]] += 1;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 1) {
        list.add(i);
      }
    }
    if (list.size() == 0) {
      list.add(-1);
    }
    return list;
  }
}

class Solutions {
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }
}
