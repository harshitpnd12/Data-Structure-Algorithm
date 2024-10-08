import java.io.*;

class rotatearrays {
  @SuppressWarnings("static-access")
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    @SuppressWarnings("unused")
    PrintWriter out = new PrintWriter(System.out);
    // taking testcases
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String str = br.readLine();
      String[] starr = str.split(" ");

      // input n and d
      int n = Integer.parseInt(starr[0]);
      int d = Integer.parseInt(starr[1]);

      int[] arr = new int[n];
      String str1 = br.readLine();
      String[] starr1 = str1.split(" ");

      // inserting elements in the array
      for (int j = 0; j < n; j++) {
        arr[j] = Integer.parseInt(starr1[j]);
      }

      // calling rotateArr() function
      new Solution().rotateArr(arr, d, n);
      StringBuffer sb = new StringBuffer();

      // printing the elements of the array
      for (int t1 = 0; t1 < n; t1++)
        sb.append(arr[t1] + " ");
      System.out.println(sb);
    }
  }
}

class Solution {
  static void rotateArr(int arr[], int d, int n) {
    if (n == 0) {
      return;
    }
    d = d % n;
    int[] temp = new int[d];

    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
    }
  }
}