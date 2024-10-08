//{ Driver Code Starts
// // Initial Template for Java

import java.io.*;
import java.util.*;

class rotatearray {
  public static void main(String[] args) throws IOException {
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
      Solution ob = new Solution();
      ob.rotate(arr);
      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}

class Solution {
  public void rotate(int[] arr) {
    int n = arr.length;
    int last = arr[n - 1];
    if (n == 0) {
      return;
    }
    for (int i = n - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = last;
  }
}