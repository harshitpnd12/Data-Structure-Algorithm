import java.io.*;
import java.util.*;

class Pair<K, V> {
  private final K key;
  private final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

class minmax {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String line = br.readLine();
      String[] tokens = line.split(" ");

      // Create an ArrayList to store the integers
      ArrayList<Integer> array = new ArrayList<>();

      // Parse the tokens into integers and add to the array
      for (String token : tokens) {
        array.add(Integer.parseInt(token));
      }

      int[] arr = new int[array.size()];
      int idx = 0;
      for (int i : array)
        arr[idx++] = i;

      Solution ob = new Solution();
      Pair<Long, Long> pp = ob.getMinMax(arr);
      System.out.println(pp.getKey() + " " + pp.getValue());
    }
  }
}

class Solution {
  public Pair<Long, Long> getMinMax(int[] arr) {
    long min = arr[0];
    long max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }

      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return new Pair<>(min, max);
  }
}