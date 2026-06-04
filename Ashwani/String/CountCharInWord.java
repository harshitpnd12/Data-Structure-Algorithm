public class CountCharInWord {
  public static void main(String[] args) {
    String str = "harshitpandey";
    countChar(str);
  }

  public static void countChar(String str) {
    int arr[] = new int[26];
    for (int i = 0; i < str.length(); i++) {
      int index = str.charAt(i) - 97;
      arr[index]++;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 1) {
        char c = (char) (i + 97);
        System.out.println("The number of occurence of" + c + ": " + arr[i]);
      }
    }
  }
}
