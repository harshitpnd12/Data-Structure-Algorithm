public class Countabc {
  public static void main(String[] args) {
    String str = "aaabbbcccdde";
    countabc(str);
  }

  public static void countabc(String str) {
    int arr[] = new int[26];
    for (int i = 0; i < str.length(); i++) {
      int index = str.charAt(i) - 97;
      arr[index]++;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        char c = (char) (i + 97);
        int p = arr[i];
        System.out.print(c + "" + p);
      }
    }
  }
}
