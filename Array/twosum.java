
//{ Driver Code Starts
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

class IntMatrix {
  public static int[][] input(BufferedReader br, int n, int m) throws IOException {
    int[][] mat = new int[n][];

    for (int i = 0; i < n; i++) {
      String[] s = br.readLine().trim().split(" ");
      mat[i] = new int[s.length];
      for (int j = 0; j < s.length; j++)
        mat[i][j] = Integer.parseInt(s[j]);
    }

    return mat;
  }

  public static void print(int[][] m) {
    for (var a : m) {
      for (int e : a)
        System.out.print(e + " ");
      System.out.println();
    }
  }

  public static void print(ArrayList<ArrayList<Integer>> m) {
    for (var a : m) {
      for (int e : a)
        System.out.print(e + " ");
      System.out.println();
    }
  }
}

class twosum {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String line = br.readLine();
      String[] tokens = line.split(" ");

      // Create an ArrayList to store the integers
      ArrayList<Integer> array = new ArrayList<>();

      // Parse the tokens into integers and add to the array
      for (String token : tokens) {
        array.add(Integer.parseInt(token));
      }

      int[] arr = new int[array.size()];
      int idx = 0;
      for (int i : array)
        arr[idx++] = i;

      Solution obj = new Solution();
      ArrayList<ArrayList<Integer>> res = obj.getPairs(arr);
      if (res.size() == 0) {
        System.out.println();
      } else {
        IntMatrix.print(res);
      }
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int left = 0, right = n - 1;
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == 0) {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(arr[left]);
        pair.add(arr[right]);
        list.add(pair);
        left++;
        right--;
        while (left < right && arr[left] == arr[left - 1]) {
          left++;
        }
        while (left < right && arr[right] == arr[right + 1]) {
          right--;
        }
      } else if (sum < 0) {
        left++;
      } else {
        right--;
      }
    }
    return list;
  }
}

// next question on two sum

class Solutions {
  boolean twoSum(int arr[], int target) {
    int start = 0, end = arr.length;
    Arrays.sort(arr);
    while (start < end) {
      int sum = arr[start] + arr[end];
      if (sum == target) {
        return true;
      } else if (sum < target) {
        start++;
      } else {
        end--;
      }
    }
    return false;
  }
}