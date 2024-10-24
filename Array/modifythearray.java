//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class modifythearray {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());

    while (t-- > 0) {

      ArrayList<Integer> array1 = new ArrayList<Integer>();
      String line = read.readLine();
      String[] tokens = line.split(" ");
      for (String token : tokens) {
        array1.add(Integer.parseInt(token));
      }
      ArrayList<Integer> v = new ArrayList<Integer>();
      int[] arr = new int[array1.size()];
      int idx = 0;
      for (int i : array1)
        arr[idx++] = i;

      v = new Solution().modifyAndRearrangeArr(arr);

      for (int i = 0; i < v.size(); i++)
        System.out.print(v.get(i) + " ");

      System.out.println();

      System.out.println("~");
    }
  }
}

class Solution {
  static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] != 0 && arr[i] == arr[i + 1]) {
        arr[i] *= 2;
        arr[i + 1] = 0;
      }
    }

    int index = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        arr[index++] = arr[i];
      }
    }

    while (index < n) {
      arr[index++] = 0;
    }

    ArrayList<Integer> result = new ArrayList<>();
    for (int num : arr) {
      result.add(num);
    }
    return result;
  }
}
