import java.io.*;
import java.util.*;

class rotateanddelete {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String line = br.readLine();
      String[] tokens = line.split(" ");

      // Create an ArrayList to store the integers
      ArrayList<Integer> arr = new ArrayList<>();

      // Parse the tokens into integers and add to the array
      for (String token : tokens) {
        arr.add(Integer.parseInt(token));
      }

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      int res = obj.rotateDelete(arr);

      System.out.println(res);
    }
  }
}

class Solution {
  public static int rotateDelete(ArrayList<Integer> arr) {
    int k = 1;
    while (arr.size() > 1) {
      int n = arr.size();
      Collections.rotate(arr, 1);
      int r = (n - k) % n;
      if (r > 0) {
        arr.remove(r);
      } else {
        arr.remove(0);
      }
      k++;
    }
    return arr.get(0);
  }
}