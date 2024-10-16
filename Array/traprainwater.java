import java.io.*;

class traprainwater {

  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {

      // size of array
      int n = Integer.parseInt(br.readLine().trim());
      int arr[] = new int[n];
      String inputLine[] = br.readLine().trim().split(" ");

      // adding elements to the array
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }

      Solution obj = new Solution();

      // calling trappingWater() function
      System.out.println(obj.trappingWater(arr));
    }
  }
}

// } Driver Code Ends

class Solution {
  static long trappingWater(int arr[]) {
    int n = arr.length;
    if (n <= 2)
      return 0;
    long totalwater = 0;
    int left = 0, right = n - 1;
    int leftMax = 0, rightMax = 0;
    while (left <= right) {
      if (arr[left] <= arr[right]) {
        if (arr[left] >= leftMax) {
          leftMax = arr[left];
        } else {
          totalwater += leftMax - arr[left];
        }
        left++;
      } else {
        if (arr[right] >= rightMax) {
          rightMax = arr[right];
        } else {
          totalwater += rightMax - arr[right];
        }
        right--;
      }
    }
    return totalwater;
  }
}
