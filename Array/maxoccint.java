import java.io.*;

class maxoccint {

  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
    while (t-- > 0) {

      // taking size of array
      int n = Integer.parseInt(br.readLine().trim());
      int l[] = new int[n];
      int r[] = new int[n];
      String inputLine[] = br.readLine().trim().split(" ");

      // adding elements to array L
      for (int i = 0; i < n; i++) {
        l[i] = Integer.parseInt(inputLine[i]);
      }
      inputLine = br.readLine().trim().split(" ");
      int maxx = Integer.MIN_VALUE;

      // adding elements to array R
      for (int i = 0; i < n; i++) {
        r[i] = Integer.parseInt(inputLine[i]);
        if (r[i] > maxx) {
          maxx = r[i];
        }
      }

      Solution obj = new Solution();

      // calling maxOccured() function
      System.out.println(obj.maxOccured(n, l, r, maxx));
    }
  }
}

class Solution {
  public static int maxOccured(int n, int l[], int r[], int maxx) {
    int[] arr = new int[maxx + 2];
    for (int i = 0; i < n; i++) {
      arr[l[i]]++;
      if (r[i] + 1 <= maxx) {
        arr[r[i] + 1]--;
      }
    }
    int max = arr[0];
    int result = 0;

    for (int i = 1; i <= maxx; i++) {
      arr[i] += arr[i - 1];

      if (arr[i] > max) {
        max = arr[i];
        result = i;
      }
    }
    return result;
  }
}
