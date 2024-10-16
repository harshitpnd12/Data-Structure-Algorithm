import java.io.*;

class unionoftwoelement {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine().trim());

    while (t-- > 0) {
      // Reading the first array
      String line1 = read.readLine().trim();
      String[] numsStr1 = line1.split(" ");
      int[] a = new int[numsStr1.length];
      for (int i = 0; i < numsStr1.length; i++) {
        a[i] = Integer.parseInt(numsStr1[i]);
      }

      // Reading the second array
      String line2 = read.readLine().trim();
      String[] numsStr2 = line2.split(" ");
      int[] b = new int[numsStr2.length];
      for (int i = 0; i < numsStr2.length; i++) {
        b[i] = Integer.parseInt(numsStr2[i]);
      }

      // Creating an instance of the Solution class
      Solution ob = new Solution();

      // Calling doUnion method and printing the result
      System.out.println(ob.findUnion(a, b));
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
  public static int findUnion(int a[], int b[]) {
    HashSet<Integer> unionSet = new HashSet<>();

    // Add elements from the first array
    for (int num : a) {
      unionSet.add(num);
    }

    // Add elements from the second array
    for (int num : b) {
      unionSet.add(num);
    }

    // Return the size of the HashSet which represents the number of distinct
    // elements in the union
    return unionSet.size();
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 2, 3, 4 };
    int[] b = { 3, 4, 4, 5, 6 };

    int unionCount = findUnion(a, b);
    System.out.println("Number of elements in the union: " + unionCount);
  }
}