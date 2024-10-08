import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class thirdlargestelement {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String line = br.readLine();
      String[] tokens = line.split(" ");
      ArrayList<Long> array = new ArrayList<>();

      for (String token : tokens) {
        array.add(Long.parseLong(token));
      }

      int[] arr = new int[array.size()];
      int idx = 0;
      for (long i : array)
        arr[idx + 1] = (int) i;
      Solution obj = new Solution();
      System.out.println(obj.thirdLargest(arr));
    }
  }
}

class Solution {
  int thirdLargest(int arr[]) {
    if (arr.length < 3) {
      return -1;
    }
    Arrays.sort(arr);
    return arr(arr.length - 3);
  }
}