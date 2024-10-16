
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Arrayleader {

  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter ot = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

    while (t-- > 0) {

      // input size of array
      int n = Integer.parseInt(br.readLine().trim());
      int arr[] = new int[n];
      String inputLine[] = br.readLine().trim().split(" ");

      // inserting elements in the array
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }

      Solution obj = new Solution();

      @SuppressWarnings("unused")
      StringBuffer str = new StringBuffer();
      ArrayList<Integer> res = new ArrayList<Integer>();

      // calling leaders() function
      res = obj.leaders(n, arr);

      for (int i = 0; i < res.size(); i++) {
        ot.print(res.get(i) + " ");
      }

      ot.println();
    }
    ot.close();
  }
}

// } Driver Code Ends

class Solution {
  static ArrayList<Integer> leaders(int n, int arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      boolean isleader = true;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          isleader = false;
          break;
        }
      }
      if (isleader == true) {
        list.add(arr[i]);
      }
    }
    return list;
  }
}

class Solutionss {
  static ArrayList<Integer> leaders(int n, int arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int max = arr[n - 1];
    list.add(max);
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] >= max) {
        max = arr[i];
        list.add(arr[i]);
      }
    }
    Collections.reverse(list);
    return list;
  }
}

class Solutions {
  static ArrayList<Integer> leaders(int n, int arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int max = arr[arr.length - 1];
    list.add(max);
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] >= max) {
        max = arr[i];
        list.add(max);
      }
    }
    Collections.reverse(list);
    return list;
  }
}
