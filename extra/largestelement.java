import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class largestelement {
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String input = br.readLine();
      String[] inputs = input.split(" ");
      int[] arr = new int[inputs.length];
      for (int i = 0; i < inputs.length; i++) {
        arr[i] = Integer.parseInt(inputs[i]);
      }
      Solution obj = new Solution();
      int res = obj.largest(arr);

      System.out.println(res);
    }
  }

  public class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
      String[] s = br.readLine().trim().split(" ");
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(s[i]);
      {
        return a;
      }
    }

    public static void print(int[] a) {
      for (int e : a)
        System.out.print(e + " ");
      System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
      for (int e : a)
        System.out.print(e + " ");
      System.out.println();

    }
  }
}

class Solution {
  public static int largest(int[] arr) {
    int larges = arr[0];
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > larges) {
        larges = arr[i];
      }
    }
    return larges;
  }
}

class Solutions {
  public boolean findTriplet(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] == arr[k] ||
              arr[i] + arr[k] == arr[j] ||
              arr[j] + arr[k] == arr[i]) {
            return true;
          }
        }
      }
    }
    return false;
  }
}