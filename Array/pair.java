import java.io.*;

// { Driver Code Starts.
class pair {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {
      String[] inputLine = br.readLine().trim().split(" ");
      int k = Integer.parseInt(inputLine[0]);

      inputLine = br.readLine().trim().split(" ");
      int[] arr = new int[inputLine.length];
      for (int i = 0; i < inputLine.length; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }

      Solution obj = new Solution();
      int res = obj.countPair(k, arr);
      System.out.println(res);
    }
  }
}

class Solution {

  int countPair(int k, int arr[]) {
    int left = 0;
    int right = arr.length;
    int count = 0;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == k) {
        count++;
        left++;
        right--;
      } else if (sum < k) {
        left++;
      } else {
        right--;
      }
    }
    return count;
  }
}