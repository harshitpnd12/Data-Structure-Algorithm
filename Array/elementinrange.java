import java.io.*;

class elementinrange {

  // Driver code
  public static void main(String[] args) throws IOException {
    // Taking input using buffered reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testcases = Integer.parseInt(br.readLine());
    // looping through all testcases
    while (testcases-- > 0) {
      // int n = Integer.parseInt(br.readLine());
      String line = br.readLine();
      String[] q = line.trim().split("\\s+");
      int n = Integer.parseInt(q[0]);
      int k = Integer.parseInt(q[1]);
      int y = Integer.parseInt(q[2]);
      String line1 = br.readLine();
      String[] a1 = line1.trim().split("\\s+");
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(a1[i]);
      }

      Solution ob = new Solution();
      boolean ans = ob.check_elements(a, n, k, y);
      // System.out.println(ob.shuffleArray(a,n,k,y));
      if (ans)
        System.out.println("True");
      else
        System.out.println("False");
    }
  }
}

class Solution {
  boolean check_elements(int arr[], int n, int A, int B) {
    return false;
  }
}